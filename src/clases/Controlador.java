package clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controlador {
    private final conexionBD2 con;
    
    public Controlador(){
        this.con = new conexionBD2();
    }
    
    public void crearConexion() throws SQLException{
        this.con.establecerConexion();
    }
    
    
    public ResultSet mandarQUERY(String sql) throws SQLException{

        ResultSet aux_result = this.con.ejecutamosSentenciaQuery(sql);
        return aux_result;

        
       
    }
    
    public int mandarSQL(String sql) throws SQLException{    
        

        int aux = this.con.ejecutamosSentenciaSql(sql);
        return aux; 

    }  
    
}

