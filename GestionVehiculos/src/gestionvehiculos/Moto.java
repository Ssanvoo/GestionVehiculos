
package gestionvehiculos;


public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int year,  int cilindrada, Propietario propietario) {
        super(marca, modelo, year, propietario);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void calcularImpuesto(){
        System.out.println("El impuesto es de: " + year * 0.03 * 50);
    }
    
    
}
