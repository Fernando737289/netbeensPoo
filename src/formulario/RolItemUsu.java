
package formulario;


public class RolItemUsu {

       
    private int id;
    private String nombre;
    private String nomCom;
    
    public RolItemUsu(int id, String nombre, String nomCom){
        this.id = id;
        this.nombre = nombre;
        this.nomCom = nomCom;
    }

    
    @Override
    public String toString() {
        return nombre;
    }

    public int getId() {
        return id;
    }
    
    public String nomCom(){
        return nomCom;
    }
}
    

