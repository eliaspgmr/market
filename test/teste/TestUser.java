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
        User user = dao.select("deborah");
        
        if (user.getLogin() == null) {
            System.out.println("Usuário não encontrado!");
        } else {
            
            System.out.print(user.getId()+"  "); 
            System.out.println(user.getLogin()+"  ");
            
        }
        
    }
    
}
