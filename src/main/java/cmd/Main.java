package cmd;

import controller.AdminService;
import controller.CartService;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.CartItem;
import model.User;
import pages.NewLoginPage;
import pkg.LoginValidation;

/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
        CartService cs = new CartService();
        try {
            CartItem c1 = new CartItem("1", "Reinaldo", "2", "5000");
            CartItem c2 = new CartItem("2", "lmaolldo", "2", "5000");
            CartItem c3 = new CartItem("3", "einaldo", "2", "5000");
            cs.addCart(c1);
            cs.addCart(c2);
            cs.addCart(c3);
            
            String message = cs.viewCart();
            Object[] option = { 1, 2 };
            int answer = JOptionPane.showInternalOptionDialog(null, message, "Titties", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, null);
            
            if (answer == 0){
                String userName = JOptionPane.showInputDialog("Enter your username");
                String password = JOptionPane.showInputDialog("Enter your password");
                
                LoginValidation LV = new LoginValidation();
                User Reinaldo = LV.checkCredentials(userName, password);
                System.out.println(Reinaldo);
                if ( Reinaldo == null ) {
                    JOptionPane.showConfirmDialog(null, "Invalid username or password");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
