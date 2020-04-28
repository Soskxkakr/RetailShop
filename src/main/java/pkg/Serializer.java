package pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class Serializer {
    // Variables
    private Gson JSONConverter = new Gson();
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private JSONObject JSONObj;
    
    // Methods
    public JSONObject toJSONObject (String jMap) {
        JSONObj = new JSONObject(jMap);
        return JSONObj;
    }
    public Map<String, ArrayList<Map<String,String>>> toMap(String map){ 
        return JSONConverter.fromJson(map.toString(), HashMap.class); 
    }
    
    public ArrayList<Map<String, String>> toArrayList (String arr) {
        return JSONConverter.fromJson(arr.toString(), ArrayList.class);
//        ArrayList<Map<String, String>> userArr = new ArrayList<>();
//        JSONArray JSONArr = new JSONArray(arr);
//        for (int i = 0; i < JSONArr.length(); i++){
//            userArr.add(JSONArr.getJSONObject(i));
//        }
//        return userArr;
    }
    
    public String prettyWriting(String jsonString){
        return gson.toJson(jsonString);
    }
    
    public String toString (ArrayList<Map<String, String>> PersonDetailMap){ 
        return JSONConverter.toJson(PersonDetailMap); 
    }
    
    public String toString (Map<String, ArrayList<Map<String, String>>> PersonDetailMap){ 
        return JSONConverter.toJson(PersonDetailMap); 
    }
}
