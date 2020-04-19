package model;

import model.Person;
import model.Credentials;

import com.google.gson.Gson;
import java.util.Map;
import lombok.Data;
/**
 *
 * @author Hendika
 */
@Data
public class AdminDetail {
    
    private String ID;
    private Person PersonDetails;
    private Credentials Credential;
    
    public AdminDetail (String ID, String Name, String ContactNo, String Email, Credentials Credential){
        this.ID = ID;
        this.PersonDetails = new Person(Name, ContactNo, Email);
        this.Credential = Credential;
    }
    public AdminDetail (Map<String, String> AdminDetails){
        if (AdminDetails != null){
            this.ID = AdminDetails.get("ID");
            this.PersonDetails = new Person(AdminDetails.get("Name"), AdminDetails.get("ContactNo"), AdminDetails.get("Email"));
            this.Credential = new Credentials(AdminDetails.get("Username"), AdminDetails.get("Password"));
        } else {
            System.out.println("INVALID USERNAME / PASSWORD");
        }


    }
}
