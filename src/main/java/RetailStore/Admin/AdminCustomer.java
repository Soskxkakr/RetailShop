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
}
