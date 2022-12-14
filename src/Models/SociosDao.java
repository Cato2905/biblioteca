package Models;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SociosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrar(Socios est) {
        String sql = "INSERT INTO socios (rut, email, nombre, apellido_pat, apellido_mat, telefono, direccion, comuna, nacimiento, contrasena, limite) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getRut());
            ps.setString(2, est.getEmail());
            ps.setString(3, est.getNombre());
            ps.setString(4, est.getApellidoPat());
            ps.setString(5, est.getApellidoMat());
            ps.setString(6, est.getTelefono());
            ps.setString(7, est.getDireccion());
            ps.setString(8, est.getComuna());
            ps.setString(9, est.getNacimiento());
            ps.setString(10, est.getContrasena());
            ps.setInt(11, est.getLimite());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public boolean actualizar(Socios est) {
        boolean res;
        String sql = "UPDATE socios Set rut=?, email=?, nombre=?, apellido_pat=?, apellido_mat=?, telefono=?, direccion=?, comuna=?, nacimiento=?, contrasena=? WHERE id = ?";
        //  String sql = "UPDATE socios SET rut=?, email=?, nombre=?, apellido_pat=?, apellido_mat=?, telefono=?, direccion=?, comuna=?, nacimiento=?, contrasena=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getRut());
            ps.setString(2, est.getEmail());
            ps.setString(3, est.getNombre());
            ps.setString(4, est.getApellidoPat());
            ps.setString(5, est.getApellidoMat());
            ps.setString(6, est.getTelefono());
            ps.setString(7, est.getDireccion());
            ps.setString(8, est.getComuna());
            ps.setString(9, est.getNacimiento());
            ps.setString(10, est.getContrasena());
            ps.setInt(11, est.getId());
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
                String sql = "SELECT * FROM socios WHERE rut LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Socios soc = new Socios();
                soc.setId(rs.getInt("id"));
                soc.setRut(rs.getString("rut"));
                soc.setEmail(rs.getString("email"));
                soc.setNombre(rs.getString("nombre"));
                soc.setApellidoPat(rs.getString("apellido_pat"));
                soc.setApellidoMat(rs.getString("apellido_mat"));
                soc.setTelefono(rs.getString("telefono"));
                soc.setDireccion(rs.getString("direccion"));
                soc.setComuna(rs.getString("comuna"));
                soc.setNacimiento(rs.getString("nacimiento"));
                soc.setContrasena(rs.getString("contrasena"));
                soc.setEstadoSoc(rs.getInt("estadoSoc"));
                soc.setLimite(rs.getInt("limite"));
                lista.add(soc);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }
    
        public boolean actualizarLimite(int id, int limite) {
        boolean res;
        String sql = "UPDATE socios SET limite=? WHERE id = ?";
        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, limite);
            ps.setInt(2, id);
            ps.execute();
            res = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
        }
        return res;
    }
        
        
    public boolean eliminar(int id) {

        boolean res;
        String sql = "UPDATE socios SET estadoSoc=? WHERE id = ?";
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
        String sql = "UPDATE socios SET estadoSoc=? WHERE id = ?";
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

    static public String formatear(String rut) {
        int cont = 0;
        String format;
        if (rut.length() == 0) {
            return "";
        } else {
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            format = "-" + rut.substring(rut.length() - 1);
            for (int i = rut.length() - 2; i >= 0; i--) {
                format = rut.substring(i, i + 1) + format;
                cont++;
                if (cont == 3 && i != 0) {
                    format = "." + format;
                    cont = 0;
                }
            }
            return format;
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

    private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean emailValidator(String email) {
        if (email == null) {
            return false;
        }

        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public boolean verificarExistente(String rut) {

        List<Socios> lista = Listar("");
        for (int i = 0; i < lista.size(); i++) {
            String rutVeri = lista.get(i).getRut();
            if (rutVeri.equals(rut)) {
//                JOptionPane.showMessageDialog(null, " false");
                return false;
            } else {
//                JOptionPane.showMessageDialog(null, " true");
                
            }
        }

        return true;
    }
}
