package Models;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrestamosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Prestamos pre) {
        String sql = "INSERT INTO prestamos (id_socio, id_libro, cantidad, fecha_prestamo, fecha_devolucion) VALUES (?,?,?,?,?)";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pre.getSocio());
            ps.setInt(2, pre.getLibro());
            ps.setInt(3, pre.getCantidad());
            ps.setString(4, pre.getFecha_prestamo());
            ps.setString(5, pre.getFecha_dev());
            
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean actualizar(int id) {
        boolean res;
        String sql = "UPDATE prestamos SET estado=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
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
        List<Prestamos> lista = new ArrayList();
        try {
            con = cn.getConnection();
            if ("".equalsIgnoreCase(valor)) {                 
                String sql = "SELECT p.*, l.id AS id_libro, l.titulo, s.id AS id_soc, s.nombre FROM prestamos p INNER JOIN libros l ON l.id = p.id_libro INNER JOIN socios s ON s.id = p.id_socio ORDER BY p.id DESC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT p.*, l.id AS id_libro, l.titulo, s.id AS id_soc, s.nombre FROM prestamos p INNER JOIN libros l ON l.id = p.id_libro INNER JOIN socios s ON s.id = p.id_socio WHERE s.nombre LIKE '%" + valor + "%' OR l.titulo LIKE '%" + valor + "%' OR p.fecha_prestamo LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Prestamos pre = new Prestamos();
                pre.setId(rs.getInt("id"));
                pre.setTitulo(rs.getString("l.titulo"));
                pre.setNombre_soc(rs.getString("nombre"));
                pre.setCantidad(rs.getInt("cantidad"));
                pre.setFecha_prestamo(rs.getString("fecha_prestamo"));
                pre.setFecha_dev(rs.getString("fecha_devolucion"));
                pre.setEstado(rs.getInt("estado"));
                pre.setLibro(rs.getInt("id_libro"));
                pre.setSocio(rs.getInt("id_socio"));
                int ver = pre.getEstado();
                int stock = pre.getCantidad();
                if (ver == 1) {
                    lista.add(pre);
                }

            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

}
