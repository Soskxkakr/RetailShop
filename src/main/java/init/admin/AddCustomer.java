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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
/**
 *
 * @author Hendika
 */
public class AddCustomer extends GenerateId{
     private Config CONFIG = new Config();
     private ReadFile RF = new ReadFile();
     private Serializer Converter = new Serializer();
     private int IncrementedID;
public void AddCustomer (){
        Map<String, String> AddCustomer = new HashMap<>(); 
        AddCustomer.put("ID", "C"+IncrementedID);//Auto generated ID
        AddCustomer.put("Username", "");         //
        AddCustomer.put("Password", "");         // Improve Later
        AddCustomer.put("Name", "");             //
        AddCustomer.put("ContactNo", "");        //
        AddCustomer.put("Email", "");            //
        
        try { 
            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDataJson = RF.getJSONObject(getClass().getResource(CONFIG.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> CustomerDataMap = Converter.JSONToMap(CustomerDataJson);
            for (ArrayList<Map<String, String>> CustomerCollection : CustomerDataMap.values()){
                CustomerCollection.add(AddCustomer);
            }
            String NewMap = Converter.MapToString(CustomerDataMap); // Convert back to JSON STRING
            FileWriter file = new FileWriter(RF.getFileName());
            file.write(NewMap.toString());
            file.close();
        } catch (Exception e){
            e.printStackTrace();
        }
}
    @Override
    public int GenerateID() {
        try {
            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDataJson = RF.getJSONObject(getClass().getResource(CONFIG.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> CustomerDataMap = Converter.JSONToMap(CustomerDataJson); // Convert JSON to HashMap
             
            ArrayList CustomerIdInt = new ArrayList();         
            for (ArrayList<Map<String, String>> CustomerCollection : CustomerDataMap.values()){
                for (Map<String, String> CC : CustomerCollection){
                    String CustomerInfo = CC.get("ID").substring(1);
                    int CustomerId = Integer.parseInt(CustomerInfo);
                    CustomerIdInt.add(CustomerId);
                 }
             }
            IncrementedID = Integer.parseInt( Collections.max(CustomerIdInt).toString() ) + 1;            
        } catch (Exception e){
            e.printStackTrace();
        } finally {
             return IncrementedID;}
    }
}