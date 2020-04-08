/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailStore.Admin;

import RetailStore.ReadFile;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author Hendika
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> AddCustomer = new HashMap<>(); 
        AddCustomer.put("ID", "");
        AddCustomer.put("Username", "");
        AddCustomer.put("Password", "");
        AddCustomer.put("Name", "");
        AddCustomer.put("ContactNo", "");
        AddCustomer.put("Email", "");
        Gson JSONConverter = new Gson();
        ReadFile fileReader = new ReadFile();
        JSONObject FileReader = fileReader.getJSONObject("C:\\Users\\Hendika\\Documents\\NetBeansProjects\\RetailStore\\target\\classes\\JSON\\Customer.json");
        Map<String, ArrayList<Map<String, String>>> CustomerDataMap = JSONConverter.fromJson(FileReader.toString(), HashMap.class); // Convert JSON to HashMap
        try {
            for (ArrayList<Map<String, String>> CustomerCollection : CustomerDataMap.values()){
                CustomerCollection.add(AddCustomer);
            }
            String NewMap = JSONConverter.toJson(CustomerDataMap);
            FileWriter file = new FileWriter(("C:\\Users\\Hendika\\Documents\\NetBeansProjects\\RetailStore\\target\\classes\\JSON\\Customer.json"));
            file.write(NewMap.toString());
            file.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
