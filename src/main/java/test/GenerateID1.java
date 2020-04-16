/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import configs.Config;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
import pkg.ReadFile;
import pkg.Serializer;

/**
 *
 * @author Hendika
 */
class GenerateID1 {
     private Config CONFIG = new Config();
     private ReadFile RF = new ReadFile();
     private Serializer Converter = new Serializer();
   public void GenerateID1(){ 
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
             int IncrementedID = Integer.parseInt( Collections.max(CustomerIdInt).toString() ) + 1;
             System.out.println(IncrementedID);
         } catch (Exception e){
            e.printStackTrace();
        }
    }
}
