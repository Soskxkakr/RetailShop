package cmd;

import javax.swing.JOptionPane;
import model.User;
import pkg.LoginValidation;
import controller.AdminService;
import controller.CustomerService;
/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
        
        String username, password;
        User user;
        
        try {
            LoginValidation lv = new LoginValidation();
            Object[] loginArry = { "Login", "Cancel" };
            int login = JOptionPane.showInternalOptionDialog(null, "Login", "Login", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, loginArry, null);
            
            if ( login == 0 ) {
                for (;;) {
                    username = JOptionPane.showInputDialog("Username:");
                    password = JOptionPane.showInputDialog("Password:");
                    user = lv.checkCredentials(username, password); // returns user
                    
                    if ( user != null) {
                        break;
                    } else if ( user == null ) {
                        System.out.println("INVALID USERNAME/PASSWORD");
                    }
                }
                
                String id = user.getUserId().toString().substring(0, 1); // return A or C
                if( id.equals("A") ) {
                    AdminService as = new AdminService(user);
                } else {
                    CustomerService cs = new CustomerService(user);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("There a null value lmao");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
