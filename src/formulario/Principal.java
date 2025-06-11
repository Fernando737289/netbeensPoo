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

            // Insertar un ROL (solo si no existe)
            int resRol = control.mandarSQL(
                "INSERT INTO Roles (rol_id, rol_nombre) VALUES (1, 'Administrador')"
            );
            if (resRol > 0) {
                System.out.println("✅ Rol insertado correctamente.");
            }

            // Insertar un USUARIO (solo si no existe)
            int resUsuario = control.mandarSQL(
                "INSERT INTO Usuario (us_id, us_nom, us_pwd, us_nom_col, us_rol_id) " +
                "VALUES (1, 'Admin', '123456', 'Administrador Principal', 1)"
            );
            if (resUsuario > 0) {
                System.out.println("✅ Usuario insertado correctamente.");
            }

            // Consultar usuarios
            rs = control.mandarQUERY("SELECT * FROM Usuario");

            System.out.println("📋 Lista de usuarios:");
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("us_id") +
                    " | Nombre: " + rs.getString("us_nom") +
                    " | Rol ID: " + rs.getInt("us_rol_id")
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
