/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import sample.model.bean.Sale;
import sample.model.dao.SaleDAO;
/**
 *
 * @author Elias Ferreira
 */
public class TestSale {
    
    public static void main(String[] args) {
        
        Sale sale = new Sale(1, "2018/06/15", "20:42:00");
        SaleDAO dao = new SaleDAO();
        
        
        
        dao.create(sale);
        
    }
    
}
