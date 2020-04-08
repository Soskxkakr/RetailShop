package cmd;

import init.admin.AdminCustomer;
/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
        try {
            AdminCustomer AC = new AdminCustomer();
            AC.AddCustomer();
            
//            new LoginPage().setVisible(true);
            System.out.println(System.getProperty("java.class.path"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
