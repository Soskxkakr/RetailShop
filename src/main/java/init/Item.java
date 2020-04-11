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
public class Item {
    
    private String ItemID, ItemName, Quantity, TotalPrice;
    private Config CONFIG = new Config();
    private Serializer Convert = new Serializer();
    private ReadFile RF = new ReadFile();
    
    
    public Item(String ItemID){
        try {
            CONFIG.setConfigVar("ITEM_JSON_PATH");
            JSONObject ItemDetails = RF.getJSONObject( getClass().getResource(CONFIG.getConfigVar()).toURI() );
            Map<String, ArrayList<Map<String, String>>> ItemMap = Convert.JSONToMap(ItemDetails);
            
            for (String ItemKey : ItemMap.keySet()){
                if (ItemKey.equals(ItemID)){
                    this.ItemID = ItemID;
                    System.out.println("=========================================================");
                    for (Map<String, String> Items : ItemMap.get(ItemKey)){
                        System.out.println("ID : "+Items.get("ItemID"));
                        System.out.println("Item : "+Items.get("ItemName"));
                        System.out.println("Quantity : "+Items.get("Quantity"));
                        System.out.println("Total Price : "+Items.get("TotalPrice"));
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
