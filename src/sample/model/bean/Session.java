/**
 * Market
 * Session Class of the user
 * @author Elias Ferreira
 */
package sample.model.bean;
public class Session {
    
    //Variables
    private static int userId;
    private static int userRole;
    private static String userLogin;
    private static String userName;
    
    //Method to close the session
    public static void close(){
        
        userId = 0;
        userLogin = null;
        userName = null;
        userRole = 0;

    }

    //Open the session
    public static void open(User user) {

        userId = user.getId();
        userLogin = user.getLogin();
        userName = user.getName();
        userRole = user.getIdRole();
        
    }

    //Getters
    public static String getUserLogin() {
        return userLogin;
    }
    
    public static String getUserName() {
        return userName;
    }

    public static int getUserId() {
        return userId;
    }  

    public static int getUserRole() {
        return userRole;
    }
    
}
