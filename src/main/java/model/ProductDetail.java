package model;

import lombok.Data;

/**
 *
 * @author Reinaldo Taslim
 */
@Data
public class ProductDetail {
    
    private String category, productId, productName, stock, price;
    
    public ProductDetail (){
        
    }
}
