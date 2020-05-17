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
    
    private String itemId, itemName, quantity, price;
    
    public CartItem(String itemId, String itemName, String quantity, String price){
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

}