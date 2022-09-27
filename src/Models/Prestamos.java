
package Models;

public class Prestamos {
    private int id;
    private int socio;
    private String nombre_est;
    private int libro;
    private String titulo;
    private int cantidad;
    private String fecha_prestamo;
    private String fecha_dev;
    private int estado;

    public Prestamos() {
    }

    public Prestamos(int id, int socio, String nombre_est, int libro, String titulo, int cantidad, String fecha_prestamo, String fecha_dev, int estado) {
        this.id = id;
        this.socio = socio;
        this.nombre_est = nombre_est;
        this.libro = libro;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_dev = fecha_dev;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSocio() {
        return socio;
    }

    public void setSocio(int socio) {
        this.socio = socio;
    }

    public String getNombre_est() {
        return nombre_est;
    }

    public void setNombre_est(String nombre_est) {
        this.nombre_est = nombre_est;
    }

    public int getLibro() {
        return libro;
    }

    public void setLibro(int libro) {
        this.libro = libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_dev() {
        return fecha_dev;
    }

    public void setFecha_dev(String fecha_dev) {
        this.fecha_dev = fecha_dev;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    
}
