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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoleDAO {
    
    //Create a new role
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

    //List all the roles
    public List<Roles> listRoles() {

        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        List<Roles> rolesList = new ArrayList<>(); 
        
        try {
            
            statement = connection.prepareStatement("SELECT * FROM roles");
            result = statement.executeQuery();
            
            while(result.next()) {
                
                Role role = new Role(result.getInt("id_role"),
                                     result.getInt("name"),
                                     result.getString("description");
                
                rolesList.add(role);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement, result);
        }
        
        return rolesList;

    }

    public Role selectById(int id) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        Role role = new Role();
        
        try {
            
            statement = connection.prepareStatement("SELECT * FROM roles WHERE id_user = ?");
            statement.setInt(1, id);
            result = statement.executeQuery();
            
            if(result.next()) {
                
               role.setRoleId(result.getInt("id_role"));
               role.setRoleName(result.getString("name"));
               role.setRoleDescription(result.getString("description"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement, result);
        }
        
        return role;
    }
}
