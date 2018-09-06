package sample.model.dao;
/**
 * Market
 * Class DAO of Sales
 * @author Elias Ferreira
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sample.model.bean.Sale;
import sample.connection.ConnectionMarket;

public class SaleDAO {
    
    public void create(Sale sale) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("INSERT INTO sales (id_user, date, time) VALUES (?,?,?)");
            
            statement.setInt(1, sale.getUserId());
            statement.setString(2, sale.getSaleDate());
            statement.setString(3, sale.getSaleTime());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao salvar!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
    }
}