package controller;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
public class OrderService {
    private String itemId, ItemName, Quantity, TotalPrice;
    private Config config = new Config();
    private Serializer convert = new Serializer();
    private ReadFile fileReader = new ReadFile();
    private ArrayList<Map<String, String>> items = new ArrayList<>();
    
    
    public void viewItem(String itemId){
        try {
            config.setConfigVar("ITEM_JSON_PATH");
            JSONObject itemDetails = fileReader.getJSONObject( getClass().getResource(config.getConfigVar()).toURI() );
            Map<String, ArrayList<JSONObject>> itemDetail = convert.JSONToMap(itemDetails);
            
            for ( String itemKey : itemDetail.keySet() ){
                if ( itemKey.equals(itemId) ){
                    this.itemId = itemId;
                    for (int i = 0; i < itemDetail.get(itemKey).size(); i++){
                        items.add( convert.JSONToMap2(itemDetail.get(itemKey).get(i)) );
                    }
                    System.out.println(items);
                    System.out.println("=========================================================");
                    for ( JSONObject items : itemDetail.get(itemKey) ){
                        System.out.println("ID : "+items.get("ItemID"));
                        System.out.println("Item : "+items.get("ItemName"));
                        System.out.println("Quantity : "+items.get("Quantity"));
                        System.out.println("Total Price : "+items.get("TotalPrice"));
                        System.out.println("=========================================================");
                    }
                } else {
                    System.out.println("Item ID does not exist in database");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
