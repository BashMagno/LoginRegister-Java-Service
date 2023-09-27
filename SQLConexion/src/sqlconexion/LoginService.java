
package sqlconexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
    public static boolean autenticar(String username, String password) {
        Connection conexion = ConexionMySQL.obtenerConexion();
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            String consulta = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, username);
            statement.setString(2, password);
            resultado = statement.executeQuery();
            return resultado.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

