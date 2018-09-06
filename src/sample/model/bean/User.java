package sample.model.bean;

/**
 * Market
 * User Class
 * @author Elias Ferreira
 */
public class User {
    
    public User() {
        
        this.id = 0;
        this.idRole = 0;
        this.name = null;
        this.login = null;
        this.senha = null;
        this.roleName = null;
        
    }
    
    public User(int idRole, String name, String login, String senha) {
        
        this.idRole = idRole;
        this.name = name;
        this.login = login;
        this.senha = senha;
        
    }
    
    public User(int id, int idRole, String name, String login, String senha) {
        
        this.id = id;
        this.idRole = idRole;
        this.name = name;
        this.login = login;
        this.senha = senha;
        
    }

    public User(int id, int idRole, String name, String login, String senha, String roleName) {
        
        this.id = id;
        this.idRole = idRole;
        this.name = name;
        this.login = login;
        this.senha = senha;
        this.roleName = roleName;
        
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    private int id;
    private int idRole;
    private String name;
    private String login;
    private String senha;
    private String roleName;
    
}
