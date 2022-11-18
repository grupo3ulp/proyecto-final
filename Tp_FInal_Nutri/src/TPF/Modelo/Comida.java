
package TPF.Modelo;

public class Comida {
   private int id;
   private String nombre;
   private String detalles;
   private int calorias;
   private boolean estado;

    public Comida() {
    }

    public Comida(int id, String nombre, String detalles, int calorias, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.detalles = detalles;
        this.calorias = calorias;
        this.estado = estado;
    }

    public Comida(String nombre, String detalles, int calorias, boolean estado) {
        this.nombre = nombre;
        this.detalles = detalles;
        this.calorias = calorias;
        this.estado = estado;
    }

    public Comida(String nombre, String detalles, int calorias) {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comida{" + "id=" + id + ", nombre=" + nombre + ", detalles=" + detalles + ", calorias=" + calorias + ", estado=" + estado + '}';
    }
    
   
    
}
