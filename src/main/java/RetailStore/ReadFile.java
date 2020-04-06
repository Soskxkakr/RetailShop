package RetailStore;
/**
 *
 * @author Reinaldo Taslim
 */
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;
import lombok.Data;

@Data
public class ReadFile {
    
    Gson JsonConverter = new Gson();
    String JSONString = "";  
    JSONObject JSONObj;
    
    public JSONObject getJSONObject(String url){
        try {
            File file = new File(url); // "C:\\Users\\Reinaldo Taslim\\Documents\\NetBeansProjects\\GroupAssignment\\src\\main\\java\\RetailStore\\Customer.json"
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                JSONString += scan.nextLine();
            }
            JSONObject JSONData = new JSONObject(JSONString);
            Map<String, ArrayList<HashMap<String, String>>> CustomerDataMap = JsonConverter.fromJson(JSONData.toString(), HashMap.class);
            this.JSONObj = JSONData;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           return JSONObj; 
        }
        
    }
}
