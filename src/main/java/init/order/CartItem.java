package init.order;

import configs.Config;
import pkg.ReadFile;
import pkg.Serializer;

import java.net.URI;

import lombok.Data;
import org.json.JSONObject;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class CartItem {
    private String ItemName;
    private int Quantity, Price;
    
    public CartItem(String ItemName, int Quantity, int Price){
        this.ItemName = ItemName;
        this.Quantity = Quantity;
        this.Price = Price;
    }
}