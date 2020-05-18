package model;

import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class User {
    
    private String userId, name, contactNo, email;
    private Credentials credential;
    
    public User(String userId, String name, String contactNo, String email, Credentials credential){
        this.userId = userId;
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
        this.credential = credential;
    }
}
