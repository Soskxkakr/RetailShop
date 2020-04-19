package controller;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;
import pkg.GenerateId;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class AdminService extends GenerateId {
    
    private Config config = new Config();
    private ReadFile fileReader = new ReadFile();
    private Serializer converter = new Serializer();
    private int incrementedId;
    private ArrayList<JSONObject> customerList = new ArrayList<JSONObject>();
    
    public void addCustomer (){
        JSONObject addCustomer =new JSONObject(); 
        addCustomer.put("ID", "C"+incrementedId);// Auto generated ID
        addCustomer.put("Username", "");         //
        addCustomer.put("Password", "");         // Improve Later
        addCustomer.put("Name", "");             //
        addCustomer.put("ContactNo", "");        //
        addCustomer.put("Email", "");            //
        
        try { 
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = fileReader.getJSONArray( getClass().getResource(config.getConfigVar()).toURI() );
            this.customerList.add(addCustomer);
            FileWriter file = new FileWriter(fileReader.getFileName());
            file.write(this.customerList.toString());
            file.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void editCustomer (String customerId, String name, String contactNo){
        try {
            config.setConfigVar("CUSTOMER_JSON_PATH");
            this.customerList = fileReader.getJSONArray( getClass().getResource(config.getConfigVar()).toURI() );
            
            for (JSONObject customerData : this.customerList) {
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
            this.customerList = fileReader.getJSONArray( getClass().getResource(config.getConfigVar()).toURI() );
            
            for (Iterator<JSONObject> iter = this.customerList.iterator(); iter.hasNext();) {
                JSONObject customerData = iter.next();
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
            this.customerList = fileReader.getJSONArray( getClass().getResource(config.getConfigVar()).toURI() );
            System.out.println("ID \tName \t\tContactNo \tEmail");
            System.out.println("====================================================================");
            
            for (JSONObject customerData : this.customerList) {
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
    
    public void addProduct () {
        JSONObject addProduct = new JSONObject();
        addProduct.put("ID", ""+incrementedId);
        addProduct.put("Name", "");
        addProduct.put("Price", "");
        addProduct.put("Quantity", "");

        try{
            config.setConfigVar("ITEM_JSON_PATH");
            JSONObject JSONProduct = fileReader.getJSONObject( getClass().getResource(config.getConfigVar()).toURI() );
            Map<String, ArrayList<JSONObject>> product = converter.JSONToMap(JSONProduct);
            for (ArrayList<JSONObject> productList : product.values()){
                productList.add(addProduct);
            }
            System.out.println(product);
//            String Map = Converter.MapToString(ProductMap);
//            FileWriter file = new FileWriter(fileReader.getFileName());
//            file.write(Map.toString());
//            file.close();   
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
