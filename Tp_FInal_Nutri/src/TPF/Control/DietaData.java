package TPF.Control;

import TPF.Modelo.Dieta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DietaData {

    private Connection conec;

    public DietaData() {
        this.conec = Conexion.getConexion();
    }

    public void createDieta(Dieta dietaAux) {
        String sql = "INSERT INTO `dieta`(`id_paciente`, `fecha_inicio`, `fecha_fin`, `peso_inicial`, `peso_deseado`, `limite_calorico`, `estado`) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dietaAux.getId_paciente());
            ps.setDate(2, java.sql.Date.valueOf(dietaAux.getFecha_incio()));
            ps.setDate(3, java.sql.Date.valueOf(dietaAux.getFecha_fin()));
            ps.setDouble(4, dietaAux.getPeso_inicial());
            ps.setDouble(5, dietaAux.getPeso_deseado());
            ps.setInt(6, dietaAux.getLimite_calorico());
            ps.setBoolean(7, true);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La dieta fue creada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la dieta");

            }

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dietaAux.setId(rs.getInt(1));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }
    }
}
