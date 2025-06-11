package formulario;


public class RolItem {
       
    private int id;
    private String nombre;
    
    public RolItem(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    
    @Override
    public String toString() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}


