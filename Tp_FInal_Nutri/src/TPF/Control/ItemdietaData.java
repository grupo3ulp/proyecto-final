package TPF.Control;

import TPF.Modelo.Itemdieta;
import TPF.Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemdietaData {

    private Connection conec;

    public ItemdietaData() {
        this.conec = Conexion.getConexion();
    }

    public void createItemDieta(Itemdieta itemDieta) {
        String sql = "INSERT INTO `itemdieta`(`id_dieta`, `id_comida`, `cantidad`, `dia`, `estado`)  VALUES (?,?,?,?)";
        try {

            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, itemDieta.getId_dieta());
            ps.setInt(2, itemDieta.getId_comida());
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
                itemDietaAux.setId(id);
                itemDietaAux.setId_dieta(rs.getInt(2));
                itemDietaAux.setId_comida(rs.getInt(3));
                itemDietaAux.setCantidad(rs.getInt(4));
                itemDietaAux.setDia(rs.getInt(5));
                itemDietaAux.setEstado(rs.getBoolean(6));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

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
                itemDietaAux.setId(rs.getInt(1));
                itemDietaAux.setId_dieta(rs.getInt(2));
                itemDietaAux.setId_comida(rs.getInt(3));
                itemDietaAux.setCantidad(rs.getInt(4));
                itemDietaAux.setDia(rs.getInt(5));
                itemDietaAux.setEstado(rs.getBoolean(6));
                listaAux.add(itemDietaAux);
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
        return listaAux;
    }

    public void updateItemDieta(int id, int id_dieta, int id_comida,int cantidad, int dia, boolean estado) {
        String sql = "UPDATE `itemdieta` SET `id_dieta`=?,`id_comida`=?,`cantidad`=?,`dia`=?,`estado`=? WHERE id=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);

            ps.setInt(1, id_dieta);
            ps.setInt(2, id_comida);
            ps.setInt(3, cantidad);
            ps.setInt(4, dia);
            ps.setBoolean(5, estado);
            ps.setInt(6, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

    }
     public void deleteItemDieta(int id) {
        String sql = "UPDATE `itemdieta` SET `estado`=0 WHERE id=?";
        
        if((JOptionPane.showConfirmDialog(null, "Borara el "
                 + "plan de comidas con id "+ id+" desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE))==0){
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
                JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

            }
        }
           

    }  

}
