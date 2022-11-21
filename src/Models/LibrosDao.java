package Models;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LibrosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Libros lb) {
        String sql = "INSERT INTO libros (titulo, id_autor, id_editorial, id_documento, cantidad, isbn, codigo, resumen) VALUES (?,?,?,?,?,?,?,?)";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, lb.getTitulo());
            ps.setInt(2, lb.getAutor());
            ps.setInt(3, lb.getEditorial());
            ps.setInt(4, lb.getDocumento());
            ps.setInt(5, lb.getCantidadTotal());
            ps.setString(6, lb.getIsbn());
            ps.setString(7, lb.getCodigo());
            ps.setString(8, lb.getResumen());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean actualizar(Libros lb) {
        boolean res;
        String sql = "UPDATE libros SET titulo=?, id_autor=?, id_editorial=?, id_documento=?, cantidad=?, isbn=?, codigo=?, resumen=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, lb.getTitulo());
            ps.setInt(2, lb.getAutor());
            ps.setInt(3, lb.getEditorial());
            ps.setInt(4, lb.getDocumento());
            ps.setInt(5, lb.getCantidadTotal());
            ps.setString(6, lb.getIsbn());
            ps.setString(7, lb.getCodigo());
            ps.setString(8, lb.getResumen());
            ps.setInt(9, lb.getId());
            ps.execute();
            res = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
        }
        return res;
    }

        public boolean actualizarStock(int id, int cantidad) {
        boolean res;
        String sql = "UPDATE libros SET stock=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, (cantidad));
            ps.setInt(2, id);
            ps.execute();
            res = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
        }
        return res;
    }
    
    public List Listar(String valor) {
        List<Libros> lista = new ArrayList();
        try {
            con = cn.getConnection();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT l.*, e.id AS id_editorial, e.editorial, a.id AS id_autor, a.autor, m.id AS id_documento, m.documento FROM libros l INNER JOIN editorial e ON e.id = l.id_editorial INNER JOIN autor a ON a.id = l.id_autor INNER JOIN documentos m ON m.id = l.id_documento ORDER BY l.id DESC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT l.*, e.id AS id_editorial, e.editorial, a.id AS id_autor, a.autor, m.id AS id_documento, m.documento FROM libros l INNER JOIN editorial e ON e.id = l.id_editorial INNER JOIN autor a ON a.id = l.id_autor INNER JOIN documentos m ON m.id = l.id_documento WHERE l.titulo LIKE '%" + valor + "%' OR e.editorial LIKE '%" + valor + "%' OR m.documento LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Libros lb = new Libros();
                lb.setId(rs.getInt("id"));
                lb.setTitulo(rs.getString("titulo"));
                lb.setAutor(rs.getInt("id_autor"));
                lb.setEditorial(rs.getInt("id_editorial"));
                lb.setDocumento(rs.getInt("id_documento"));
                lb.setCantidadTotal(rs.getInt("cantidad"));
                lb.setIsbn(rs.getString("isbn"));
                lb.setCodigo(rs.getString("codigo"));
                lb.setAutor_nombre(rs.getString("autor"));
                lb.setEditorial_nombre(rs.getString("editorial"));
                lb.setDocumento_nombre(rs.getString("documento"));
                lb.setResumen(rs.getString("resumen"));
                lb.setEstadoLib(rs.getInt("estadoLib"));
                lb.setStock(rs.getInt("stock"));
                lista.add(lb);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

     public boolean eliminar(int id) {

        boolean res;
        String sql = "UPDATE libros SET estadoLib=? WHERE id = ?";
        con = cn.getConnection();
        res = true;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, id);
            ps.execute();
            return res;

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
            return res;
        }
    }

     
     
    public boolean recuperar(int id) {

        boolean res;
        String sql = "UPDATE libros SET estadoLib=? WHERE id = ?";
        con = cn.getConnection();
        res = true;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, id);
            ps.execute();
            return res;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
            return res;
        }
    }

    public Combo getAutor(String valor) {
        Combo lb = new Combo();
        String sql = "SELECT * FROM autor WHERE autor = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, valor);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lb;
    }

    public Combo getEditorial(String valor) {
        Combo lb = new Combo();
        String sql = "SELECT * FROM editorial WHERE editorial = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, valor);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lb;
    }

    public Combo getDocumento(String valor) {
        Combo lb = new Combo();
        String sql = "SELECT * FROM documentos WHERE documento = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, valor);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lb;
    }
    
    


    
}
