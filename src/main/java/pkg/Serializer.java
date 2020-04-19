package pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class Serializer {
    // Variables
    private Gson JSONConverter = new Gson();
    private JSONObject JSONObj = new JSONObject();
    
    // Methods
    public Map<String, ArrayList<JSONObject>> JSONToMap(JSONObject JSONObj){ 
        return JSONConverter.fromJson(JSONObj.toString(), HashMap.class); 
    }
    
    public Map<String, String> JSONToMap2(JSONObject JSONObj){ 
        return JSONConverter.fromJson(JSONObj.toString(), HashMap.class); 
    }
    
    public ArrayList<JSONObject> JSONToArray(String arr) {
        ArrayList<JSONObject> userArr = new ArrayList<>();
        JSONArray JSONArr = new JSONArray(arr);
        for (int i = 0; i < JSONArr.length(); i++){
            userArr.add(JSONArr.getJSONObject(i));
        }
        return userArr;
    }
    
    public String toString (ArrayList<JSONObject> PersonDetailMap){ 
        return JSONConverter.toJson(PersonDetailMap); 
    }
    
    public String toString (Map<String, ArrayList<Map<String, String>>> PersonDetailMap){ 
        return JSONConverter.toJson(PersonDetailMap); 
    }
}
