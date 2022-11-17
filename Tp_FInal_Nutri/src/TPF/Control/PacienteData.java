package TPF.Control;

import TPF.Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PacienteData {

    private Connection conec;

    public PacienteData() {
        this.conec = Conexion.getConexion();
    }

    public void createPaciente(Paciente pacienteAux) {
        String sql = "INSERT INTO `paciente`(`nombre`, `apellido`, `domicilio`, `dni`, `telefono`, `estado`) VALUES (?,?,?,?,?,?)";
        try {

            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pacienteAux.getNombre());
            ps.setString(2, pacienteAux.getApellido());
            ps.setString(3, pacienteAux.getDomicilio());
            ps.setString(4, pacienteAux.getDni());
            ps.setString(5, pacienteAux.getTelefono());
            ps.setBoolean(6, true);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el registro");

            }

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pacienteAux.setId(rs.getInt(1));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }

    }

    public Paciente readPaciente(int id) {
        String sql = "SELECT * FROM `paciente` WHERE estado=1 and id=?";
        Paciente pacienteAux = new Paciente();
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pacienteAux.setId(id);
                pacienteAux.setNombre(rs.getString(2));
                pacienteAux.setApellido(rs.getString(3));
                pacienteAux.setDomicilio(rs.getString(4));
                pacienteAux.setDni(rs.getString(5));
                pacienteAux.setTelefono(rs.getString(6));
                pacienteAux.setEstado(rs.getBoolean(7));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
        return pacienteAux;
    }

    public ArrayList<Paciente> readAllPaciente() {
        ArrayList<Paciente> listaAux = new ArrayList();
        String sql = "SELECT * FROM `paciente` WHERE estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente pacienteAux = new Paciente();
                pacienteAux.setId(rs.getInt(1));
                pacienteAux.setNombre(rs.getString(2));
                pacienteAux.setApellido(rs.getString(3));
                pacienteAux.setDomicilio(rs.getString(4));
                pacienteAux.setDni(rs.getString(5));
                pacienteAux.setTelefono(rs.getString(6));
                pacienteAux.setEstado(rs.getBoolean(7));
                listaAux.add(pacienteAux);
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

        return listaAux;
    }

    public void updatePaciente(int id, String nombre, String apellido, String domicilio, String dni, String telefono, boolean estado) {
        String sql = "UPDATE `paciente` SET `nombre`=?,`apellido`=?,`domicilio`=?,`dni`=?,`telefono`=?,`estado`=? WHERE id=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, domicilio);
            ps.setString(4, dni);
            ps.setString(5, telefono);
            ps.setBoolean(6, estado);
            ps.setInt(7, id);

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

    public void deletePaciente(int id) {
        String sql = "UPDATE `paciente` SET `estado`=0 WHERE id=?";
        
         if((JOptionPane.showConfirmDialog(null, "Borara el "
                 + "paciente con id "+ id+" desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE))==0){
        try {
                PreparedStatement ps = conec.prepareStatement(sql);;
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
