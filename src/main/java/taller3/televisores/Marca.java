package taller3.televisores; 

public class Marca {
    private String nombre;


    public Marca(String marca){
        this.nombre = marca;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public String getNombre(){
        return nombre;
    }
}
