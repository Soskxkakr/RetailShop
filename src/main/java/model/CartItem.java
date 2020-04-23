package model;

import configs.Config;
import java.awt.print.Book;
import pkg.ReadFile;
import pkg.Serializer;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import lombok.Data;
import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class CartItem {
    
//    private final ArrayList<Map<String, String>> cart = new ArrayList<>();
//    private final Map<String, String> item = new HashMap<>();
    private String itemId, itemName, quantity, price;
    
    public CartItem(String itemId, String itemName, String quantity, String price){
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        
//        this.item.put("ItemID", this.itemId);
//        this.item.put("ItemName", this.itemName);
//        this.item.put("Quantity", this.quantity);
//        this.item.put("TotalPrice", this.price);
//        
//        this.cart.add(this.item);
    }

}