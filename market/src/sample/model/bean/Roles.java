package sample.model.bean;
/**
 * Market
 * Class Roles
 * @author Elias Ferreira
 */
public class Roles {
    
    public Roles() {
        
        this.roleId = 0;
        this.roleName = null;
        this.roleDescription = null;
        
    }
    
    public Roles(String roleName, String roleDescription) {
        
        this.roleName = roleName;
        this.roleDescription = roleDescription;
        
    }
    
    public Roles(int roleId, String roleName, String roleDescription) {
        
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
        
    }
    
    private int roleId;
    private String roleName;
    private String roleDescription;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
    
}
