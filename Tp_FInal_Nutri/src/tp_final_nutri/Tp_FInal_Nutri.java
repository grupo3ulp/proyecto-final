package tp_final_nutri;

import TPF.Control.Conexion;
import TPF.Gui.Menu;
import java.sql.Connection;

public class Tp_FInal_Nutri {

    public static void main(String[] args) {
        Connection conec = Conexion.getConexion();
        
        Menu main=new Menu();
        main.setVisible(true);
        main.setLocationRelativeTo(null);    

        //---PRUEBAS PACIENTE---
//        PacienteData pacienteData=new PacienteData();    
        //--CREAR PACIENTE--
//        Paciente pacienteAux=new Paciente("marco", "silva", "Que te importa", "35656989", "2664698789");
//        pacienteData.createPaciente(pacienteAux);
        //--MOSTRAR PACIENTE--
//        System.out.println(pacienteData.readPaciente(1));
        //--MOSTRAR PACIENTES--
//        pacienteData.readAllPaciente().forEach(System.out::println);
        //--ACTUALIZAR PACIENTE--
//        pacienteData.updatePaciente(1, "Pepe", "Pepe", "Que te importa2", "55555555", "999999999", true);
        //--BORRAR PACIENTE--
//        pacienteData.deletePaciente(1);
//------------------------------------------------------------------------------

        //---PRUEBAS DIETA---
//        DietaData dietaData=new DietaData();
//        LocalDate date1 = LocalDate.of(2021, 11, 20);
//        LocalDate date2 = LocalDate.of(2021, 12, 27);
//        LocalDate date3 = LocalDate.of(2021, 12, 30);
//        LocalDate date4 = LocalDate.of(2021, 12, 17);
        //--CREAR DIETA--
//        Dieta dietaAux=new Dieta(1, date1, date2, 70, 55, 150);
//        dietaData.createDieta(dietaAux);
        //--MOSTRAR DIETA--
//        System.out.println(dietaData.readDieta(2));
        //--MOSTRAR DIETAS--
//        dietaData.readAllDieta().forEach(System.out::println);
        //--ACTUALIZAR DIETAS--
//        dietaData.updateDieta(2, date3, date4, 60, 45, 2000, true);
        //--BORRAR DIETA--
//        dietaData.deleteDieta(2);
//------------------------------------------------------------------------------

        //---PRUEBAS COMIDA---
        //ComidaData comidaData = new ComidaData();
 //       Comida c = new Comida("Pizza", "Muzzarella con palmitos", 500);
        //Comida c1 = new Comida("Arroz", "Blanco o integral", 300);
        //Comida c2 = new Comida("Tarta", "De verduras con queso", 400);
        //Comida c3 = new Comida("Empanadas", "Humita", 500);
        //--CREAR COMIDA--
        //comidaData.crearComida(c);
        //comidaData.crearComida(c1);
        //comidaData.crearComida(c2);
        //comidaData.crearComida(c3);
        //--MODIFICAR COMIDA--
//        comidaData.modificarComida(1, "Pizza", "Muzzarella con aceitunas", 400);
        //--ELIMINAR COMIDA--
//        comidaData.eliminarComida(4);
        //--MOSTRAR COMIDA--
//        System.out.println(comidaData.mostrarComida(1));
        //--MOSTRAR COMIDAS--
//        for (Comida comidas : comidaData.mostrarComidas()) {
//            System.out.println(comidas);
//        }
        

    }

}
