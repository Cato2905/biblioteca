package Models;

public class Prestamos {

    private int id;
    private int socio;
    private String nombre_soc;
    private int libro;
    private int libro1;
    private int libro2;
    private String titulo;
    private int cantidad;
    private int cantidad1;
    private int cantidad2;
    private String fecha_prestamo;
    private String fecha_dev;
    private int estado;

    public Prestamos() {
    }

    public Prestamos(int id, int socio, String nombre_soc, int libro, int libro1, int libro2, String titulo, int cantidad, int cantidad1, int cantidad2, String fecha_prestamo, String fecha_dev, int estado) {
        this.id = id;
        this.socio = socio;
        this.nombre_soc = nombre_soc;
        this.libro = libro;
        this.libro = libro1;
        this.libro = libro2;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.cantidad = cantidad2;
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

    public int getLibro1() {
        return libro1;
    }

    public void setLibro1(int libro1) {
        this.libro1 = libro1;
    }

    public int getLibro2() {
        return libro2;
    }

    public void setLibro2(int libro2) {
        this.libro2 = libro2;
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

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
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
