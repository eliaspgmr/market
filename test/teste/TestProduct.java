/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import sample.model.bean.Product;
import sample.model.dao.ProductDAO;
/**
 *
 * @author Elias Ferreira
 */
public class TestProduct {
    
    public static void main(String[] args) {
        
        Product product = new Product();
        ProductDAO dao = new ProductDAO();
        
        product.setProduct(1, "Queijo", 7.89, 16);
        
        dao.create(product);
        
    }
}
