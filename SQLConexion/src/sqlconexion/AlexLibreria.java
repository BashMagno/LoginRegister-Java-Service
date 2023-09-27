
package sqlconexion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//Libreria creada por mí, iré añadiendo más funciones
public class AlexLibreria {

    public static int contarCaracteres(String s)
    {
        int carFinales = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            carFinales++;
        }

        return carFinales;
    }
    
    public static String encriptarMD5(String texto) {
        try {
            // Obtener la instancia de MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Convertir la cadena de texto a bytes y calcular el hash
            byte[] bytes = md.digest(texto.getBytes());
            
            // Convertir el hash a una representación hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null; // Manejo de error
        }
    }
}
