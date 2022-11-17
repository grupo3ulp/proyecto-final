
package tp_final_nutri;

import TPF.Control.Conexion;
import TPF.Control.PacienteData;
import TPF.Modelo.Paciente;
import java.sql.Connection;

public class Tp_FInal_Nutri {

    public static void main(String[] args) {
        Connection conec= Conexion.getConexion(); 
        
        PacienteData pacienteData=new PacienteData();
        
        Paciente pacienteAux=new Paciente("marco", "silva", "Que te importa", "35656989", "2664698789");
        pacienteData.createPaciente(pacienteAux);
//        System.out.println(pacienteData.readPaciente(1));
//        pacienteData.readAllPaciente().forEach(System.out::println);
//        pacienteData.updatePaciente(1, "Pepe", "Pepe", "Que te importa2", "55555555", "999999999", true);
//        pacienteData.deletePaciente(1);
    }
    
}
