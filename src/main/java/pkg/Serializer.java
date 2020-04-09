package pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class Serializer {
    
    private Gson JSONConverter = new Gson();
    
    public Map<String, ArrayList<Map<String, String>>> JSONToMap(JSONObject JSONObj){
        Map<String, ArrayList<Map<String, String>>> PersonDetailMap = JSONConverter.fromJson(JSONObj.toString(), HashMap.class);
        return PersonDetailMap;
    }
    
    public String MapToString (Map<String, ArrayList<Map<String, String>>> PersonDetailMap){
        String PersonDetail = JSONConverter.toJson(PersonDetailMap);
        return PersonDetail;
    }
}
