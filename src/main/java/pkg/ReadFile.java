package pkg;
/**
 *
 * @author Reinaldo Taslim
 */
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import java.net.URI;
import org.json.JSONObject;
import lombok.Data;

@Data
public class ReadFile {
    
    private Gson JsonConverter = new Gson();
    private String JSONString = "";  
    private JSONObject JSONObj;
    private File FileName;
    private Scanner Scan;
    
    public JSONObject getJSONObject(URI Path){
        try {
            this.FileName = new File(Path);
            this.Scan = new Scanner(FileName);
            
            while (this.Scan.hasNextLine()){
                this.JSONString += this.Scan.nextLine();
            }
            
            this.JSONObj = new JSONObject(JSONString);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           return JSONObj; 
        }
        
    }
}
