package TPF.Modelo;

public class Itemdieta {

    private int id;
    private Comida comida;
    private Dieta dieta;
    private boolean estado;
    private int cantidad;
    private int dia;

    public Itemdieta() {
    }

    public Itemdieta(int id, Comida comida, Dieta dieta, boolean estado, int cantidad, int dia) {
        this.id = id;
        this.comida = comida;
        this.dieta = dieta;
        this.estado = estado;
        this.cantidad = cantidad;
        this.dia = dia;
    }

    public Itemdieta(Comida comida, Dieta dieta, int cantidad, int dia) {
        this.comida = comida;
        this.dieta = dieta;
        this.cantidad = cantidad;
        this.dia = dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

  

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Itemdieta{"+ "comida=" + comida + ", dieta=" + dieta + ", estado=" + estado + ", cantidad=" + cantidad + ", dia=" + dia + '}';
    }
    
}
