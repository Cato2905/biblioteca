package Models;

public class Prestamos {

    private int id;
    private int socio;
    private String nombre_soc;
    private int libro;
    private String titulo;
    private int cantidad;
    private String titulo1;
    private int cantidad1;
    private String titulo2;
    private int cantidad2;
    private String fecha_prestamo;
    private String fecha_dev;
    private int estado;

    public Prestamos() {
    }

    public Prestamos(int id, int socio, String nombre_soc, int libro, String titulo, int cantidad, String titulo1, int cantidad1, String titulo2, int cantidad2, String fecha_prestamo, String fecha_dev, int estado) {
        this.id = id;
        this.socio = socio;
        this.nombre_soc = nombre_soc;
        this.libro = libro;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.titulo = titulo1;
        this.cantidad = cantidad1;
        this.titulo = titulo2;
        this.cantidad = cantidad2;
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

    public String getNombre_soc() {
        return nombre_soc;
    }

    public void setNombre_soc(String nombre_soc) {
        this.nombre_soc = nombre_soc;
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

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
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
