
package Models;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DocumentosDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean registrar(Documentos mt) {
        String sql = "INSERT INTO documentos (documento) VALUES (?)";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mt.getDocumento());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean actualizar(Documentos mt) {
        boolean res;
        String sql = "UPDATE documentos SET documento=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mt.getDocumento());
            ps.setInt(2, mt.getId());
            ps.execute();
            res = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
        }
        return res;
    }

    public List Listar(String valor) {
        List<Documentos> lista = new ArrayList();
        try {
            con = cn.getConnection();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT * FROM documentos ORDER BY id DESC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT * FROM documentos WHERE documento LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Documentos mt = new Documentos();
                mt.setId(rs.getInt("id"));
                mt.setDocumento(rs.getString("documento"));
                lista.add(mt);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public boolean eliminar(int id) {

        String sql = "DELETE FROM documentos WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
}
