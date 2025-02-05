
package gestionvehiculos;


public class Propietario {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;

    public Propietario(String nombre, String apellido, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + '}';
    }
    
    
}
