package gestionvehiculos;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int year;

    public Vehiculo(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public abstract void calcularImpuesto();

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", year=" + year + '}';
    }
}
