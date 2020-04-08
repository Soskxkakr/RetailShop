package init.customer;

import init.Credentials;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
    
    public CustomerDetail (Map<String, String> CDetails){
        if (CDetails != null){
            this.ID = CDetails.get("ID");
            this.Name = CDetails.get("Name");
            this.ContactNo = CDetails.get("ContactNo");
            this.Email = CDetails.get("Email");
            this.Credential = new Credentials(CDetails.get("Username"), CDetails.get("Password"));
        } else {
            System.out.println("INVALID USERNAME / PASSWORD");
        }
        
        
    }
}
