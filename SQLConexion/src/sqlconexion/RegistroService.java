
package sqlconexion;

import java.sql.*;

public class RegistroService 
{

    public static boolean registrar(Usuario usuario) 
    {
        Connection conexion = ConexionMySQL.obtenerConexion();
        PreparedStatement statement = null;

        try 
        {
            // Comprobar si el usuario ya existe
            String consultaExistencia = "SELECT COUNT(*) FROM usuarios WHERE username = ?";
            statement = conexion.prepareStatement(consultaExistencia);
            statement.setString(1, usuario.getUsername());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) 
            {
                int count = resultSet.getInt(1);
                if (count > 0) 
                {
                    System.out.println("El nombre de usuario ya existe. Error.");
                    return false;
                }
            }
            
            // Registrar el usuario
            String consultaRegistro = "INSERT INTO usuarios (username, email, password) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(consultaRegistro);
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getEmail());
            statement.setString(3, usuario.getPassword());

            return statement.executeUpdate() > 0;
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        } 
        finally 
        {
            try 
            {
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } 
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}