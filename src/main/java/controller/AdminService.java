package controller;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;
import pkg.GenerateId;
import pkg.UsernameCheck;
import model.User;
import model.CartItem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Reinaldo Taslim
 */
public class AdminService extends OrderService implements GenerateId {
    
    private Config config = new Config();
    private ReadFile fileReader = new ReadFile();
    private Serializer convert = new Serializer();
    private ArrayList<Map<String, String>> customerList = new ArrayList<>();
    private Map<String, ArrayList<Map<String, String>>> productData = new HashMap<>();
    private UsernameCheck uc = new UsernameCheck();
    private CartItem cart;
    private CartService cartService = new CartService();

    public AdminService(User user) {
        super(user);
        for (;;) {
            Object[] adminMenu = { "Add", "Delete", "Edit", "View", "Search", "Checkout", "Cancel" };
            int option = JOptionPane.showInternalOptionDialog(null, "Admin " + user.getName(), "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, adminMenu, null);
            if( option == 0 ) {
                Object[] add = { "Add Customer", "Add Product", "Add Order", "Back" };
                int addOption = JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, add, null);
                if( addOption == 0 ){
                    for(;;){
                        String customerUsername = JOptionPane.showInputDialog("Username:");
                        uc.CustomerUserName(customerUsername);
                        if ( uc.CustomerUserName(customerUsername) == true ){
                            JOptionPane.showMessageDialog(null, "The username is already exist please try again");
                        } else {
                            String customerPassword = JOptionPane.showInputDialog("Password:");
                            String customerName = JOptionPane.showInputDialog("Name:");
                            String customerContactNo = JOptionPane.showInputDialog("ContactNo:");
                            String customerEmail = JOptionPane.showInputDialog("Email:");
                            addCustomer(customerUsername, customerPassword, customerName, customerContactNo, customerEmail);
                            System.out.println("Customer has been added!");
                            break;
                        }
                    }    
                } else if ( addOption == 1 ) {
                    Object[] product = { "Electronic" , "Utensil" , "Household Appliance" , "Stationery" , "Accessories" };
                    int productOption = JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, product, null);
                    if(productOption == 0) {
                        String productName = JOptionPane.showInputDialog("Name:");
                        String productStock = JOptionPane.showInputDialog("Stock:");
                        String productPrice = JOptionPane.showInputDialog("Price:");
                        addProduct("Electronic", productName, productStock, productPrice);
                    } else if ( productOption == 1 ){
                        String productName = JOptionPane.showInputDialog("Name:");
                        String productStock = JOptionPane.showInputDialog("Stock:");
                        String productPrice = JOptionPane.showInputDialog("Price:");
                        addProduct("Utensil", productName, productStock, productPrice);
                    } else if ( productOption == 2 ) {
                        String productName = JOptionPane.showInputDialog("Name:");
                        String productStock = JOptionPane.showInputDialog("Stock:");
                        String productPrice = JOptionPane.showInputDialog("Price:");
                        addProduct("Household Appliance", productName, productStock, productPrice);
                    } else if ( productOption == 3 ) {
                        String productName = JOptionPane.showInputDialog("Name:");
                        String productStock = JOptionPane.showInputDialog("Stock:");
                        String productPrice = JOptionPane.showInputDialog("Price:");
                        addProduct("Stationery", productName, productStock, productPrice);
                    } else {
                        String productName = JOptionPane.showInputDialog("Name:");
                        String productStock = JOptionPane.showInputDialog("Stock:");
                        String productPrice = JOptionPane.showInputDialog("Price:");
                        addProduct("Accessories", productName, productStock, productPrice);
                    }
                } else if ( addOption == 2 ) {
                    super.viewProduct();
                    for (;;) {
                        String customerInput = JOptionPane.showInputDialog(null, "Enter the item name you want to buy: ").toLowerCase();
                        if ( super.addOrder(customerInput) != null ) {
                            Map<String, String> product = super.addOrder(customerInput);
                            String quantity = JOptionPane.showInputDialog("How many do you want to buy: ");
                            cart = new CartItem(product.get("ID"), product.get("Name"), quantity, product.get("Price"));
                            cartService.addCart(cart);
                            System.out.println( cartService.viewCart() );
                            break;
                        }
                    }
                }
            } else if ( option == 1 ) {
                Object[] del = { "Delete Customer", "Delete Product", "Delete Order", "Back" };
                int delOption = JOptionPane.showInternalOptionDialog(null, "Delete", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, del, null);
                if ( delOption == 0 ) {
                    viewCustomer();
                    String customerId = JOptionPane.showInputDialog("Enter Customer Id to be removed: ");
                    removeCustomer(customerId);
                } else if ( delOption == 1 ) {
                    viewProduct();
                    String category = JOptionPane.showInputDialog("Enter Product's Category to be removed: ");
                    String productId = JOptionPane.showInputDialog("Enter Product's Id to be removed: ");
                    removeProduct(category, productId);
                } else if ( delOption == 2 ) {
                    super.viewOrder();
                    String itemId = JOptionPane.showInputDialog("Enter Item Id to be removed: ");
                    super.removeOrder(itemId);
                }
            } else if ( option == 2 ) {
                Object[] edit = { "Edit Customer", "Edit Product", "Edit Order", "Back" };
                int editOption = JOptionPane.showInternalOptionDialog(null, "Edit", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, edit, null);
                if ( editOption == 0 ) {
                    viewCustomer();
                    String customerId = JOptionPane.showInputDialog("Enter Customer Id to be edited: ");
                    String customerNewName = JOptionPane.showInputDialog("Enter Customer's new name to be edited: ");
                    String customerNewContactNo = JOptionPane.showInputDialog("Enter Customer's new Contact No. to be edited: ");
                    editCustomer(customerId, customerNewName, customerNewContactNo);
                } else if ( editOption == 1 ) {
                    viewProduct();
                    String productId = JOptionPane.showInputDialog("Enter Product's Id to be edited: ");
                    String productNewName = JOptionPane.showInputDialog("Enter Product's new name to be edited: ");
                    String productStock = JOptionPane.showInputDialog("Enter Product's stock to be edited: ");
                    String productPrice = JOptionPane.showInputDialog("Enter Product's price to be edited: ");
                    editProduct(productId, productNewName, productStock, productPrice);
                } else if ( editOption == 2 ) {
                    if ( !cartService.getCartItems().isEmpty() ) {
                        cartService = super.editOrder(cartService);
                    } else {
                        System.out.println("You haven't made any purchase yet");
                    }
                }
            } else if ( option == 3 ) {
                Object[] view = { "View Customer", "View Product", "View Cart", "View Item", "View Order", "Back" };
                int viewOption = JOptionPane.showInternalOptionDialog(null, "View", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, view, null);

                if ( viewOption == 0 ) {
                    viewCustomer();
                } else if ( viewOption == 1 ) {
                    viewProduct();
                } else if ( viewOption == 2 ) {
                    System.out.println( cartService.viewCart() );
                } else if ( viewOption == 3 ) {
                    super.viewItem();
                } else if ( viewOption == 4 ) {
                    super.viewOrder();
                }
            } else if ( option == 4 ) {
                Object[] search = { "Search Customer", "Search Product", "Search Item", "Search Order", "Back" };
                int searchOption = JOptionPane.showInternalOptionDialog(null, "Search", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, search, null);

                if ( searchOption == 0 ) {
                    String customerName = JOptionPane.showInputDialog("Enter customer's name ");
                    searchCustomer(customerName.toLowerCase());
                } else if ( searchOption == 1 ) {
                    String productName = JOptionPane.showInputDialog("Enter product's name ");
                    searchProduct(productName);
                } else if ( searchOption == 2 ) {
                    String itemId = JOptionPane.showInputDialog("Enter item's id ");
                    super.searchItem(itemId);
                } else if ( searchOption == 3 ) {
                    String userId = JOptionPane.showInputDialog("Enter user's id ");
                    super.searchOrder(userId);
                }
            } else if ( option == 5 ) {
                if ( !cartService.getCartItems().isEmpty() ) {
                    System.out.println( cartService.viewCart() );
                    int i = JOptionPane.showInternalConfirmDialog(null, "Would you like to checkout?", "Checkout", JOptionPane.YES_NO_OPTION);
                    if ( i == 0 ) {
                        super.addOrder(cartService);
                    }
                } else if ( cartService.getCartItems().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Your shopping cart is empty!");
                }
            } else {
                break;
            }
        }
    }
    
    public void addCustomer(String usernameInput, String passwordInput, String nameInput, String contactNoInput, String emailInput) {  
        try { 
            fileReader.clear();
            ArrayList<Integer> id = new ArrayList<>();
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = convert.toArrayList( fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            Map<String, String> addCustomer = new HashMap<>(); 
            
            // Loop to get id
            for (Map<String, String> CC : customerList){
                     String CustomerInfo = CC.get("ID").toString().substring(1);
                     id.add(Integer.parseInt(CustomerInfo));
            }
            
            addCustomer.put("ID", "C"+generateId(id));
            addCustomer.put("Username", usernameInput);         
            addCustomer.put("Password", passwordInput);        
            addCustomer.put("Name", nameInput);             
            addCustomer.put("ContactNo", contactNoInput);        
            addCustomer.put("Email", emailInput);            
            this.customerList.add(addCustomer);
            
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write( convert.prettyWriting(this.customerList).toString() );
            file.close();
            System.out.println("Customer has been added");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void editCustomer(String customerId, String name, String contactNo){
        try {
            fileReader.clear();
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            
            for (Map<String, String> customerData : this.customerList) {
                if (customerData.get("ID").equals(customerId)) {
                    customerData.put("Name", name);
                    customerData.put("ContactNo", contactNo);
                }
            }
            
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write(this.customerList.toString());
            file.close();
        } catch (IOException e){
            System.out.println("ERROR : No such file exists in the directory");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void removeCustomer(String customerId){
        try{
            fileReader.clear();
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            
            for (Iterator<Map<String, String>> iter = this.customerList.iterator(); iter.hasNext();) {
                Map<String, String> customerData = iter.next();
                if (customerData.get("ID").equals(customerId)){
                    iter.remove();
                }
            }
            
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write(this.customerList.toString());
            file.close();
        } catch (Exception e){
            e.printStackTrace();
        }  
    }
    
    public void viewCustomer(){
        try {
            fileReader.clear();
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            System.out.println("ID \tName \t\tContactNo \tEmail");
            System.out.println("====================================================================");
            
            for (Map<String, String> customerData : this.customerList) {
                System.out.println(
                                     customerData.get("ID")+"\t"
                                    +customerData.get("Name")+"\t"
                                    +customerData.get("ContactNo")+"\t"
                                    +customerData.get("Email")+"\t"
                    );
            }
        } catch (Exception e){
            e.printStackTrace();
        }   
    }
     
    public void searchCustomer(String input) {
        try {
            fileReader.clear();
            config.setConfigVar("CUSTOMER_JSON_PATH");
            ArrayList<Map<String, String>> customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            
            for (Map<String, String> customerCollection : customerList) {
                if ( input.toLowerCase().equals(customerCollection.get("Name").toString().toLowerCase()) ) {
                    System.out.println(customerCollection.get("ID")+" "+customerCollection.get("Name")+" "+customerCollection.get("ContactNo")+" "+customerCollection.get("Email"));
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void addProduct(String input, String name, String stock, String price) {        
        try{
            fileReader.clear();
            Map<String, String> newItem = new HashMap<>();
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            ArrayList<Integer> id = new ArrayList<>();
            
            for (String productKey : this.productData.keySet()) {
               for (Map<String, String> addProduct : this.productData.get(productKey) ){      
                    if(input.equals(productKey)){
                        String productId = addProduct.get("ID").toString().substring(1);
                        String productIdType = addProduct.get("ID").toString().substring(0,1);
                        id.add(Integer.parseInt(productId));
                        
                        newItem.put("ID", productIdType + generateId(id));
                        newItem.put("Name", name);
                        newItem.put("Stock", stock);
                        newItem.put("Price", price);
                    }
                }
            }
            
            this.productData.get(input).add(newItem);
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write(convert.prettyWriting(this.productData).toString()); // pretty writing
            file.close();
        }catch (Exception e){
            e.printStackTrace();
         }
    }
    
    public void editProduct(String productId, String name, String stock, String price){
        try {
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            
            for ( ArrayList<Map<String, String>> productList : this.productData.values() ) {
                for ( Map<String, String> productDetail : productList ) {
                    if ( productDetail.get("ID").equals(productId) ) {
                        productDetail.put("Name", name);
                        productDetail.put("Stock", stock);
                        productDetail.put("Price", price);
                    }
                }
            }
            
            System.out.println(this.productData);
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write(convert.prettyWriting(this.productData).toString()); // pretty writing
            file.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void removeProduct(String category, String id){
        try {
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            
            for ( String productKey : this.productData.keySet() ){
                if ( productKey.equals(category) ){
                    for ( Iterator<Map<String, String>> iter = this.productData.get(category).iterator(); iter.hasNext(); ){
                        Map<String, String> productDetail = iter.next();
                        System.out.println(productDetail.get("ID"));
                        if ( productDetail.get("ID").equals(id) ) {
                            iter.remove();
                        }
                    }
                }
            }
            
            System.out.println(productData);
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void viewProduct(){
        try {
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            
            System.out.println("====================================================================");
            for ( String productKey : this.productData.keySet() ) {
                System.out.println("\t "+productKey);
                System.out.println("====================================================================");
                for ( Map<String, String> productDetail : this.productData.get(productKey) ) {
                    System.out.println("ID : "+productDetail.get("ID"));
                    System.out.println("Name : "+productDetail.get("Name"));
                    System.out.println("Stock : "+productDetail.get("Stock"));
                    System.out.println("Price : "+productDetail.get("Price"));
                    System.out.println("====================================================================");
                }
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void searchProduct(String input){
        try {
            fileReader.clear();
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            for (String productKey : this.productData.keySet()){
                for (Map<String, String> productDetail : this.productData.get(productKey) ){
                    if (input.toLowerCase().equals(productDetail.get("Name").toLowerCase())) {
                        System.out.println(productDetail.get("ID")+" "+productDetail.get("Name")+" "+productDetail.get("Stock")+" RM "+productDetail.get("Price"));
                    }
                }   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public int generateId(ArrayList<Integer> incrementedIds) {
        int incrementedId = 0;
        try {
            incrementedId = Integer.parseInt( Collections.max(incrementedIds).toString() ) + 1;   
            System.out.println(incrementedId);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return incrementedId;
        }
    }
}

