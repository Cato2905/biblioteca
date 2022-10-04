
package Models;

public class Documentos {
    private int id;
    private String documento;

    public Documentos() {
    } 

    public Documentos(int id, String documento) {
        this.id = id;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    @Override
    public String toString(){
        return this.getDocumento();
    }
}
