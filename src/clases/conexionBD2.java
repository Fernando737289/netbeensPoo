package clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexionBD2 {

    private Connection conn;
    private Statement sentencia;

    private final String nombreBD;

    public conexionBD2() {
        this.nombreBD = "C:\\Users\\alumnos.republica\\Downloads\\proyectoPoo\\netbeensPoo\\BD\\AccessPOO.accdb";
    }

    public boolean establecerConexion() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");


            conn = DriverManager.getConnection("jdbc:ucanaccess://" + this.nombreBD);


            this.sentencia = this.conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            System.out.println("✅ Conexión establecida correctamente.");
            return true;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el driver UCanAccess: " + e);
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base Access: " + e);
            return false;
        }
    }

    public ResultSet ejecutamosSentenciaQuery(String sql) throws SQLException {
        return this.sentencia.executeQuery(sql);
    }

    public int ejecutamosSentenciaSql(String sql) throws SQLException {
        return this.sentencia.executeUpdate(sql);
    }

    public void cerrarConexion() throws SQLException {
        if (conn != null) conn.close();
    }
}
