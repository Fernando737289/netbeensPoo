package formulario;

import clases.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static Controlador control;
    public static ResultSet rs;

    public static void main(String[] args) {

        try {
            // Crear conexión a la base de datos Access
            control = new Controlador();
            control.crearConexion();
            System.out.println("✅ Conexión establecida correctamente.");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
