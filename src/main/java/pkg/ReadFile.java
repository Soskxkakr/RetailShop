package pkg;

import java.io.File;
import java.util.Scanner;
import java.net.URI;
import java.util.ArrayList;

import com.google.gson.Gson;
import org.json.JSONObject;
import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class ReadFile {
    
    private String JSONString = "";  
    private File fileName;
    private Scanner scan;
    private Serializer converter = new Serializer();
    
    public String getJson(URI Path){
        try {
            this.fileName = new File(Path);
            this.scan = new Scanner(fileName);
            
            while (this.scan.hasNextLine()){
                this.JSONString += this.scan.nextLine();
            }
        } catch (IllegalStateException e){
            System.out.println("ERROR : Scanner is closed");
        } catch (NullPointerException e){
            System.out.println("ERROR : Invalid Path");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           return JSONString; 
        }  
    }
    public void clear(){
        this.JSONString = "";
    }
    
    public ArrayList<JSONObject> getJSONArray(URI toURI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
