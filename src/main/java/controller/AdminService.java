package controller;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;
import pkg.GenerateId;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.JSONObject;

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
            
            addCustomer.put("ID", "C"+generateId(id));// Auto generated ID
            addCustomer.put("Username", usernameInput);         //
            addCustomer.put("Password", passwordInput);         // Improve Later
            addCustomer.put("Name", nameInput);             //
            addCustomer.put("ContactNo", contactNoInput);        //
            addCustomer.put("Email", emailInput);            //
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
    
    public void removeCustomer(String adminId){
        try{
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
            
            for (Iterator<Map<String, String>> iter = this.customerList.iterator(); iter.hasNext();) {
                Map<String, String> customerData = iter.next();
                if (customerData.get("ID").equals(adminId)){
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
     
    public void searchCustomer(String input){
    try{
        config.setConfigVar("CUSTOMER_JSON_PATH");
        this.customerList = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
        for (Map<String, String> customerCollection : this.customerList) {
            if (input.equals(customerCollection.get("ID").toString())) {
              System.out.println(customerCollection.get("ID")+" "+customerCollection.get("Name")+" "+customerCollection.get("ContactNo")+" "+customerCollection.get("Email"));
            }
        }
        
    }catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void addProduct(String input, String name, String stock, String price) {        
        try{
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
               this.productData.get(productKey).add(newItem);
            }
            
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write(convert.prettyWriting(this.productData).toString()); // pretty writing
            file.close();
        }catch (Exception e){
            e.printStackTrace();
         }
    }
    
    public void editProduct(String productId, String name, String stock, String price){
        try {
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
        }finally {
            return IncrementedID;
        }
    }
}

