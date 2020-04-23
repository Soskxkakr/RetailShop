package controller;

import model.CartItem;
import java.util.ArrayList;
import lombok.Data;

/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class CartService {
    
    private ArrayList<CartItem> CartItems = new ArrayList<>();
   
    public void addCart(CartItem Item){
        try {
            this.CartItems.add(Item);
        } catch (Exception e){
           e.printStackTrace();
        }
    }
    
    public void viewCart(){
        System.out.println("Description \t\t Price");
        System.out.println("==============================");
        for (CartItem item : this.CartItems){
            System.out.println(item.getQuantity()+"x "+item.getItemName()+"\t\tRM "+Integer.parseInt(item.getQuantity())*Integer.parseInt(item.getPrice()));
//            System.out.println(Item.getQuantity()+"x "+Item.getItemName()+"\t\tRM "+Item.getQuantity()*Item.getPrice());
        }
    }
}
