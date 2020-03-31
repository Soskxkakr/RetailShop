package RetailStore;

import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class Credentials {
    private String Username, Password;
    
    public Credentials(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }
}
