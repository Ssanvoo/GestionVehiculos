

package gestionvehiculos;


public class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int year, int capacidadCarga, Propietario propietario) {
        super(marca, modelo, year, propietario);
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public void calcularImpuesto(){
        double impuesto = year * 0.1 * 200;
        System.out.println("El impuesto es de: " + impuesto);
    }

    @Override
    public String toString() {
        return "Camion{" + "marca: " + marca + ", modelo: " + modelo + ", anyo: " + year + ", Capacidad de carga: " + capacidadCarga + '}';
    }
    
    
}
