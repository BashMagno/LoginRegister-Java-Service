
package sqlconexion;


public class Usuario 
{
        private int id;
        public String username;
        public String email;
        public String password;

        public Usuario(String username, String email, String password) 
        {
            this.username = username;
            this.email = email;
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
        public void setEmail (String email)
        {
            this.email = email;
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
        public String getEmail()
        {
            return email;
        }
        public String getPassword() 
        {
            return password;
        }
}

