package pkg;

import com.google.gson.Gson;
import java.io.File;
import java.util.Scanner;
import java.net.URI;
import java.util.ArrayList;

import org.json.JSONObject;
import lombok.Data;
import org.json.JSONArray;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class ReadFile {
    
    private String JSONString = "";  
    private JSONObject JSONObj;
    private File fileName;
    private Scanner scan;
    private ArrayList<JSONObject> userArr = new ArrayList<>();
    private Serializer converter = new Serializer();
    
    public ArrayList<JSONObject> getJSONArray(URI Path){
        try {
            this.fileName = new File(Path);
            this.scan = new Scanner(fileName);
            
            while (this.scan.hasNextLine()){
                this.JSONString += this.scan.nextLine();
            }
            System.out.println(JSONString);
            this.userArr = converter.JSONToArray(JSONString);
        } catch (IllegalStateException e){
            System.out.println("ERROR : Scanner is closed");
        } catch (NullPointerException e){
            System.out.println("ERROR : Invalid Path");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           return userArr; 
        }  
    }
    
    public JSONObject getJSONObject(URI Path){
        try {
            this.fileName = new File(Path);
            this.scan = new Scanner(fileName);
            
            while (this.scan.hasNextLine()){
                this.JSONString += this.scan.nextLine();
            }
            
            this.JSONObj = new JSONObject(JSONString);
        } catch (IllegalStateException e){
            System.out.println("ERROR : Scanner is closed");
        } catch (NullPointerException e){
            System.out.println("ERROR : Invalid Path");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           return JSONObj; 
        }  
    }
}
