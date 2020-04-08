package init;

import lombok.Data;

/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class Person {
    private String Name, ContactNo, Email;
    
    public Person(String Name, String ContactNo, String Email){
        this.Name = Name;
        this.ContactNo = ContactNo;
        this.Email = Email;
    }
}
