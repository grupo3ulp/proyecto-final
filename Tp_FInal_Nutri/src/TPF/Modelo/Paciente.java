
package TPF.Modelo;

public class Paciente {
    
    private int id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String dni;
    private String telefono;
    private float pesoActual;
    private boolean estado;
    
    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido, String domicilio, String dni, String telefono, float pesoActual, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.pesoActual = pesoActual;
        this.estado = estado;
    }

    public Paciente(String nombre, String apellido, String domicilio, String dni, String telefono, float pesoActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.pesoActual = pesoActual;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  apellido + " " +nombre +  " - DNI: " + dni;
    }
    
    
    
    
}
