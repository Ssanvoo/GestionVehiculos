package gestionvehiculos;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String marca, String modelo, int year, int numeroPuertas, Propietario propietario) {
        super(marca, modelo, year, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void calcularImpuesto() {
        double impuesto = year * 0.05 * 100;
        System.out.println("El impuesto es de: " + impuesto);
    }

    @Override
    public String toString() {
        return "Coche{" + "marca: " + marca + ", modelo: " + modelo + ", anyo: " + year + ", puertas: " + numeroPuertas + '}';
    }

}
