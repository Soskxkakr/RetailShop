package pkg;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class LoginValidation {
    private Serializer Converter = new Serializer();
    
    public Map<String, String> CheckCredentials(JSONObject CustomerDataJson, String Username, String Password){
        Map<String, ArrayList<Map<String, String>>> CustomerDataMap = Converter.JSONToMap(CustomerDataJson);
        for (ArrayList<Map<String, String>> CustomerCollection: CustomerDataMap.values()){
            for (Map<String, String> CustomerDetail: CustomerCollection){
                if ( Username.equals(CustomerDetail.get("Username")) && Password.equals(CustomerDetail.get("Password")) ){
                    return CustomerDetail;
                }
            }
        }
        return null;
    }
}
