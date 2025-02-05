package gestionvehiculos;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int year;
    protected Propietario propietario;

    public Vehiculo(String marca, String modelo, int year, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.propietario = propietario;
    }

    public abstract void calcularImpuesto();

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", propietario=" + propietario + '}';
    }

    
}
