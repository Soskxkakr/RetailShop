package model;

import configs.Config;
import pkg.Serializer;

import lombok.Data;
/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class Order {
    
    private String orderId, userId, itemId;
    private Config config = new Config();
    private Serializer convert = new Serializer();
    
    public Order() {
        config.setConfigVar("ORDER_JSON_PATH");
    }
}
