package controller;

import configs.Config;
import java.io.FileWriter;
import pkg.ReadFile;
import pkg.Serializer;
import model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
public class OrderService {
    
    private String itemId, ItemName, Quantity, TotalPrice;
    private Order userOrder;
    private Config config = new Config();
    private Serializer convert = new Serializer();
    private ReadFile fileReader = new ReadFile();
    private Map<String, ArrayList<Map<String, String>>> items = new HashMap<>();
    private ArrayList<Map<String, String>> order = new ArrayList<>();
    
    public void addOrder() {
        
    }
    
    public boolean viewOrder(String itemId) { // itemId is collected from order.json
        try {
            config.setConfigVar("ITEM_JSON_PATH");
            this.items = convert.toMap(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));            
            
            for ( String itemKey : this.items.keySet() ){
                if ( itemKey.equals(itemId) ){
                    this.itemId = itemId;
                    System.out.println("=========================================================");
                    for ( Map<String, String> items : this.items.get(itemKey) ){
                        System.out.println("ID : "+items.get("ItemID"));
                        System.out.println("Item : "+items.get("ItemName"));
                        System.out.println("Quantity : "+items.get("Quantity"));
                        System.out.println("Total Price : "+items.get("TotalPrice"));
                        System.out.println("=========================================================");
                    }
                    return true;
                } else {
                    System.out.println("Item ID does not exist in database");
                    return false;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void removeOrder(String id){//get id from gui label
        try{
        config.setConfigVar("ORDER_JSON_PATH");
        this.order = convert.toArrayList(fileReader.getJson( getClass().getResource(config.getConfigVar()).toURI() ));
        for (Iterator<Map<String, String>> it = this.order.iterator(); it.hasNext();){
            Map<String, String> orderInfo = it.next();
            if(orderInfo.get("ID").equals(id)){
                it.remove();
            }
        }
        FileWriter file = new FileWriter(fileReader.getFileName());
        file.write(this.order.toString());
        file.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
