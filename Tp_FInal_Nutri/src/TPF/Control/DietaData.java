package TPF.Control;

import TPF.Modelo.Dieta;
import TPF.Modelo.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DietaData {

    private Connection conec;

    public DietaData() {
        this.conec = Conexion.getConexion();
    }

    public void createDieta(Dieta dietaAux) {
        String sql = "INSERT INTO `dieta`(`id_paciente`, `fecha_inicio`, `fecha_fin`, `peso_inicial`, `peso_deseado`, `limite_calorico`, `estado`) VALUES (?,?,?,?,?,?,?)";

        int id_paciente = dietaAux.getId_paciente().getId();

        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_paciente);
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

    public Dieta readDieta(int id) {
        String sql = "SELECT * FROM `dieta` WHERE estado=1 and id=?";
        Dieta dietaAux = new Dieta();

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                PacienteData pacienteData = new PacienteData();
                dietaAux.setId(id);
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
        return dietaAux;
    }

    public ArrayList<Dieta> readAllDieta() {
        ArrayList<Dieta> listaAux = new ArrayList();
        String sql = "SELECT * FROM `dieta` WHERE estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PacienteData pacienteData = new PacienteData();
                Dieta dietaAux = new Dieta();
                dietaAux.setId(rs.getInt(1));
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));

                listaAux.add(dietaAux);
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
        return listaAux;
    }

    public ArrayList<Dieta> readAllDietas() {
        ArrayList<Dieta> listaAux = new ArrayList();
        String sql = "SELECT * FROM `dieta` ";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PacienteData pacienteData = new PacienteData();
                Dieta dietaAux = new Dieta();
                dietaAux.setId(rs.getInt(1));
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));

                listaAux.add(dietaAux);
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
        return listaAux;
    }

    public void updateDieta(int id, LocalDate fecha_inicio, LocalDate fecha_fin, double peso_inicial, double peso_deseado, int limite_calorico, boolean estado) {
        String sql = "UPDATE `dieta` SET `fecha_inicio`=?,`fecha_fin`=?,`peso_inicial`=?,`peso_deseado`=?,`limite_calorico`=?,`estado`=? WHERE id=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);

            ps.setDate(1, java.sql.Date.valueOf(fecha_inicio));
            ps.setDate(2, java.sql.Date.valueOf(fecha_fin));
            ps.setDouble(3, peso_inicial);
            ps.setDouble(4, peso_deseado);
            ps.setInt(5, limite_calorico);
            ps.setBoolean(6, estado);
            ps.setInt(7, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La dieta fue modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la dieta");

            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
    }

    public void deleteDieta(int id) {
        String sql = "UPDATE `dieta` SET `estado`=0 WHERE id=?";

        if ((JOptionPane.showConfirmDialog(null, "Borrara la "
                + "dieta con id " + id + " desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)) == 0) {
            try {
                PreparedStatement ps = conec.prepareStatement(sql);;
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "La dieta fue borrada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo borrar la dieta");
                }
                conec.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

            }
        }
    }

    public ArrayList<Dieta> readAllDietaNoCumplenBajar() {
        ArrayList<Dieta> listaAux = new ArrayList();
        LocalDate fechaActual = LocalDate.now();

        String sql = "SELECT * FROM dieta d JOIN paciente p ON d.id_paciente"
                + " = p.id WHERE ((d.peso_inicial-p.peso_actual)-(d.peso_inicial-d.peso_deseado))<0 AND d.estado=0";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PacienteData pacienteData = new PacienteData();
                Dieta dietaAux = new Dieta();
                dietaAux.setId(rs.getInt(1));
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));
                System.out.println("Actual " + fechaActual);
                System.out.println(dietaAux.getId_paciente() + " Fecha fin " + dietaAux.getFecha_fin());

                if (dietaAux.getFecha_fin().isBefore(fechaActual) && dietaAux.getId_paciente().getPesoActual() != 0) {
                    listaAux.add(dietaAux);
                }
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }
        return listaAux;
    }

    public ArrayList<Dieta> readAllDietaNoCumplenSubir() {
        ArrayList<Dieta> listaAux = new ArrayList();
        LocalDate fechaActual = LocalDate.now();

        String sql = "SELECT * FROM dieta d JOIN paciente p ON d.id_paciente"
                + " = p.id WHERE (p.peso_actual-d.peso_deseado)<0 AND d.estado=0";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PacienteData pacienteData = new PacienteData();
                Dieta dietaAux = new Dieta();
                dietaAux.setId(rs.getInt(1));
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));
                System.out.println("Actual " + fechaActual);
                System.out.println(dietaAux.getId_paciente() + " Fecha fin " + dietaAux.getFecha_fin());

                if (dietaAux.getFecha_fin().isBefore(fechaActual) && dietaAux.getId_paciente().getPesoActual() != 0) {
                    listaAux.add(dietaAux);
                }
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }
        return listaAux;
    }

    public ArrayList<Dieta> readAllDietaxKiloBajar(int kilos) {
        ArrayList<Dieta> listaAux = new ArrayList();
        String sql = "SELECT * FROM dieta d JOIN paciente p ON d.id_paciente"
                + " = p.id WHERE  (d.peso_inicial-d.peso_deseado) >=? AND d.estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, kilos);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {;
                PacienteData pacienteData = new PacienteData();
                Dieta dietaAux = new Dieta();
                dietaAux.setId(rs.getInt(1));
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));
                if (dietaAux.getId_paciente().getPesoActual() != 0) {
                    listaAux.add(dietaAux);
                }
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }
        return listaAux;
    }

    public ArrayList<Dieta> readAllDietaxKiloSubir(int kilos) {
        ArrayList<Dieta> listaAux = new ArrayList();
        String sql = "SELECT * FROM dieta d JOIN paciente p ON d.id_paciente"
                + " = p.id WHERE  (d.peso_inicial-d.peso_deseado) <=?  AND (d.peso_inicial-d.peso_deseado)<0 AND d.estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, kilos);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {;
                PacienteData pacienteData = new PacienteData();
                Dieta dietaAux = new Dieta();
                dietaAux.setId(rs.getInt(1));
                Paciente pacienteAux = pacienteData.readPaciente(rs.getInt(2));
                dietaAux.setId_paciente(pacienteAux);
                dietaAux.setFecha_incio(rs.getDate(3).toLocalDate());
                dietaAux.setFecha_fin(rs.getDate(4).toLocalDate());
                dietaAux.setPeso_inicial(rs.getDouble(5));
                dietaAux.setPeso_deseado(rs.getDouble(6));
                dietaAux.setLimite_calorico(rs.getInt(7));
                dietaAux.setEstado(rs.getBoolean(8));
                if (dietaAux.getId_paciente().getPesoActual() != 0) {
                    listaAux.add(dietaAux);
                }

            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea" + ex);

        }
        return listaAux;
    }
}
