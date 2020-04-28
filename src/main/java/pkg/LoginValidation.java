package pkg;

import configs.Config;
import model.Credentials;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Reinaldo Taslim
 */
public class LoginValidation {
    private Serializer convert = new Serializer();
    private ReadFile fileReader = new ReadFile();
    private Config config = new Config();
    private ArrayList<Map<String, String>> userDetail = new ArrayList<>();
    private User userData;
    
    
    public User checkCredentials(String username, String password){
        try {
            // IF CUSTOMER LOGIN HERE
            if ( username != "" && password != "" ) {
                fileReader.clear();
                config.setConfigVar("CUSTOMER_JSON_PATH");
                this.userDetail = convert.toArrayList( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) );  
                for ( Map<String, String> userData : this.userDetail ){
                    if ( userData.get("Username").equals(username) && userData.get("Password").equals(password) ){
                        this.userData = new User(userData.get("ID"), 
                                userData.get("Name"), 
                                userData.get("ContactNo"), 
                                userData.get("Email"), 
                                new Credentials(userData.get("Username"), userData.get("Password")) );
                    }
                }
                // IF ADMIN LOGIN HERE
                if ( this.userData == null ){
                    fileReader.clear();
                    this.userDetail.clear();
                    config.setConfigVar("ADMIN_JSON_PATH");
                    this.userDetail = convert.toArrayList( fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI()) ); 
                    for ( Map<String, String> userData : this.userDetail ){
                        if ( userData.get("Username").equals(username) && userData.get("Password").equals(password) ){
                            this.userData = new User(userData.get("ID"), 
                                userData.get("Name"), 
                                userData.get("ContactNo"), 
                                userData.get("Email"), 
                                new Credentials(userData.get("Username"), userData.get("Password")) );
                        }
                    }
                }
                return this.userData;
            } else {
                return null;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
