package sample.model.bean;
/**
 * Market
 * Classe Product
 * @author Elias Ferreira
 */
public class Product {
    
    public Product() {
        
        this.productId = 0;
        this.categoryId = 0;
        this.productName = null;
        this.productPrice = 0;
        this.productQuantity = 0;
        
    }
    
    public Product(int categoryId, String productName, double productPrice, int productQuantity) {
        
        this.categoryId = categoryId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        
    }
    
    public Product(int productId, int categoryId, String productName, double productPrice, int productQuantity) {
        
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        
    }
    
    private int productId;
    private int categoryId;
    private String productName;
    private double productPrice;
    private int productQuantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    
    public void setProduct(int categoryId,
                           String productName,
                           double productPrice,
                           int productQuantity) 
    {
        
        this.setCategoryId(categoryId);
        this.setProductName(productName);
        this.setProductPrice(productPrice);
        this.setProductQuantity(productQuantity);
        
    }
    
    public void setProduct(int productId,
                           int categoryId,
                           String productName,
                           double productPrice,
                           int productQuantity) 
    {
        
        this.setProductId(productId);
        this.setCategoryId(categoryId);
        this.setProductName(productName);
        this.setProductPrice(productPrice);
        this.setProductQuantity(productQuantity);
        
    }
    
}
