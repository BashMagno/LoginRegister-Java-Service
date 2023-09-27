
package sqlconexion;


public class UsuarioPrivilegiado
{
    
    private int id;
    public String username;
    public String role;
    public String password;
 
    public UsuarioPrivilegiado(String username, String role, String password)
    {
        this.username = username;
        this.role = role;
        this.password = password;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getRole()
    {
        return role;
    }

    public String getPassword()
    {
        return password;
    }

}
