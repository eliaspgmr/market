package sample.model.bean;
/**
 * Market
 * Classe de categories
 * @author Elias Ferreira
 */
public class Category {
    
    public Category() {
        
        this.categoryId = 0;
        this.categoryName = null;
        this.categoryDescription = null;
        
    }
    
    public Category(String categoryName, String categoryDescription) {
        
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        
    }
    
    public Category(int categoryId, String categoryName, String categoryDescription) {
        
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        
    }
    
    private int categoryId;
    private String categoryName;
    private String categoryDescription;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
    
}
