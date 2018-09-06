package sample.model.dao;
/**
 * Market
 * Class DAO of Products
 * @author Elias Ferreira
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sample.model.bean.Product;
import sample.connection.ConnectionMarket;

public class ProductDAO {
    
    public void create(Product product) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("INSERT INTO products (id_category, name, price, quantity) VALUES (?,?,?,?)");
            
            statement.setInt(1, product.getCategoryId());
            statement.setString(2, product.getProductName());
            statement.setDouble(3, product.getProductPrice());
            statement.setInt(4, product.getProductQuantity());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao salvar!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
    }
}
