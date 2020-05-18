package model;

import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class Credentials {
    
    private String username, password;
    
    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean isEmpty(){
        if ( this.username == "" && this.password == "" ) {
           return true;
        } else {
           return false;
        }
    }
}
