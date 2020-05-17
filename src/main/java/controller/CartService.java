package controller;

import model.CartItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import lombok.Data;

/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class CartService {
    
    private ArrayList<CartItem> cartItems = new ArrayList<>();
   
    public CartService () {
        // Nothing
    }
    
    public CartService (ArrayList<CartItem> cartItem) {
        this.cartItems = cartItem;
    }
    
    public void addCart(CartItem Item){
        try {
            this.cartItems.add(Item);
        } catch (Exception e){
           e.printStackTrace();
        }
    }
    
    public ArrayList<CartItem> removeItem (ArrayList<CartItem> cart, String itemName) {
        ArrayList<CartItem> cartItem = new ArrayList<>();
        CartItem ci;
        ArrayList<Map<String, String>> newCart = new ArrayList<>();
        Map<String, String> cartMap = new HashMap();
        
        for ( CartItem cartDetails : cart ) {
            cartMap.put("itemId", cartDetails.getItemId());
            cartMap.put("itemName", cartDetails.getItemName());
            cartMap.put("quantity", cartDetails.getQuantity());
            cartMap.put("price", cartDetails.getPrice());
            newCart.add(cartMap);
        }
        
        for ( Iterator<Map<String, String>> iter = newCart.iterator(); iter.hasNext(); ) {
            Map<String, String> item = iter.next();
            if ( item.get("itemName").toLowerCase().equals(itemName.toLowerCase())) {
                iter.remove();
            } else {
                ci = new CartItem(item.get("itemId"), item.get("itemName"), item.get("quantity"), item.get("price"));
                cartItem.add(ci);
            } 
        }
        
        System.out.println("YOUR NEW CART ITEM: "+cartItem);
        return cartItem;
    }
    
    public String viewCart(){
        String empty = "Description \t\t Price" + "\n" + "==============================" + "\n";
//        System.out.println("Description \t\t Price");
//        System.out.println("==============================");
        for (CartItem item : this.cartItems){
            empty = empty + item.getQuantity()+"x "+item.getItemName().toLowerCase()+"                \tRM "+Integer.parseInt(item.getQuantity())*Integer.parseInt(item.getPrice()) + "\n";
//            System.out.println(item.getQuantity()+"x "+item.getItemName()+"\t\tRM "+Integer.parseInt(item.getQuantity())*Integer.parseInt(item.getPrice()));
//            System.out.println(Item.getQuantity()+"x "+Item.getItemName()+"\t\tRM "+Item.getQuantity()*Item.getPrice());
        }
        return empty;
    }
}
