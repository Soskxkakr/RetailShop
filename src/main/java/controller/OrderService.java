package controller;

import configs.Config;
import java.io.FileWriter;
import pkg.ReadFile;
import pkg.Serializer;
import model.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.swing.JOptionPane;
import model.CartItem;
import model.User;

import org.json.JSONObject;
import pkg.GenerateId;
/**
 *
 * @author Reinaldo Taslim
 */
public class OrderService implements GenerateId {
    
    private String itemId, itemName, quantity, totalPrice;
    private Order userOrder;
    private User user;
    private Config config = new Config();
    private Serializer convert = new Serializer();
    private ReadFile fileReader = new ReadFile();
    private Map<String, ArrayList<Map<String, String>>> items = new HashMap<>();
    private ArrayList<Map<String, String>> order = new ArrayList<>();
    private int incrementedId;
    
    public OrderService() {
        // NOthing
    }
    
    public OrderService(User user){
        this.user = user;
    }
    
    public Map<String, String> addOrder(String itemName) {
        try {
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> products = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            
            for ( ArrayList<Map<String, String>> productList : products.values() ) {
                for ( Map<String, String> productData : productList ) {
                    if ( productData.get("Name").toLowerCase().equals(itemName.toLowerCase()) ) {
                        return productData;
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void addOrder(CartService cart) {
        // Update Item.json
        try {
            ArrayList<Integer> id = new ArrayList<>();
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> itemCollection = convert.toMap(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            ArrayList<Map<String, String>> newOrder = new ArrayList<>();
            
            for ( String itemId : itemCollection.keySet() ){
                     String number = itemId.substring(1);
                     id.add(Integer.parseInt(number));
            }
            
            for ( CartItem item : cart.getCartItems() ) {
                Map<String, String> newItem = new HashMap<>();
                Object totalPrice = Integer.parseInt( item.getPrice() ) * Integer.parseInt( item.getQuantity() );
                newItem.put("item_id", item.getItemId());
                newItem.put("item_name", item.getItemName());
                newItem.put("quantity", item.getQuantity());
                newItem.put("total_price", totalPrice.toString() );
                newOrder.add(newItem);
            }
            
            itemCollection.put("i"+generateId(id), newOrder);
            
            FileWriter itemFile = new FileWriter(fileReader.getFileName());
            itemFile.write( convert.prettyWriting(itemCollection).toString() );
            itemFile.close();
            
            // Update Order.json
            fileReader.clear();
            config.setConfigVar("ORDER_JSON_PATH");
            ArrayList<Map<String, String>> orderList = convert.toArrayList(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            Map<String, String> newOrder2 = new HashMap<>();
            
            newOrder2.put("orderId", UUID.randomUUID().toString()); // AND THIS
            newOrder2.put("userId", this.user.getUserId()); // THIS
            newOrder2.put("itemId", "i"+generateId(id));
            
            orderList.add(newOrder2);
            
            FileWriter orderFile = new FileWriter(fileReader.getFileName());
            orderFile.write( convert.prettyWriting(orderList).toString() );
            orderFile.close();
        } catch (Exception e){
            e.printStackTrace();
        }
       
    }
    
    public boolean viewItem () {
        try {
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> items = convert.toMap(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() )); 
            
            for ( String itemId : items.keySet() ) {
                System.out.println("Item Id: "+itemId);
                System.out.println("=========================================================");                
                for ( Map<String, String> itemData : items.get(itemId) ) {
                    System.out.println("Item Name: "+itemData.get("ItemName"));
                    System.out.println("Quantity: "+itemData.get("Quantity"));
                    System.out.println("Total Price: "+itemData.get("TotalPrice"));
                    System.out.println();
                }
                System.out.println("=========================================================");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public void viewOrder() {
        try {
            int count = 1;
            fileReader.clear();
            config.setConfigVar("ORDER_JSON_PATH");
            ArrayList<Map<String, String>> order = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            System.out.println("=========================================================");
            for ( Map<String, String> orderData : order ) {
                System.out.println( "Order No."+count+" = "+orderData.get("orderId") + " " + orderData.get("userId") + " " + orderData.get("itemId") );
                System.out.println("=========================================================");
                count++;
            }
            count = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean viewOrder(String itemId) { // itemId is collected from order.json
        try {
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            this.items = convert.toMap(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));            
            
            for ( String itemKey : this.items.keySet() ){
                if ( itemKey.equals(itemId) ){
                    this.itemId = itemId;
                    System.out.println( "Order Id: "+this.itemId );
                    System.out.println("=========================================================");
                    for ( Map<String, String> items : this.items.get(itemKey) ){
                        System.out.println("ID : "+items.get("ItemID"));
                        System.out.println("Item : "+items.get("ItemName"));
                        System.out.println("Quantity : "+items.get("Quantity"));
                        System.out.println("Total Price : "+items.get("TotalPrice"));
                        System.out.println("=========================================================");
                    }
                    return true;
                } else {
                    System.out.println("Item ID does not exist in database");
                    return false;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void removeOrder(String id) {
        // Remove from Item.json
        try {
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> itemCollection = convert.toMap(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            
            for (Iterator<String> it = itemCollection.keySet().iterator(); it.hasNext();){
                String itemId = it.next();
                if(itemId.equals(id)){
                    it.remove();
                }
            }
            
            FileWriter itemFile = new FileWriter(fileReader.getFileName());
            itemFile.write( convert.prettyWriting(itemCollection).toString() );
            itemFile.close();
            
            // Remove from Order.json
            fileReader.clear();
            config.setConfigVar("ORDER_JSON_PATH");
            ArrayList<Map<String, String>> orderList = convert.toArrayList(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            
            for (Iterator<Map<String, String>> order = orderList.iterator(); order.hasNext();) {
                Map<String, String> orderData = order.next();
                if (orderData.get("itemId").equals(id)) {
                    order.remove();
                }
            }
            
            FileWriter orderFile = new FileWriter(fileReader.getFileName());
            orderFile.write( convert.prettyWriting(orderList).toString() );
            orderFile.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void searchOrder(String userId) {
        try {
            int count = 1;
            fileReader.clear();
            config.setConfigVar("ORDER_JSON_PATH");
            ArrayList<Map<String, String>> orderList = convert.toArrayList(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) ); 
            
            for ( Map<String, String> orderData : orderList ) {
                if ( orderData.get("userId").toLowerCase().equals(userId.toLowerCase()) ) {
                    System.out.println("Order No."+count);
                    System.out.println("Order Id: "+orderData.get("orderId"));
                    System.out.println("User Id: "+orderData.get("userId"));
                    System.out.println("Item Id: "+orderData.get("itemId"));
                    System.out.println("=========================================================");
                    count++;
                }
            }
            
            count = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void searchOrder(User user) {
        // Open from Order.json
        try {
            fileReader.clear();
            config.setConfigVar("ORDER_JSON_PATH");
            ArrayList<Map<String, String>> orderList = convert.toArrayList(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) ); 
            
            for ( Map<String, String> orderData : orderList ) {
                if ( orderData.get("userId").equals(user.getUserId()) ) {
                    // Open from Item.json
                    fileReader.clear();
                    config.setConfigVar("ITEM_JSON_PATH");
                    Map<String, ArrayList<Map<String, String>>> itemCollection = convert.toMap(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
                    for ( String id : itemCollection.keySet() ) {
                        if ( orderData.get("itemId").equals(id) ) {
                            System.out.println( itemCollection.get(id) );
                        }
                    }
                    
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void searchItem (String itemId) {
        try {
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> itemCollection = convert.toMap(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            
            for ( String id : itemCollection.keySet() ) {
                if ( id.toLowerCase().equals(itemId.toLowerCase()) ) {
                    System.out.println( itemId );
                    System.out.println("=========================================================");
                    for ( Map<String, String> itemDetails : itemCollection.get(itemId) ) {
                        System.out.println( itemDetails.get("ItemID") + " " + itemDetails.get("ItemName") + " " + itemDetails.get("Quantity") + " RM " + itemDetails.get("TotalPrice") );
                        System.out.println("=========================================================");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public CartService editOrder(CartService cart){
        try {
            if ( cart.getCartItems().isEmpty() ) {
                System.out.println("You haven't made any purchase yet");
                return null;
            }
            Object[] userChoice = { "Edit Quantity", "Remove", "Cancel" };
            
            CartService newCart;
            ArrayList<CartItem> myCart = cart.getCartItems();
            System.out.println( cart.viewCart() );
            String choice = JOptionPane.showInputDialog("Which item would you like to edit (Item Name): ");
            
            for ( CartItem item : myCart ) {
                if ( item.getItemName().toLowerCase().equals(choice.toLowerCase()) ) {
                    int manipulate = JOptionPane.showInternalOptionDialog(null, "Editing "+item.getItemName(), " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, userChoice, null);
                    if (manipulate == 0) {
                        // Edit Quantity
                        String newQuantity = JOptionPane.showInputDialog("Enter Quantity");
                        item.setQuantity(newQuantity);
                    } else if (manipulate == 1) {
                        // Remove Item
                        System.out.println("LMAO LOOK AT THIS: "+cart);
                        myCart = cart.removeItem(myCart, item.getItemName().toLowerCase());
                        System.out.println("OH MY GOSH: "+cart);
                    } else {
                        newCart = new CartService(myCart);
                        System.out.println("This is your new Cart");
                        System.out.println( cart.viewCart() );
                        return newCart;  
                    }
                }
            }
            System.out.println(myCart);
            newCart = new CartService(myCart);
            JOptionPane.showMessageDialog(null, "Cart has been edited");
            return newCart;  
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void viewProduct() {
        try {
            int count = 1;
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> products = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            
            for ( String productKey : products.keySet() ) {
                System.out.println("======================================================");
                System.out.println( productKey );
                System.out.println("======================================================");
                for ( Map<String, String> productData : products.get(productKey) ) {
                    System.out.println(count+". Name: "+productData.get("Name")+"   "+productData.get("Price"));
                    count++;
                }
                count = 1;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public int generateId(ArrayList<Integer> ids){
        try {
            incrementedId = Integer.parseInt( Collections.max(ids).toString() ) + 1;   
            System.out.println(incrementedId);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return incrementedId;
        }
    }
}
