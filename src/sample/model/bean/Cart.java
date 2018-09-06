package sample.model.bean;
/**
 * Market
 * Class Cart
 * @author Elias Ferreira
 */
public class Cart {
    
    public Cart() {
        
        this.saleId = 0;
        this.productId = 0;
        this.cartQuantity = 0;
        
    }
    
    public Cart(int saleId, int productId, int cartQuantity) {
        
        this.saleId = saleId;
        this.productId = productId;
        this.cartQuantity = cartQuantity;
        
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }
   
    private int saleId;
    private int productId;
    private int cartQuantity;
    
}
