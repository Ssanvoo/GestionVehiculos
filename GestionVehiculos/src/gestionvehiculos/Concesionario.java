

package gestionvehiculos;


public class Concesionario {
    private String nombre;
    private String direccion;
    private Vehiculo vehiculos[];
    private static int contVehiculos = 0;
    
    public Concesionario(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        vehiculos = new Vehiculo[10];
    }
    
    public void agregarVehiculo (Vehiculo v){
        if (contVehiculos == 10){
            System.out.println("No se pueden agregar mas vehiculos");
        } else {
            vehiculos[contVehiculos] = v;
            contVehiculos++;
        }
    }
}
