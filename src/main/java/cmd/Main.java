package cmd;

import javax.swing.JOptionPane;
import model.User;
import pkg.LoginValidation;
import pkg.UsernameCheck;
import controller.AdminService;
import controller.OrderService;
/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
        User user;
        try {
            LoginValidation lv = new LoginValidation();
            Object[] loginArry = { "Login", "Cancel" };
            int login = JOptionPane.showInternalOptionDialog(null, "Login", "Login", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, loginArry, null);
            for (;;) {
                if (login == 0) {
                    String username = JOptionPane.showInputDialog("Username:");
                    String password = JOptionPane.showInputDialog("Password:");
                    user = lv.checkCredentials(username, password); // returns user
                    String id = user.getUserId().toString().substring(0, 1); // return A or C
                
                    if( id.equals("A") ) {
                        AdminService as = new AdminService(user);
                    } else {
                        OrderService os = new OrderService(user);
                        Object[] customerMenu ={"Add", "Delete", "Edit", "View", "Search"};
                    }
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
