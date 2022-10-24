package Models;

public class Socios {

    private int id;
    private String rut;
    private String email;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String telefono;
    private String direccion;
    private String comuna;
    private String contrasena;
    private String nacimiento;
    private int estadoSoc;

    public Socios() {
    }

    public Socios(int id, String rut, String email, String nombre, String apellidoPat, String apellidoMat, String telefono, String direccion, String comuna, String contrasena, String nacimiento, int estadoSoc) {
        this.id = id;
        this.rut = rut;
        this.email = email;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.estadoSoc = estadoSoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEstadoSoc() {
        return estadoSoc;
    }

    public void setEstadoSoc(int estadoSoc) {
        this.estadoSoc = estadoSoc;
    }

}
