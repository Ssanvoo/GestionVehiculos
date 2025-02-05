

package gestionvehiculos;


public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int year, int numeroPuertas) {
        super(marca, modelo, year);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void calcularImpuesto(){
        double impuesto = year * 0.05 * 100;
        System.out.println("El impuesto es de: " + impuesto);
    }
    
    
}
