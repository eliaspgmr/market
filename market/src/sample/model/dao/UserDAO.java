package sample.model.dao;
/**
 * Market
 * Class DAO of user
 * @author Elias Ferreira
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sample.connection.ConnectionMarket;
import sample.model.bean.User;
import sample.model.Criptography;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserDAO {
    
    //Create a new User on system
    public void create(User user) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("INSERT INTO users (id_role, name, login, password) VALUES (?,?,?,?)");
            statement.setInt(1, user.getIdRole());
            statement.setString(2, user.getName());
            statement.setString(3, user.getLogin());
            statement.setString(4, Criptography.enc( user.getSenha()));
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao salvar!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
        
    }
    
    //List all the users of the system
    public List<User> listUser() {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        List<User> userList = new ArrayList<>();
        
        try {
            
            statement = connection.prepareStatement("SELECT * FROM users");
            result = statement.executeQuery();
            
            while(result.next()) {
                
                User user = new User(result.getInt("id_user"),
                                     result.getInt("id_role"),
                                     result.getString("name"),
                                     result.getString("login"),
                                     result.getString("password"));
                
                userList.add(user);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement, result);
        }
        
        return userList;
    }
    
    //Delete a specific user
    public void delete(User user) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        
        try {
            
            statement = connection.prepareStatement("DELETE FROM users WHERE id_user = ?");
            statement.setInt(1, user.getId());
            
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao excluir!"+ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement);
        }
        
    }
    
    //Select user by login
    public User select(String login) {
        
        Connection connection = ConnectionMarket.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;
        User user = new User();
        
        try {
            
            statement = connection.prepareStatement("SELECT * FROM users WHERE login = ?");
            statement.setString(1, login);
            result = statement.executeQuery();
            
            if(result.next()) {
                
               user.setId(result.getInt("id_user"));
               user.setIdRole(result.getInt("id_role"));
               user.setName(result.getString("name"));
               user.setLogin(result.getString("login"));
               user.setSenha(result.getString("password"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionMarket.closeConnection(connection, statement, result);
        }
        
        return user;
    }
    
    
}
