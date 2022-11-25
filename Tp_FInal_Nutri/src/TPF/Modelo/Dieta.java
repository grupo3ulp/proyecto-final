
package TPF.Modelo;

import java.time.LocalDate;

public class Dieta {
    private int id;
    private int id_paciente;
    private LocalDate fecha_incio;
    private LocalDate fecha_fin;
    private double peso_inicial;
    private double peso_deseado;
    private int limite_calorico;
    private boolean estado;
    
    public Dieta() {
    }
 //una palabra
    public Dieta(int id, int id_paciente, LocalDate fecha_incio, LocalDate fecha_fin, double peso_inicial, double peso_deseado, int limite_calorico, boolean estado) {
        this.id = id;
        this.id_paciente = id_paciente;
        this.fecha_incio = fecha_incio;
        this.fecha_fin = fecha_fin;
        this.peso_inicial = peso_inicial;
        this.peso_deseado = peso_deseado;
        this.limite_calorico = limite_calorico;
        this.estado = estado;
    }

    public Dieta(int id_paciente, LocalDate fecha_incio, LocalDate fecha_fin, double peso_inicial, double peso_deseado, int limite_calorico, boolean estado) {
        this.id_paciente = id_paciente;
        this.fecha_incio = fecha_incio;
        this.fecha_fin = fecha_fin;
        this.peso_inicial = peso_inicial;
        this.peso_deseado = peso_deseado;
        this.limite_calorico = limite_calorico;
        this.estado = estado;
    }

    public Dieta(int id_paciente, LocalDate fecha_incio, LocalDate fecha_fin, double peso_inicial, double peso_deseado, int limite_calorico) {
        this.id_paciente = id_paciente;
        this.fecha_incio = fecha_incio;
        this.fecha_fin = fecha_fin;
        this.peso_inicial = peso_inicial;
        this.peso_deseado = peso_deseado;
        this.limite_calorico = limite_calorico;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public LocalDate getFecha_incio() {
        return fecha_incio;
    }

    public void setFecha_incio(LocalDate fecha_incio) {
        this.fecha_incio = fecha_incio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getPeso_inicial() {
        return peso_inicial;
    }

    public void setPeso_inicial(double peso_inicial) {
        this.peso_inicial = peso_inicial;
    }

    public double getPeso_deseado() {
        return peso_deseado;
    }

    public void setPeso_deseado(double peso_deseado) {
        this.peso_deseado = peso_deseado;
    }

    public int getLimite_calorico() {
        return limite_calorico;
    }

    public void setLimite_calorico(int limite_calorico) {
        this.limite_calorico = limite_calorico;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "id=" + id + ", id_paciente="+id_paciente;
    
    }
    
}
