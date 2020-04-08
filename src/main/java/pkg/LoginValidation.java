package pkg;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class LoginValidation {
    private Gson JSONConverter = new Gson();
    
    public Map<String, String> CheckCredentials(JSONObject CustomerDataJson, String Username, String Password){
        Map<String, ArrayList<Map<String, String>>> CustomerDataMap = JSONConverter.fromJson(CustomerDataJson.toString(), HashMap.class); // Convert JSON to HashMap
        for (ArrayList<Map<String, String>> CustomerCollection: CustomerDataMap.values()){
            for (Map<String, String> CDetails: CustomerCollection){
                if ( Username.equals(CDetails.get("Username")) && Password.equals(CDetails.get("Password")) ){
                    return CDetails;
                }
            }
        }
        return null;
    }
}
