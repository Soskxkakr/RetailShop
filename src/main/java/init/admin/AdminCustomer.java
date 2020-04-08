package init.admin;

import pkg.ReadFile;
import pkg.Serializer;
import configs.Config;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class AdminCustomer {
    private Config CON = new Config();
    private ReadFile RF = new ReadFile();
    private Serializer Converter = new Serializer();
    
    public void AddCustomer(){
        Map<String, String> AddCustomer = new HashMap<>(); 
        AddCustomer.put("ID", "");          //
        AddCustomer.put("Username", "");    //
        AddCustomer.put("Password", "");    // Improve Later
        AddCustomer.put("Name", "");        //
        AddCustomer.put("ContactNo", "");   //
        AddCustomer.put("Email", "");       //
        
        try {
            CON.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDataJson = RF.getJSONObject( getClass().getResource(CON.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> CustomerDataMap = Converter.JSONToMap(CustomerDataJson);
     
            for (ArrayList<Map<String, String>> CustomerCollection : CustomerDataMap.values()){
                CustomerCollection.add(AddCustomer);
            }
            
            String NewMap = Converter.MapToString(CustomerDataMap); // Cpnvert back to JSON STRING
            
//            FileWriter file = new FileWriter(RF.getFileName());
            System.out.println("WRITING COMPLETED!");
            System.out.println("HERE IT IS : "+NewMap);
//            file.write(NewMap.toString());
//            file.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void DeleteCustomer(String AdminInput){
        try{
            CON.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDataJson = RF.getJSONObject( getClass().getResource( CON.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> CustomerDataMap = Converter.JSONToMap(CustomerDataJson); // Convert JSON to HashMap
            
            for (ArrayList<Map<String,String>> CustomerDetails : CustomerDataMap.values()){
                for (Iterator<Map<String,String>> Iter = CustomerDetails.iterator(); Iter.hasNext(); ){
                    Map<String,String> CDetails = Iter.next();
                    if (CDetails.get("ID").equals(AdminInput)){
                        Iter.remove();
                    }
                }
            }
            System.out.println( "CHECK THIS OUT "+getClass().getResource( CON.getConfigVar()).toExternalForm() );
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
