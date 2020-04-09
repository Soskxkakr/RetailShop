package init.order;

import configs.Config;
import java.net.URI;
import pkg.ReadFile;

import lombok.Data;
import org.json.JSONObject;
import pkg.Serializer;


/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class CartItem {
    private String ItemName;
    private int Quantity, Price;
}