package sample.model.dao;
/**
 * Market
 * Class DAO of Categories
 * @author Elias Ferreira
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sample.model.bean.Category;
import sample.connection.ConnectionMarket;

public class CategoryDAO {
    
    public void create(Category category) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("INSERT INTO categories (name, description) VALUES (?,?)");
            
            statement.setString(1, category.getCategoryName());
            statement.setString(2, category.getCategoryDescription());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao salvar!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
    }
}