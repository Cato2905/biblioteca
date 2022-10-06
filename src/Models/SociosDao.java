package Models;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SociosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Socios est) {
        String sql = "INSERT INTO socios (rut, email, nombre, telefono, direccion,nacimiento) VALUES (?,?,?,?,?,?)";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getRut());
            ps.setString(2, est.getEmail());
            ps.setString(3, est.getNombre());
            ps.setString(4, est.getTelefono());
            ps.setString(5, est.getDireccion());
            ps.setString(6, est.getNacimiento());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean actualizar(Socios est) {
        boolean res;
        String sql = "UPDATE socios SET rut=?, email=?, nombre=?, telefono=?, direccion=?, nacimiento=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getRut());
            ps.setString(2, est.getEmail());
            ps.setString(3, est.getNombre());
            ps.setString(4, est.getTelefono());
            ps.setString(5, est.getDireccion());
            ps.setString(6, est.getNacimiento());
            ps.setInt(7, est.getId());
            ps.execute();
            res = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
        }
        return res;
    }

    public List Listar(String valor) {
        List<Socios> lista = new ArrayList();
        try {
            con = cn.getConnection();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT * FROM socios ORDER BY id DESC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT * FROM socios WHERE nombre LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Socios est = new Socios();
                est.setId(rs.getInt("id"));
                est.setRut(rs.getString("rut"));
                est.setEmail(rs.getString("email"));
                est.setNombre(rs.getString("nombre"));
                est.setTelefono(rs.getString("telefono"));
                est.setDireccion(rs.getString("direccion"));
                est.setNacimiento(rs.getString("nacimiento"));
                lista.add(est);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public boolean eliminar(int id) {

        String sql = "DELETE FROM socios WHERE id = ?";
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

    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    

}
