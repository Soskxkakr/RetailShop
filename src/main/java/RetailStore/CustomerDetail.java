package RetailStore;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import lombok.Data;
import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class CustomerDetail {
    private String ID, Name, ContactNo, Email;
    private Credentials Credential;
    private Gson JsonConverter = new Gson();
    
    public CustomerDetail(String ID, String Name, String ContactNo, String Email, Credentials Credential){ // To add a new Customer
        this.ID = ID;
        this.Name = Name;
        this.ContactNo = ContactNo;
        this.Email = Email;
        this.Credential = Credential;
    }
    
    public CustomerDetail(JSONObject CustomerDataJson){ //To read a customer record
        HashMap<String, ArrayList<HashMap<String, String>>> CustomerDataMap = JsonConverter.fromJson(CustomerDataJson.toString(), HashMap.class); // Convert JSON to HashMap
        for (ArrayList<HashMap<String, String>> CustomerDataList : CustomerDataMap.values()){
            for (HashMap<String, String> CDetails : CustomerDataList){
                this.ID = CDetails.get("ID");
                this.Name = CDetails.get("Name");
                this.ContactNo = CDetails.get("ContactNo");
                this.Email = CDetails.get("Email");
                this.Credential = new Credentials(CDetails.get("Username"), CDetails.get("Password"));
            }
        }
    }
}
