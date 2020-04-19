package model;

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
    
    private String orderId, customerId, itemId;
    private Config config = new Config();
    private ReadFile fileReader = new ReadFile();
    private Serializer convert = new Serializer();
    private ArrayList<JSONObject> orderList = new ArrayList<>();
    
    public String viewOrder(String ID){
        try {
            config.setConfigVar("ORDER_JSON_PATH");
            this.orderList = fileReader.getJSONArray( getClass().getResource(config.getConfigVar()).toURI() );
            
            for (JSONObject orderData : orderList) {
                if ( orderData.get("ID").equals(ID) ) {
                    this.orderId = orderData.get("ID").toString();
                    this.customerId = orderData.get("CustomerID").toString();
                    this.itemId = orderData.get("ItemID").toString();
                }
            }
            System.out.println(orderList);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return this.itemId;
        }
        
    }
}
