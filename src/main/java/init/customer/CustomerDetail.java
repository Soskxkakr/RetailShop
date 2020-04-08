package init.customer;

import init.Credentials;
import com.google.gson.Gson;
import init.Person;
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
    private String ID;
    private Person PersonDetails;
    private Credentials Credential;

    public CustomerDetail (String ID, String Name, String ContactNo, String Email, Credentials Credential){
        this.ID = ID;
        this.PersonDetails = new Person(Name, ContactNo, Email);
        this.Credential = Credential;
    }
    
    public CustomerDetail (Map<String, String> CustomerDetails){
        if (CustomerDetails != null){
            this.ID = CustomerDetails.get("ID");
            this.PersonDetails = new Person(CustomerDetails.get("Name"), CustomerDetails.get("ContactNo"), CustomerDetails.get("Email"));
            this.Credential = new Credentials(CustomerDetails.get("Username"), CustomerDetails.get("Password"));
        } else {
            System.out.println("INVALID USERNAME / PASSWORD");
        }
        
        
    }
}
