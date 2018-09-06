/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import sample.model.bean.Category;
import sample.model.dao.CategoryDAO;
/**
 *
 * @author Elias Ferreira
 */
public class TestCategory {
    
    public static void main(String[] args) {
        
        Category cat = new Category("Bebidas","Todos os tipos de bebidas, menos álcool.");
        CategoryDAO dao = new CategoryDAO();
        
        
        dao.create(cat);
        
    }
}
