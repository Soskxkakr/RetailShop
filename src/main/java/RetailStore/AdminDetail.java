
package RetailStore;
import com.google.gson.Gson;
import java.util.Map;

public class AdminDetail {
    private String ID, Name, ContactNo, Email;
    private Credentials Credential;
    private Gson JsonConverter = new Gson();
    
public AdminDetail (String id, String name, String contactNo, String email, Credentials credential)
{
    ID = id;
    Name = name;
    ContactNo = contactNo;
    Email = email;
    Credential = credential;
}
  public AdminDetail (Map<String, String> AdminDetails){
        if (AdminDetails != null){
            this.ID = AdminDetails.get("ID");
            this.Name = AdminDetails.get("Name");
            this.ContactNo = AdminDetails.get("ContactNo");
            this.Email = AdminDetails.get("Email");
            this.Credential = new Credentials(AdminDetails.get("Username"), AdminDetails.get("Password"));
        } else {
            System.out.println("INVALID USERNAME / PASSWORD");
        }
        
        
    }
}
