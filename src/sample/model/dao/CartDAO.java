package sample.model.dao;
/**
 * Market
 * Class DAO of Carts
 * @author Elias Ferreira
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sample.model.bean.Cart;
import sample.connection.ConnectionMarket;

public class CartDAO {
    
    public void create(Cart cart) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("INSERT INTO carts (id_sale, id_product, quantity) VALUES (?,?,?)");
            
            statement.setInt(1, cart.getSaleId());
            statement.setInt(2, cart.getProductId());
            statement.setInt(3, cart.getCartQuantity());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao salvar!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
    }
}