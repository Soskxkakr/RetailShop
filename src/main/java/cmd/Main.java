package cmd;

import init.admin.AddCustomer;
/**
 *
 * @author Reinaldo Taslim
 */
public class Main {
    public static void main(String[] args) {
        try {
            AddCustomer AC = new AddCustomer();
            AC.AddCustomer();
            
//            new LoginPage().setVisible(true);
            System.out.println(System.getProperty("java.class.path"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
