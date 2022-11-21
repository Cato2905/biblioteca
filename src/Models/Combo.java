
package Models;

public class Combo {
    private int id;
    private int cantidadTotal;
    private String nombre;

    public Combo(int id ,String nombre, int cantidadTotal) {
        this.id = id;
        this.cantidadTotal = cantidadTotal;
        this.nombre = nombre;
    }

    public Combo() {
    }

//    public Combo(int id, String nombre) {
//        this.id = id;
//        this.nombre = nombre;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
    }
