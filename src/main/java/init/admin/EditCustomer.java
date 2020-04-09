package init.admin;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.json.JSONObject;

/**
 *
 * @author Reinaldo Taslim
 */
public class EditCustomer {
    
    private Config CONFIG = new Config();
    private ReadFile RF = new ReadFile();
    private Serializer Convert = new Serializer();
    private FileWriter FW;
    
    public EditCustomer (String CustomerID, String Name, String ContactNo){
        try {
            CONFIG.setConfigVar("CUSTOMER_JSON_PATH");
            JSONObject CustomerDetails = RF.getJSONObject( getClass().getResource(CONFIG.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> CustomerCollection = Convert.JSONToMap(CustomerDetails);
            
            for (ArrayList<Map<String, String>> CustomerList : CustomerCollection.values()) {
                for (Map<String, String> CustomerDetail : CustomerList){
                    if (CustomerDetail.get("ID").equals(CustomerID)){
                        CustomerDetail.put("Name", Name); // EDIT THIS
                        CustomerDetail.put("ContactNo", ContactNo); // EDIT THIS
                    }
                }
            }
            
            System.out.println(CustomerCollection);
            FW = new FileWriter( RF.getFileName() );
            FW.write( Convert.MapToString(CustomerCollection) );
            System.out.println("WRITE SUCCESSFULLY!!!");
            FW.close();
        } catch (IOException e){
            System.out.println("ERROR : No such file exists in the directory");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
