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
    
    public OrderService(User user){
        this.user = user;
    }
    
    public void addOrder(CartService cart) {
        // Update Item.json
        try {
            int generatedId = generateId(null);
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            Map<String, ArrayList<Map<String, String>>> itemCollection = convert.toMap(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            ArrayList<Map<String, String>> newOrder = new ArrayList<>();
            
            for ( CartItem item : cart.getCartItems() ) {
                Map<String, String> newItem = new HashMap<>();
                Object totalPrice = Integer.parseInt( item.getPrice() ) * Integer.parseInt( item.getQuantity() );
                newItem.put("item_id", item.getItemId());
                newItem.put("item_name", item.getItemName());
                newItem.put("quantity", item.getQuantity());
                newItem.put("total_price", totalPrice.toString() );
                newOrder.add(newItem);
            }
            
            itemCollection.put("i"+generatedId, newOrder);
            
            FileWriter itemFile = new FileWriter(fileReader.getFileName());
            itemFile.write( convert.prettyWriting(itemCollection).toString() );
            itemFile.close();
            
            // Update Order.json
            fileReader.clear();
            config.setConfigVar("ORDER_JSON_PATH");
            ArrayList<Map<String, String>> orderList = convert.toArrayList(fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            Map<String, String> newOrder2 = new HashMap<>();
            
            newOrder2.put("id", "generatedId"); // AND THIS
            newOrder2.put("userId", "this is a fucking user id"); // THIS
            newOrder2.put("itemId", "i"+generatedId);
            
            orderList.add(newOrder2);
            
            FileWriter orderFile = new FileWriter(fileReader.getFileName());
            orderFile.write( convert.prettyWriting(orderList).toString() );
            orderFile.close();
        } catch (Exception e){
            e.printStackTrace();
        }
       
    }
    
    public boolean viewOrder(String itemId) { // itemId is collected from order.json
        try {
            config.setConfigVar("ITEM_JSON_PATH");
            this.items = convert.toMap(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));            
            
            for ( String itemKey : this.items.keySet() ){
                if ( itemKey.equals(itemId) ){
                    this.itemId = itemId;
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
    
    public void removeOrder(String id){
        // Remove from Item.json
        try{
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
    
    public void searchOrder(String itemId) {
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
                            System.out.println("LMAOOOOOOOOOOOOOOO");
                            System.out.println( itemCollection.get(id) );
                        }
                    }
                    
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public CartService editOrder(CartService cart){
        try {
            Object[] userChoice = { "Edit Quantity", "Remove", "Cancel" };
            
            CartService newCart;
            ArrayList<CartItem> myCart = cart.getCartItems();
            System.out.println( cart.viewCart() );
            System.out.println("Which one do you want to edit");
            String choice = JOptionPane.showInputDialog("Which item would you like to edit");
            
            for ( CartItem item : myCart ) {
                if ( item.getItemName().equals(choice) ) {
                    int manipulate = JOptionPane.showOptionDialog(null, "Edit an Item", "Edit", 0, 0, null, userChoice, userChoice[0]);
                    if (manipulate == 0) {
                        // Edit Quantity
                        String newQuantity = JOptionPane.showInputDialog("Enter Quantity");
                        item.setQuantity(newQuantity);
                    } else if (manipulate == 1) {
                        // Remove Item
                        String name = JOptionPane.showInputDialog("Enter name to delete");
                        cart.removeItem(myCart, name);
                    } else {
                        newCart = new CartService(myCart);
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
    
    @Override
    public int generateId(ArrayList<Integer> ids){
        int incrementedId = 0;
        try {
            fileReader.clear();
            config.setConfigVar("ITEM_JSON_PATH");
            this.items = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            ArrayList CustomerIdInt = new ArrayList();         
                 for (String itemId : this.items.keySet()){
                     String id = itemId.toString().substring(1);
                     int newItemId = Integer.parseInt(id);
                     CustomerIdInt.add(newItemId);
                 }
                 incrementedId = Integer.parseInt( Collections.max(CustomerIdInt).toString() ) + 1;   
         } catch (Exception e){
            e.printStackTrace();
        } finally {
            return incrementedId;
        }
    }
}
