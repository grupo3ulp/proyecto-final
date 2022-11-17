
package TPF.Modelo;

public class Itemdieta {
    
    private int id;
    private int id_dieta;
    private int id_comida;
    private boolean estado;
    
    public Itemdieta() {
    }

    public Itemdieta(int id, int id_dieta, int id_comida, boolean estado) {
        this.id = id;
        this.id_dieta = id_dieta;
        this.id_comida = id_comida;
        this.estado = estado;
    }

    public Itemdieta(int id_dieta, int id_comida, boolean estado) {
        this.id_dieta = id_dieta;
        this.id_comida = id_comida;
        this.estado = estado;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Itemdieta{" + "id=" + id + ", id_dieta=" + id_dieta + ", id_comida=" + id_comida + ", estado=" + estado + '}';
    }
    
    
    
}
