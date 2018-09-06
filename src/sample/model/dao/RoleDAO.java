package sample.model.dao;
/**
 * Market
 * Class DAO of Roles
 * @author Elias Ferreira
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sample.model.bean.Roles;
import sample.connection.ConnectionMarket;

public class RoleDAO {
    
    public void create(Roles role) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("INSERT INTO roles (name, description) VALUES (?,?)");
            
            statement.setString(1, role.getRoleName());
            statement.setString(2, role.getRoleDescription());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao salvar!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
    }
}
