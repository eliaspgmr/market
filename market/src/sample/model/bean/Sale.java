package sample.model.bean;
/**
 * Market
 * Class Sale
 * @author Elias Ferreira
 */
public class Sale {
    
    public Sale() {
        this.saleId = 0;
        this.userId = 0;
        this.saleDate = null;
        this.saleTime = null;
    }
    
    public Sale(int userId, String saleDate, String saleTime) {
        
        this.userId = userId;
        this.saleDate = saleDate;
        this.saleTime = saleTime;
        
    }
    
    public Sale(int saleId, int userId, String saleDate, String saleTime) {
        
        this.saleId = saleId;
        this.userId = userId;
        this.saleDate = saleDate;
        this.saleTime = saleTime;
        
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(String saleTime) {
        this.saleTime = saleTime;
    }
    
    private int saleId;
    private int userId;
    private String saleDate;
    private String saleTime;
        
}
