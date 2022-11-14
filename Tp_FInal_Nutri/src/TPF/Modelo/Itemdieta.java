
package TPF.Modelo;

public class Itemdieta {
    
    private int id;
    private int id_dieta;
    private int id_comida;

    public Itemdieta() {
    }

    public Itemdieta(int id, int id_dieta, int id_comida) {
        this.id = id;
        this.id_dieta = id_dieta;
        this.id_comida = id_comida;
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
    
    
    
}
