
package sqlconexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
        /* 
    *  Puedes poner los espacios como '%20' o como '+' si da problemas
    *  Por ejemplo: si tu base de datos se llama:
    *  Mi empresa BD -> lo puedes poner así -> Mi%20empresa%20BD o Mi+empresa+BD :)
    */
    private static final String URL = "jdbc:mysql://localhost:3306/nombre_base_datos"; 
    private static final String USUARIO = "user";
    private static final String CONTRASEÑA = "pass";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("Conectado a la base de datos como [" + USUARIO + "]" );
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
