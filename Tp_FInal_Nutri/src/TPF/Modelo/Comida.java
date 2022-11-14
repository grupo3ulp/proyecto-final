
package TPF.Modelo;

public class Comida {
   private int id;
   private String nombre;
   private String detalles;
   private int calorias;

    public Comida() {
    }

    public Comida(int id, String nombre, String detalles, int calorias) {
        this.id = id;
        this.nombre = nombre;
        this.detalles = detalles;
        this.calorias = calorias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
   
   
    
}
