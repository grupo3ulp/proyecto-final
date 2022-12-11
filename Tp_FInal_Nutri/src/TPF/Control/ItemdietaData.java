package TPF.Control;

import TPF.Modelo.Comida;
import TPF.Modelo.Dieta;
import TPF.Modelo.Itemdieta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ItemdietaData {

    private Connection conec;

    public ItemdietaData() {
        this.conec = Conexion.getConexion();
    }

    public void createItemDieta(Itemdieta itemDieta) {
        String sql = "INSERT INTO `itemdieta`(`id_dieta`, `id_comida`, `cantidad`, `dia`, `estado`)  VALUES (?,?,?,?,?)";
        int id_dieta = itemDieta.getDieta().getId();
        int id_comida = itemDieta.getComida().getId();
        try {

            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_dieta);
            ps.setInt(2, id_comida);
            ps.setInt(3, itemDieta.getCantidad());
            ps.setInt(4, itemDieta.getDia());
            ps.setBoolean(5, true);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el registro");

            }

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                itemDieta.setId(rs.getInt(1));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }

    }

    public Itemdieta readItemDieta(int id) {
        String sql = "SELECT * FROM `itemdieta` WHERE estado=1 and id=?";
        Itemdieta itemDietaAux = new Itemdieta();
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                DietaData dietaData = new DietaData();
                ComidaData comidaData = new ComidaData();
                Dieta dietaAux = dietaData.readDieta(rs.getInt(2));
                Comida comidaAux = comidaData.mostrarComida(rs.getInt(3));
                itemDietaAux.setId(id);
                itemDietaAux.setDieta(dietaAux);
                itemDietaAux.setComida(comidaAux);
                itemDietaAux.setCantidad(rs.getInt(4));
                itemDietaAux.setDia(rs.getInt(5));
                itemDietaAux.setEstado(rs.getBoolean(6));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea " + ex);

        }
        return itemDietaAux;
    }

    public ArrayList<Itemdieta> readAllItemDieta() {
        ArrayList<Itemdieta> listaAux = new ArrayList();
        String sql = "SELECT * FROM `itemdieta` WHERE estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Itemdieta itemDietaAux = new Itemdieta();
                DietaData dietaData = new DietaData();
                ComidaData comidaData = new ComidaData();

                Dieta dietaAux = dietaData.readDieta(rs.getInt(2));
                Comida comidaAux = comidaData.mostrarComida(rs.getInt(3));

                itemDietaAux.setId(rs.getInt(1));
                itemDietaAux.setDieta(dietaAux);
                itemDietaAux.setComida(comidaAux);
                itemDietaAux.setCantidad(rs.getInt(4));
                itemDietaAux.setDia(rs.getInt(5));
                itemDietaAux.setEstado(rs.getBoolean(6));

                listaAux.add(itemDietaAux);
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea " + ex);
        }
        return listaAux;
    }

    public void updateItemDieta(int id, int cantidad, int dia, boolean estado) {
        String sql = "UPDATE `itemdieta` SET `cantidad`=?,`dia`=?,`estado`=? WHERE id=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, cantidad);
            ps.setInt(2, dia);
            ps.setBoolean(3, estado);
            ps.setInt(4, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }

    }

    public void deleteItemDietaIdDieta(int id) {
        String sql = "UPDATE `itemdieta` SET `estado`=0 WHERE id_comida=?";

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea " + ex);

        }

    }

    public void deleteItemDieta(int id) {
        String sql = "UPDATE `itemdieta` SET `estado`=0 WHERE id=?";

        if ((JOptionPane.showConfirmDialog(null, "Borara el "
                + "plan de comidas con id " + id + " desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)) == 0) {
            try {
                PreparedStatement ps = conec.prepareStatement(sql);
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                }
                conec.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea " + ex);

            }
        }

    }

    public int encontrarID(int id_dieta, String comida, int dia, int cantidad) {
        int iditemdieta = 0;
        String sql = "SELECT itemd.id\n"
                + "FROM itemdieta itemd\n"
                + "JOIN  dieta d ON d.id = itemd.id_dieta\n"
                + "JOIN comida c ON c.id = itemd.id_comida\n"
                + "WHERE d.id = ? AND c.nombre = ? AND itemd.dia = ? AND itemd.cantidad = ?;";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id_dieta);
            ps.setString(2, comida);
            ps.setInt(3, dia);
            ps.setInt(4, cantidad);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                iditemdieta = rs.getInt("itemd.id");
            }

            //conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }
        return iditemdieta;
    }

    public void detallesDieta(int idDieta, DefaultTableModel modelo) {
        String sql = "SELECT nombre, detalles, cantidad, dia FROM dieta d "
                + "JOIN itemdieta itemd "
                + "ON d.id = itemd.id_dieta"
                + " JOIN comida c "
                + "ON itemd.id_comida = c.id "
                + "WHERE itemd.estado = 1 and d.id = ? "
                + "ORDER BY itemd.dia ASC";
        Itemdieta itemDietaAux = new Itemdieta();
        
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comidaAux = new Comida();
                comidaAux.setNombre(rs.getString("nombre"));
                comidaAux.setDetalles(rs.getString("detalles"));
                itemDietaAux.setCantidad(rs.getInt("cantidad"));
                itemDietaAux.setDia(rs.getInt("dia"));
                modelo.addRow(new Object[]{comidaAux.getNombre(), comidaAux.getDetalles(), itemDietaAux.getCantidad(), itemDietaAux.getDia()});
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea " + ex);

        }

    }

    public int caloriasActuales(int id) {
        String sql = "SELECT SUM(calorias*cantidad) FROM dieta d JOIN itemdieta itemd ON d.id = itemd.id_dieta JOIN comida c ON itemd.id_comida = c.id WHERE itemd.estado = 1 and d.id = ?";
        int caloriasActuales = 0;
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                caloriasActuales = rs.getInt("SUM(calorias*cantidad)");
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea asdsd " + ex);

        }
        return caloriasActuales;
    }

}
