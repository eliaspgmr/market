/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import sample.model.bean.Cart;
import sample.model.dao.CartDAO;
/**
 *
 * @author Elias Ferreira
 */
public class TestCart {
    
    public static void main(String[] args) {
        
        Cart cart = new Cart(1, 3, 2);
        CartDAO dao = new CartDAO();
        
        dao.create(cart);
        
        
    }
    
}
