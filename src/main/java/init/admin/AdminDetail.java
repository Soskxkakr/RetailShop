package init.admin;

import init.Person;
import init.Credentials;

import com.google.gson.Gson;
import java.util.Map;

public class AdminDetail extends Person {
    private String ID;
    private Person Person;
    private Credentials Credential;
    private Gson JsonConverter = new Gson();
    
    public AdminDetail (String ID, String Name, String ContactNo, String Email, Credentials Credential){
        super(Name, ContactNo, Email);
        this.ID = ID;
        this.Credential = Credential;
    }
    public AdminDetail (Map<String, String> AdminDetails){
        if (AdminDetails != null){
            this.ID = AdminDetails.get("ID");
            this.Person = new Person(AdminDetails.get("Name"), AdminDetails.get("ContactNo"), AdminDetails.get("Email"));
            this.Credential = new Credentials(AdminDetails.get("Username"), AdminDetails.get("Password"));
        } else {
            System.out.println("INVALID USERNAME / PASSWORD");
        }


    }
}
