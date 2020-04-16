package test;

import configs.Config;
import init.Item;
import init.Order;
import init.admin.EditCustomer;
import init.customer.ViewCustomer;
import init.cart.Cart;
import init.cart.CartItem;

import java.util.ArrayList;
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
        GenerateID1 ge = new GenerateID1();
        ge.GenerateID1();
//        ArrayList a = new ArrayList();
//        a.add(11);
//        a.add(22);
//        System.out.println(a);
//        Map<String, String> Map1 = new HashMap<>();
//        Map<String, String> Map2 = new HashMap<>();
//        Map<String, String> Map3 = new HashMap<>();
//        
//        Map1.put("Name", "Camera");
//        Map1.put("Quantity", "2");
//        Map1.put("Price", "2000");
//        
//        Map2.put("Name", "Spoon");
//        Map2.put("Quantity", "10");
//        Map2.put("Price", "10");
//        
//        Map3.put("Name", "Fork");
//        Map3.put("Quantity", "10");
//        Map3.put("Price", "12");
//        
//        ArrayList<Map<String, String>> ItemDetail = new ArrayList<>();
//        ItemDetail.add(Map1);
//        ItemDetail.add(Map2);
//        ItemDetail.add(Map3);
//        
////        System.out.println(ItemDetail);
//        Cart Cart = new Cart();
//        for (Map<String, String> Item : ItemDetail){
//            CartItem Items = new CartItem( 
//                    Item.get("Name"), 
//                    Integer.parseInt( Item.get("Quantity") ), 
//                    Integer.parseInt( Item.get("Price") ) 
//            );
//            Cart.AddCartItem(Items);
//        }
//        
//        Order Order = new Order();
//        String ItemID = Order.ViewOrder("C1");
//        Item Item = new Item(ItemID);
//        CartItem Item1 = new CartItem("Camera", 2, 2000);
//        new ViewCustomer();
//        new EditCustomer("C1", "Marieeeeee", "01111111");
//        System.out.println(Item1);
//        System.out.println(Item1.getItemName());
//        Cart Cart = new Cart();
//        Cart.AddCartItem(Item1);
//        Cart.ShowCart();
       
    }
}
