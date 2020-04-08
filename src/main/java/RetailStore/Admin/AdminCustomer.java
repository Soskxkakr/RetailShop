package RetailStore.Admin;

import RetailStore.ReadFile;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
public class AdminCustomer {
    private ReadFile RF = new ReadFile();
    private Gson JSONConverter = new Gson();
    
    public void DeleteCustomer(String AdminInput){
        try{
            JSONObject CustomerDataJson = RF.getJSONObject("C:\\Users\\Reinaldo Taslim\\Documents\\NetBeansProjects\\RetailStore\\target\\classes\\JSON\\Customer.json");
            System.out.println(CustomerDataJson);
            Map<String, ArrayList<Map<String, String>>> CustomerDataMap = JSONConverter.fromJson(CustomerDataJson.toString(), HashMap.class); // Convert JSON to HashMap
            for (ArrayList<Map<String,String>> CustomerDetails : CustomerDataMap.values()){
                for (Iterator<Map<String,String>> Iter = CustomerDetails.iterator(); Iter.hasNext(); ){
                    Map<String,String> CDetails = Iter.next();
                    if (CDetails.get("ID").equals(AdminInput)){
                        Iter.remove();
                    }
                }
            }           
//            System.out.println(CustomerDataMap);
            FileWriter FW = new FileWriter("C:\\Users\\Reinaldo Taslim\\Documents\\NetBeansProjects\\RetailStore\\target\\classes\\JSON\\Customer.json");
            String NewMap = JSONConverter.toJson(CustomerDataMap);
            FW.write(NewMap.toString());
            FW.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
    public void AddCustomer(){
    Map<String, String> AddCustomer = new HashMap<>(); 
        AddCustomer.put("ID", "");          //
        AddCustomer.put("Username", "");    //
        AddCustomer.put("Password", "");    //Improve Later
        AddCustomer.put("Name", "");        //
        AddCustomer.put("ContactNo", "");   //
        AddCustomer.put("Email", "");       //
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
