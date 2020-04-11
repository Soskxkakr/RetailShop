package init;

import configs.Config;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import pkg.ReadFile;
import pkg.Serializer;

/**
 *
 * @author Reinaldo Taslim
 */
public class Order {
    
    private String OrderID, CustomerID, ItemID;
    private Config CONFIG = new Config();
    private ReadFile RF = new ReadFile();
    private Serializer Convert = new Serializer();
    
    public String ViewOrder(String ID){
        try {
            CONFIG.setConfigVar("ORDER_JSON_PATH");
            JSONObject OrderJSON = RF.getJSONObject( getClass().getResource(CONFIG.getConfigVar()).toURI() ); 
            Map<String, ArrayList<Map<String, String>>> OrderDetails = Convert.JSONToMap(OrderJSON);
            
            for (ArrayList<Map<String, String>> OrderCollection : OrderDetails.values()){
                for (Map<String, String> Order : OrderCollection){
                    if (Order.get("CustomerID").equals(ID)){
                        this.OrderID = Order.get("ID");
                        this.CustomerID = Order.get("CustomerID");
                        this.ItemID = Order.get("ItemID");
                    }
                }
            } 
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return this.ItemID;
        }
        
    }
}
