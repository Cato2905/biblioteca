
package Models;

public class Libros {
    private int id;
    private String titulo;
    private int autor;
    private int editorial;
    private int documento;
    private int cantidad;
    private String isbn;
    private String codigo;
    private String autor_nombre;
    private String editorial_nombre;
    private String documento_nombre;
    private String resumen;
    private int estadoLib;

    public Libros() {
    }

    public Libros(int id, String titulo, int autor, int editorial, int documento, int cantidad, String isbn, String codigo, String autor_nombre, String editorial_nombre, String documento_nombre, String resumen, int estadoLib) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.documento = documento;
        this.cantidad = cantidad;
        this.isbn = isbn;
        this.codigo = codigo;
        this.autor_nombre = autor_nombre;
        this.editorial_nombre = editorial_nombre;
        this.documento_nombre = documento_nombre;
        this.resumen = resumen;
        this.estadoLib = estadoLib;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor_nombre() {
        return autor_nombre;
    }

    public void setAutor_nombre(String autor_nombre) {
        this.autor_nombre = autor_nombre;
    }

    public String getEditorial_nombre() {
        return editorial_nombre;
    }

    public void setEditorial_nombre(String editorial_nombre) {
        this.editorial_nombre = editorial_nombre;
    }

    public String getDocumento_nombre() {
        return documento_nombre;
    }

    public void setDocumento_nombre(String documento_nombre) {
        this.documento_nombre = documento_nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getEstadoLib() {
        return estadoLib;
    }

    public void setEstadoLib(int estadoLib) {
        this.estadoLib = estadoLib;
    }

    
    
}
