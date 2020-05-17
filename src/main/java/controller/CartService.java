package controller;

import model.CartItem;
import java.util.ArrayList;
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
        for (CartItem item : cart) {
            if (item.getItemName().equals(itemName)) {
                cart.remove(0);
            }
        }
        return cart;
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
