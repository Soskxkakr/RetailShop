package pkg;

import java.io.File;
import java.util.Scanner;
import java.net.URI;

import org.json.JSONObject;
import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class ReadFile {
    
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
        } catch (NullPointerException e){
            System.out.println("ERROR : Invalid Path");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           return JSONObj; 
        }
        
    }
}
