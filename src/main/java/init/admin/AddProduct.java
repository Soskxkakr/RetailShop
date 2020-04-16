/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package init.admin;

import pkg.GenerateId;
import pkg.ReadFile;
import pkg.Serializer;
import configs.Config;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;


import org.json.JSONObject;
/**
 *
 * @author Hendika
 */
public class AddProduct extends GenerateId {
private ReadFile RF =  new ReadFile();
private Config CONFIG = new Config();
private Serializer Converter = new Serializer();
private int IncrementedID;

public void addProduct () {
Map <String,String> AddProduct = new HashMap<>();
AddProduct.put("ID", ""+IncrementedID);
AddProduct.put("Name", "");
AddProduct.put("Price", "");
AddProduct.put("Quantity", "");

try{
    CONFIG.setConfigVar("ITEM_JSON_PATH");
    JSONObject ProductDataJson = RF.getJSONObject(getClass().getResource(CONFIG.getConfigVar()).toURI() );
    Map <String, ArrayList<Map<String,String>>> ProductMap = Converter.JSONToMap(ProductDataJson);
    for (ArrayList<Map<String,String>> ProductCollection : ProductMap.values()){
        ProductCollection.add(AddProduct);
    }
    String Map = Converter.MapToString(ProductMap);
    FileWriter file = new FileWriter(RF.getFileName());
    file.write(Map.toString());
    file.close();   
}catch (Exception e){
    e.printStackTrace();
}
}
    @Override
    public int GenerateID() {
        try {
            CONFIG.setConfigVar("ITEM_JSON_PATH");
            JSONObject CustomerDataJson = RF.getJSONObject(getClass().getResource(CONFIG.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> ProductMap = Converter.JSONToMap(CustomerDataJson); // Convert JSON to HashMap
             
            ArrayList ProductIdInt = new ArrayList();         
            for (ArrayList<Map<String, String>> ProductCollection : ProductMap.values()){
                for (Map<String, String> PC : ProductCollection){
                    String ProductInfo = PC.get("ID").substring(1);
                    int ProductId = Integer.parseInt(ProductInfo);
                    ProductIdInt.add(ProductId);
                 }
             }
            IncrementedID = Integer.parseInt( Collections.max(ProductIdInt).toString() ) + 1;            
        } catch (Exception e){
            e.printStackTrace();
        } finally {
             return IncrementedID;}
    }
}
