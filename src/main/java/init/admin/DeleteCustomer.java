/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package init.admin;

import pkg.ReadFile;
import pkg.Serializer;
import configs.Config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;


/**
 *
 * @author Hendika
 */
public class DeleteCustomer {
    private Config CONFIG = new Config();
    private ReadFile RF = new ReadFile();
    private Serializer Converter = new Serializer();
    
    public void DeleteCustomer(String AdminInput){
        try{
            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDataJson = RF.getJSONObject(getClass().getResource(CONFIG.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> CustomerDataMap = Converter.JSONToMap(CustomerDataJson); // Convert JSON to HashMap
            
            for (ArrayList<Map<String,String>> CustomerDetails : CustomerDataMap.values()){
                for (Iterator<Map<String,String>> Iter = CustomerDetails.iterator(); Iter.hasNext(); ){
                    Map<String,String> CDetails = Iter.next();
                    if (CDetails.get("ID").equals(AdminInput)){
                        Iter.remove();
                    }
                }
            }
            System.out.println("CHECK THIS OUT "+getClass().getResource(CONFIG.getConfigVar()).toExternalForm() );
//            FileWriter FW = new FileWriter(Con.getConfigVar());
            String NewMap = Converter.MapToString(CustomerDataMap);;
//            FW.write(NewMap.toString());
//            System.out.println("IT HAS BEEN REMOVED!");
//            FW.close();
        } catch (Exception e){
            e.printStackTrace();
        }
      
    }
}
