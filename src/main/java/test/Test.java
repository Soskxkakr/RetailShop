package test;

import configs.Config;
import init.order.Cart;
import init.order.CartItem;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Reinaldo Taslim
 */
public class Test {
    /*
        THIS IS FOR TESTING PURPOSES
    */
    public static void main(String[] args) {
        CartItem Item1 = new CartItem();
        Item1.setItemName("Camera");
        Item1.setQuantity(2);
        Item1.setPrice(200);
        
        CartItem Item2 = new CartItem();
        Item2.setItemName("Spoon");
        Item2.setQuantity(12);
        Item2.setPrice(5);
        
        CartItem Item3 = new CartItem();
        Item3.setItemName("Fork");
        Item3.setQuantity(12);
        Item3.setPrice(10);
        
//        System.out.println(Item1);
//        System.out.println(Item1.getItemName());
        Cart Cart = new Cart();
        Cart.AddCartItem(Item1);
        Cart.AddCartItem(Item2);
        Cart.AddCartItem(Item3);
//        Cart.ShowCart();
        

        Config CONFIG = new Config();
        
    }
}
