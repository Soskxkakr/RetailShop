package RetailStore;
/**
 *
 * @author Reinaldo Taslim
 */
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.json.JSONObject;
import lombok.Data;

@Data
public class ReadFile {
    private String Title, Username, Password, Name, ContactNo, Email;
    
    public  HashMap<String, ArrayList<HashMap<String, String>>> ImportData(){
        try {
            String JsonString = "";
            File file = new File("C:\\Users\\Reinaldo Taslim\\Documents\\NetBeansProjects\\GroupAssignment\\src\\main\\java\\RetailStore\\Customer.json");
            Gson g = new Gson();
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                JsonString += scan.nextLine();
            }
            JSONObject JsonObj = new JSONObject(JsonString);
            HashMap<String, ArrayList<HashMap<String, String>>> CustomerMap = g.fromJson(JsonObj.toString(), HashMap.class);
            return CustomerMap;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return null;
        }
    }
    
    public void setData(String Title){
        this.Title = Title;
    }
}
