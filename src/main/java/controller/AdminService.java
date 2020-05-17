package controller;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;
import pkg.GenerateId;
import model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.JSONObject;
import pkg.UsernameCheck;

/**
 *
 * @author Reinaldo Taslim
 */
public class AdminService extends OrderService implements GenerateId {
    
    private Config config = new Config();
    private ReadFile fileReader = new ReadFile();
    private Serializer convert = new Serializer();
    private int IncrementedID;
    private ArrayList<Map<String, String>> customerList = new ArrayList<>();
    private Map<String, ArrayList<Map<String, String>>> productData = new HashMap<>();
    private UsernameCheck uc = new UsernameCheck();

    public AdminService(User user) {
        super(user);
        Object[] adminMenu = { "Add", "Delete", "Edit", "View", "Search" };
        int option = JOptionPane.showInternalOptionDialog(null, "Admin " + user.getName(), "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, adminMenu, null);
        if( option == 0 ) {
            Object[] add = { "Add Customer", "Add Product", "Back" };
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
            }
        } else if ( option == 1 ) {
            Object[] del = { "Delete Customer", "Delete Product", "Back" };
            int delOption = JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, del, null);
            if ( delOption == 0 ) {
                viewCustomer();
                String customerId = JOptionPane.showInputDialog("Enter Customer Id to be removed: ");
                removeCustomer(customerId);
            } else if ( delOption == 1 ) {
                viewProduct();
                String category = JOptionPane.showInputDialog("Enter Product's Category to be removed: ");
                String productId = JOptionPane.showInputDialog("Enter Product's Id to be removed: ");
                removeProduct(category, productId);
            }
            
        } else if ( option == 2 ) {
            Object[] edit = { "Edit Customer", "Edit Product", "Back" };
            int editOption = JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, edit, null);
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
            }
        } else if ( option == 3 ) {
            Object[] view = { "View Customer", "View Product", "Back" };
            int viewOption = JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, view, null);
            
            if ( viewOption == 0 ) {
                viewCustomer();
            } else if ( viewOption == 1 ) {
                viewProduct();
            }
        }
    }
    
    public void addCustomer(String usernameInput, String passwordInput, String nameInput, String contactNoInput, String emailInput){  
        try { 
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
            this.customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            for (Map<String, String> customerCollection : this.customerList) {
                if ( input.equals(customerCollection.get("ID").toString()) ) {
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
                        newItem.put("Price", "RM"+ price);
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
        try{
            config.setConfigVar("PRODUCT_JSON_PATH");
            this.productData = convert.toMap( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );
            for (String productKey : this.productData.keySet()){
                for (Map<String, String> productDetail : this.productData.get(productKey) ){
                    if (input.equals(productDetail.get("ID"))) {
                    System.out.println(productDetail.get("ID")+" "+productDetail.get("Name")+" "+productDetail.get("Stock")+" "+productDetail.get("Price"));
                    }
                }   
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public int generateId(ArrayList<Integer> incrementedId) {
        try {
            IncrementedID = Integer.parseInt( Collections.max(incrementedId).toString() ) + 1;   
            System.out.println(IncrementedID);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return IncrementedID;
        }
    }
}

