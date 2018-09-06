/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Elias Ferreira
 */

import sample.model.bean.User;
import sample.model.dao.UserDAO;

public class TestUser {
    
    public static void main(String[] args) {
        
        UserDAO dao = new UserDAO();
        
        
        User user = new User(1,"Elias Ferreira","elias","arkanjo45");
        
        dao.create(user);
        
    }
    
}
