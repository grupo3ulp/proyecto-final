package TPF.Control;

import TPF.Modelo.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ComidaData {

    private Connection conec;

    public ComidaData() {
        this.conec = Conexion.getConexion();
    }

    public void crearComida(Comida c) {
        try {
            String sql = "INSERT INTO `comida`( `nombre`, `detalles`, `calorias`, `estado`) VALUES (?,?,?,?);";
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDetalles());
            ps.setInt(3, c.getCalorias());
            ps.setBoolean(4, true);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La comida fue agregada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la comida");
            }

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                c.setId(rs.getInt(1));
            }

            conec.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarComida(Comida c, String nombre, String detalles, int calorias) {
        try {
            String sql = "UPDATE `comida` SET `id`=?,`nombre`=?,`detalles`=?,`calorias`=? WHERE id=?";
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, c.getId());
            ps.setString(2, nombre);
            ps.setString(3, detalles);
            ps.setInt(4, calorias);
            ps.setInt(5, c.getId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La comida fue modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la comida");
            }
            conec.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarComida(int id) {
        String sql = "UPDATE `itemdieta` SET `estado`=0 WHERE id_comida=?";
        String sql2 = "UPDATE `comida` SET `estado`=0 WHERE id=?";

        if ((JOptionPane.showConfirmDialog(null, "Borrará la "
                + "comida con id " + id + " y todos los datos relacionados a esta, ¿Desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)) == 0) {
            try {
                PreparedStatement ps = conec.prepareStatement(sql);
                PreparedStatement ps2 = conec.prepareStatement(sql2);
                ps.setInt(1, id);
                ps2.setInt(1, id);
                if (ps.executeUpdate() > 0 || ps2.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "La comida fue eliminada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar la comida");
                }

                conec.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

            }
        }
    }

    public Comida mostrarComida(int id) {
        String sql = "SELECT * FROM `comida` WHERE estado=1 AND id = ?";
        Comida comidaAux = new Comida();
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comidaAux.setId(id);
                comidaAux.setNombre(rs.getString("nombre"));
                comidaAux.setDetalles(rs.getString("detalles"));
                comidaAux.setCalorias(rs.getInt("calorias"));
                comidaAux.setEstado(rs.getBoolean("estado"));
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
        return comidaAux;
    }

    public ArrayList<Comida> mostrarComidas() {
        ArrayList<Comida> listaAux = new ArrayList();
        String sql = "SELECT * FROM `comida` WHERE estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comidaAux = new Comida();
                comidaAux.setId(rs.getInt("id"));
                comidaAux.setNombre(rs.getString("nombre"));
                comidaAux.setDetalles(rs.getString("detalles"));
                comidaAux.setCalorias(rs.getInt("calorias"));
                comidaAux.setEstado(rs.getBoolean("estado"));
                listaAux.add(comidaAux);
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
        return listaAux;

    }

}
