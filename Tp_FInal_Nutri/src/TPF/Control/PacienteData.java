package TPF.Control;

import TPF.Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacienteData {

    private Connection conec;

    public PacienteData() {
        this.conec = Conexion.getConexion();
    }

    public void createPaciente(Paciente pacienteAux) {
        String sql = "INSERT INTO `paciente`(`nombre`, `apellido`, `domicilio`, `dni`, `telefono`, `peso_actual`,`estado`) VALUES (?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pacienteAux.getNombre());
            ps.setString(2, pacienteAux.getApellido());
            ps.setString(3, pacienteAux.getDomicilio());
            ps.setString(4, pacienteAux.getDni());
            ps.setString(5, pacienteAux.getTelefono());
            ps.setFloat(6, pacienteAux.getPesoActual());
            ps.setBoolean(7, true);

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
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Ya se encuetra un apciente con ese dni en nuestra base de datos");

        } catch (SQLException ex) {
            System.out.println("sadsadsadsadsadsadsadsadsadsadsadsadsadsad");
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
                pacienteAux.setPesoActual(rs.getFloat(7));
                pacienteAux.setEstado(rs.getBoolean(8));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
        return pacienteAux;
    }

    public Paciente readPaciente(String dni) {
        String sql = "SELECT * FROM `paciente` WHERE estado=1 and dni=?";
        Paciente pacienteAux = new Paciente();
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pacienteAux.setId(rs.getInt(1));
                pacienteAux.setNombre(rs.getString(2));
                pacienteAux.setApellido(rs.getString(3));
                pacienteAux.setDomicilio(rs.getString(4));
                pacienteAux.setDni(rs.getString(5));
                pacienteAux.setTelefono(rs.getString(6));
                pacienteAux.setPesoActual(rs.getFloat(7));
                pacienteAux.setEstado(rs.getBoolean(8));
            }

            conec.close();
        } catch (SQLException ex) {
            System.out.println("ERROR DNI");
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
                pacienteAux.setPesoActual(rs.getFloat(7));
                pacienteAux.setEstado(rs.getBoolean(8));
                
                listaAux.add(pacienteAux);
            }

            conec.close();
        } catch (SQLException ex) {
            System.out.println("ERROR");
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea"+ ex);
            

        }

        return listaAux;
    }

    public void readAllPaciente(DefaultTableModel modelo) {
        Paciente pacienteAux = new Paciente();
        float pesoDeseado;
        float pesoInicial;
        float kilosBuscados;
        float kilosBajados;
        String sql = "SELECT p.id, nombre, apellido, domicilio, dni, telefono, "
                + "peso_actual,peso_inicial, peso_deseado,(d.peso_inicial-d.peso_deseado) "
                + "as\"kilos_a_bajar\", (d.peso_inicial-p.peso_actual) as \"kilos_bajados\" "
                + "FROM paciente p JOIN dieta d ON d.id_paciente = p.id "
                + "WHERE p.estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pacienteAux.setId(rs.getInt("id"));
                pacienteAux.setNombre(rs.getString("nombre"));
                pacienteAux.setApellido(rs.getString("apellido"));
                pacienteAux.setDomicilio(rs.getString("domicilio"));
                pacienteAux.setDni(rs.getString("dni"));
                pacienteAux.setTelefono(rs.getString("telefono"));
                pacienteAux.setPesoActual(rs.getFloat("peso_actual"));
                pesoInicial = rs.getFloat("peso_inicial");
                pesoDeseado = rs.getFloat("peso_deseado");
                kilosBuscados = rs.getFloat("kilos_a_bajar");
                kilosBajados = rs.getFloat("kilos_bajados");

                modelo.addRow(new Object[]{pacienteAux.getNombre(), pacienteAux.getApellido(),
                    pacienteAux.getDomicilio(), pacienteAux.getDni(), pacienteAux.getTelefono(),
                    pacienteAux.getPesoActual(), pesoInicial, pesoDeseado, kilosBuscados, kilosBajados});

            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

    }

    public void readAllPacienteNoCumplieronMeta(DefaultTableModel modelo) {
        Paciente pacienteAux = new Paciente();
        float pesoDeseado;
        float pesoInicial;
        float kilosBuscados;
        float kilosBajados;
        String sql = "SELECT p.id, nombre, apellido, domicilio, dni, telefono,"
                + " peso_actual,peso_inicial, peso_deseado,(d.peso_inicial-d.peso_deseado)"
                + " as \"kilos_a_bajar\", (d.peso_inicial-p.peso_actual)"
                + " as \"kilos_bajados\" FROM paciente p JOIN dieta d"
                + " ON d.id_paciente = p.id"
                + " WHERE ((d.peso_inicial-p.peso_actual)-(d.peso_inicial-d.peso_deseado))<0";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                pacienteAux.setId(rs.getInt("id"));
                pacienteAux.setNombre(rs.getString("nombre"));
                pacienteAux.setApellido(rs.getString("apellido"));
                pacienteAux.setDomicilio(rs.getString("domicilio"));
                pacienteAux.setDni(rs.getString("dni"));
                pacienteAux.setTelefono(rs.getString("telefono"));
                pacienteAux.setPesoActual(rs.getFloat("peso_actual"));
                pesoInicial = rs.getFloat("peso_inicial");
                pesoDeseado = rs.getFloat("peso_deseado");
                kilosBuscados = rs.getFloat("kilos_a_bajar");
                kilosBajados = rs.getFloat("kilos_bajados");

                modelo.addRow(new Object[]{pacienteAux.getNombre(), pacienteAux.getApellido(),
                    pacienteAux.getDomicilio(), pacienteAux.getDni(), pacienteAux.getTelefono(),
                    pacienteAux.getPesoActual(), pesoInicial, pesoDeseado, kilosBuscados, kilosBajados});
                System.out.println("aaaaa");
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

    }

    public void readAllPacientePeso(float kilos, DefaultTableModel modelo) {
        Paciente pacienteAux = new Paciente();
        float pesoInicial;
        float pesoDeseado;
        float kilosBuscados;
        float kilosBajados;
        String sql = "SELECT p.id, nombre, apellido, domicilio, dni, telefono, "
                + "peso_actual,peso_inicial, peso_deseado,(d.peso_inicial-d.peso_deseado) "
                + "as\"kilos_a_bajar\", (d.peso_inicial-p.peso_actual) as \"kilos_bajados\" "
                + "FROM paciente p JOIN dieta d ON d.id_paciente = p.id "
                + "WHERE (d.peso_inicial-d.peso_deseado) >=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setFloat(1, kilos);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                pacienteAux.setId(rs.getInt("id"));
                pacienteAux.setNombre(rs.getString("nombre"));
                pacienteAux.setApellido(rs.getString("apellido"));
                pacienteAux.setDomicilio(rs.getString("domicilio"));
                pacienteAux.setDni(rs.getString("dni"));
                pacienteAux.setTelefono(rs.getString("telefono"));
                pacienteAux.setPesoActual(rs.getFloat("peso_actual"));
                pesoInicial = rs.getFloat("peso_inicial");
                pesoDeseado = rs.getFloat("peso_deseado");
                kilosBuscados = rs.getFloat("kilos_a_bajar");
                kilosBajados = rs.getFloat("kilos_bajados");

                modelo.addRow(new Object[]{pacienteAux.getNombre(), pacienteAux.getApellido(),
                    pacienteAux.getDomicilio(), pacienteAux.getDni(), pacienteAux.getTelefono(),
                    pacienteAux.getPesoActual(), pesoInicial, pesoDeseado, kilosBuscados, kilosBajados});
                System.out.println("aaaaa");
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

    }

    public ArrayList<Paciente> readAllPacienteBaja() {
        ArrayList<Paciente> listaAux = new ArrayList();
        String sql = "SELECT * FROM `paciente` WHERE estado=0";
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
                pacienteAux.setPesoActual(rs.getFloat(7));
                pacienteAux.setEstado(rs.getBoolean(8));
                listaAux.add(pacienteAux);
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

        return listaAux;
    }

    public void updatePaciente(int id, String nombre, String apellido, String domicilio, String dni, String telefono, float pesoActual, boolean estado) {
        String sql = "UPDATE `paciente` SET `nombre`=?,`apellido`=?,`domicilio`=?,`dni`=?,`telefono`=?,`peso_actual`=?,`estado`=? WHERE id=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, domicilio);
            ps.setString(4, dni);
            ps.setString(5, telefono);
            ps.setFloat(6, pesoActual);
            ps.setBoolean(7, estado);
            ps.setInt(8, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
            JOptionPane.showMessageDialog(null, "lalallalal");

        }

    }

    public void volverDarAlta(Paciente paciente) {
        String sql = "UPDATE `paciente` SET `estado`=1 WHERE id=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, paciente.getId());

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

        if ((JOptionPane.showConfirmDialog(null, "Borara el "
                + "paciente con id " + id + " desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)) == 0) {
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
