package cmd;

import javax.swing.JOptionPane;
import model.User;
import pkg.LoginValidation;
import pkg.UsernameCheck;
import controller.AdminService;
/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
//        CartService cs = new CartService();
//        try {
////            CartItem c1 = new CartItem("1", "Reinaldo", "2", "5000");
////            CartItem c2 = new CartItem("2", "lmaolldo", "2", "5000");
////            CartItem c3 = new CartItem("3", "einaldo", "2", "5000");
////            cs.addCart(c1);
////            cs.addCart(c2);
////            cs.addCart(c3);
////            
////            String message = cs.viewCart();
//// add, delete, edit, view ,search
//           
//            Object[] option = { "Login","Cancel" };
//            int answer = JOptionPane.showInternalOptionDialog(null, "Login", "Titties", 
//                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, null);
//            
//            if (answer == 0){
//                String userName = JOptionPane.showInputDialog("Enter your username");
//                String password = JOptionPane.showInputDialog("Enter your password");
//                
//                LoginValidation LV = new LoginValidation();
//                User Reinaldo = LV.checkCredentials(userName, password);
//                
//                if ( Reinaldo == null ) {
////                    JOptionPane.showConfirmDialog(null, "Invalid username or password");
//                    JOptionPane.showOptionDialog(null, message, "test", JOptionPane.ERROR, JOptionPane.INFORMATION_MESSAGE, null, option, Reinaldo);
//                }
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
        try{
        for(;;){
        Object[] loginArry = {"Login", "Cancel"};
        LoginValidation lv = new LoginValidation();
        UsernameCheck uc = new UsernameCheck();
        AdminService as = new AdminService();
        int login = JOptionPane.showInternalOptionDialog(null, "Login", "Login", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, loginArry, null);
            if (login == 0){
                
                String username = JOptionPane.showInputDialog("Username:");
                String password = JOptionPane.showInputDialog("Password:");
                String id = lv.checkCredentials(username, password).getUserId().toString().substring(0, 1);
                if(id.equals("A")){
                Object[] adminMenu ={"Add", "Delete", "Edit", "View", "Search"};
                int option = JOptionPane.showInternalOptionDialog(null,"Admin " + username, "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, adminMenu, null);
                    if(option == 0){
                        Object[] add = {"Add Customer", "Add Product","Back"};
                        int addOption =JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, add, null);
                        if(addOption == 0){
                            for(;;){
                                String customerUsername = JOptionPane.showInputDialog("Username:");
                                uc.CustomerUserName(customerUsername);
                                if (uc.CustomerUserName(customerUsername) == true){
                                    JOptionPane.showMessageDialog(null, "The username is already exist please try again");
                            }
                                else {
                                    String customerPassword = JOptionPane.showInputDialog("Password:");
                                    String customerName = JOptionPane.showInputDialog("Name:");
                                    String customerContactNo = JOptionPane.showInputDialog("ContactNo:");
                                    String customerEmail = JOptionPane.showInputDialog("Email:");
                                    as.addCustomer(customerUsername, customerPassword, customerName, customerContactNo, customerEmail);
                                    break;
                                }
                            }    
                        }
                        else if (addOption == 1){
                            Object[] product = {"Electronic","Utensil","Household Appliance","Stationery","Accessories" };
                            int productOption = JOptionPane.showInternalOptionDialog(null, "Add", " ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, product, null);
                                if(productOption == 0){
                                    String productName = JOptionPane.showInputDialog("Name:");
                                    String productStock = JOptionPane.showInputDialog("Stock:");
                                    String productPrice = JOptionPane.showInputDialog("Price:");
                                    as.addProduct("Electronic", productName, productStock, productPrice);
                            }
                                else if (productOption == 1 ){
                                    String productName = JOptionPane.showInputDialog("Name:");
                                    String productStock = JOptionPane.showInputDialog("Stock:");
                                    String productPrice = JOptionPane.showInputDialog("Price:");
                                    as.addProduct("Utensil", productName, productStock, productPrice);
                            }
                                else if (productOption == 2){
                                    String productName = JOptionPane.showInputDialog("Name:");
                                    String productStock = JOptionPane.showInputDialog("Stock:");
                                    String productPrice = JOptionPane.showInputDialog("Price:");
                                    as.addProduct("Household Appliance", productName, productStock, productPrice);
                                }
                                else if (productOption == 3){
                                    String productName = JOptionPane.showInputDialog("Name:");
                                    String productStock = JOptionPane.showInputDialog("Stock:");
                                    String productPrice = JOptionPane.showInputDialog("Price:");
                                    as.addProduct("Stationery", productName, productStock, productPrice);
                                }
                                else{
                                    String productName = JOptionPane.showInputDialog("Name:");
                                    String productStock = JOptionPane.showInputDialog("Stock:");
                                    String productPrice = JOptionPane.showInputDialog("Price:");
                                    as.addProduct("Accessories", productName, productStock, productPrice);
                                }
                        }
                    }
                    
                }
                else{
                Object[] customerMenu ={"Add", "Delete", "Edit", "View", "Search"};
                }
            }
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
