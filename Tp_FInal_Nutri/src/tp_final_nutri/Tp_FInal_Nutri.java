package tp_final_nutri;

import TPF.Control.ComidaData;
import TPF.Control.Conexion;
import TPF.Control.DietaData;
import TPF.Control.ItemdietaData;
import TPF.Control.PacienteData;
import TPF.Gui.GuiCargarPaciente;
import TPF.Modelo.Comida;
import TPF.Modelo.Dieta;
import TPF.Modelo.Itemdieta;
import java.sql.Connection;
import java.time.LocalDate;

public class Tp_FInal_Nutri {

    public static void main(String[] args) {
        Connection conec = Conexion.getConexion();

        //---PRUEBAS PACIENTE---
        PacienteData pacienteData = new PacienteData();
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
        DietaData dietaData = new DietaData();
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
        ComidaData comidaData = new ComidaData();
//               Comida c = new Comida("Pizza", "Muzzarella con palmitos", 500);
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
//------------------------------------------------------------------------------
        //---PRUEBAS ITEMDIETA---
//        ItemdietaData itemDietaData = new ItemdietaData();
//        Dieta dietaAux=dietaData.readDieta(1);
//        Comida comidaAux=comidaData.mostrarComida(1);
//        Comida comidaAux2=comidaData.mostrarComida(2);
//        Itemdieta itemDieta=new Itemdieta(comidaAux, dietaAux, 1, 1);
//        Itemdieta itemDieta2=new Itemdieta(comidaAux2, dietaAux, 1, 1);
        //--CREAR ITEMDIETA--       
//        itemDietaData.createItemDieta(itemDieta);
        //--MODIFICAR ITEMDIETA--
//         itemDietaData.updateItemDieta(2, 2, 3, 5, 3, true);
        //--ELIMINAR ITEMDIETA--
//         itemDietaData.deleteItemDieta(1);
        //--MOSTRAR COMIDA--
//         System.out.println(itemDietaData.readItemDieta(2));
        //--MOSTRAR COMIDAS--
//        itemDietaData.readAllItemDieta().forEach(System.out::println);

    }

}
