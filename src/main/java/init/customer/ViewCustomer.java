package init.customer;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;

import java.util.ArrayList;
import java.util.Map;

import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
public class ViewCustomer {
    
    private Config CONFIG = new Config();
    private ReadFile RF = new ReadFile();
    private Serializer Convert = new Serializer();
    
    public ViewCustomer(){
        try {
            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDetails = RF.getJSONObject( getClass().getResource(CONFIG.getConfigVar()).toURI() ); 
            System.out.println("ID \tName \t\tContactNo \tEmail");
            System.out.println("====================================================================");
            for (ArrayList<Map<String, String>> CustomerCollection : Convert.JSONToMap(CustomerDetails).values()){
                for (Map<String, String> CustomerDetail : CustomerCollection){
                    System.out.println(
                                     CustomerDetail.get("ID")+"\t"
                                    +CustomerDetail.get("Name")+"\t"
                                    +CustomerDetail.get("ContactNo")+"\t"
                                    +CustomerDetail.get("Email")+"\t"
                    );
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
