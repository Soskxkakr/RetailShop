package pkg;

import java.util.ArrayList;
import java.util.Map;

import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class LoginValidation {
    private Serializer converter = new Serializer();
    
    public JSONObject CheckCredentials(ArrayList<JSONObject> userArr, String username, String password){
        
        for ( JSONObject userData : userArr ) {
            if ( userData.get("Username").equals(username) && userData.get("Password").equals(password) ){
                return userData;
            }
        }
        return null;
    }
}
