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
public class AdminService extends GenerateId {
    
    private Config config = new Config();
    private ReadFile fileReader = new ReadFile();
    private Serializer convert = new Serializer();
    private int incrementedId;
    private ArrayList<Map<String, String>> customerList = new ArrayList<>();
    private Map<String, ArrayList<Map<String, String>>> productData = new HashMap<>();
    
    public void addCustomer(){
        JSONArray jArr = new JSONArray();
        JSONObject Jobj;
        
        Map<String, String> addCustomer = new HashMap<>(); 
        addCustomer.put("ID", "C"+incrementedId);// Auto generated ID
        addCustomer.put("Username", "");         //
        addCustomer.put("Password", "");         // Improve Later
        addCustomer.put("Name", "");             //
        addCustomer.put("ContactNo", "");        //
        addCustomer.put("Email", "");            //
        
        try { 
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = convert.toArrayList( fileReader.getJson(getClass().getResource(config.getConfigVar()).toURI()) );
            this.customerList.add(addCustomer);
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write( convert.toString(this.customerList) );
            file.close();
            System.out.println("File has been overwritten");
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
    
    public void addProduct() {
        JSONObject addProduct = new JSONObject();
        addProduct.put("ID", ""+incrementedId);
        addProduct.put("Name", "");
        addProduct.put("Price", "");
        addProduct.put("Quantity", "");

        try{
//            config.setConfigVar("ITEM_JSON_PATH");
//            JSONObject JSONProduct = fileReader.getJSONObject( getClass().getResource(config.getConfigVar()).toURI() );
//            Map<String, ArrayList<JSONObject>> product = converter.JSONToMap(JSONProduct);
//            for (ArrayList<JSONObject> productList : product.values()){
//                productList.add(addProduct);
//            }
//            System.out.println(product);
//            String Map = Converter.MapToString(ProductMap);
//            FileWriter file = new FileWriter(fileReader.getFileName());
//            file.write(Map.toString());
//            file.close();   
        } catch (Exception e){
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
    
    @Override
    public int generateId() {
        try {
//            config.setConfigVar("ITEM_JSON_PATH");
//            JSONObject CustomerDataJson = fileReader.getJSONObject( getClass().getResource(config.getConfigVar()).toURI() );
//            Map<String, ArrayList<Map<String, String>>> ProductMap = converter.JSONToMap(CustomerDataJson); // Convert JSON to HashMap
//             
//            ArrayList ProductIdInt = new ArrayList();         
//            for (ArrayList<Map<String, String>> ProductCollection : ProductMap.values()){
//                for (Map<String, String> PC : ProductCollection){
//                    String ProductInfo = PC.get("ID").substring(1);
//                    int ProductId = Integer.parseInt(ProductInfo);
//                    ProductIdInt.add(ProductId);
//                 }
//             }
//            IncrementedID = Integer.parseInt( Collections.max(ProductIdInt).toString() ) + 1;            
        } catch (Exception e){
            e.printStackTrace();
        } finally {
//             return IncrementedID;
            return 0;
        }
    }
}
