package gestionvehiculos;

import java.util.Scanner;

public class pruebaVehiculo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Vehiculo array[] = new Vehiculo[5];
        muestraMenu();
        int opcion = sc.nextInt();
        menuSwitch(opcion);

    }

    static void muestraMenu() {
        System.out.println("""
                           1. Agregar Vehiculo.
                           2. Listar todos los vehiculos con detalles e impuestos.
                           3. Salir
                           """);
    }

    static void menuSwitch(int opcion) {
        switch (opcion) {
            case 1:
                agregaVehiculo();
                break;
        }
    }

    static void agregaVehiculo() {
        System.out.println("Quiere crear un coche(1) o un camion(2): ");
        System.out.println("Eliga 1 o 2");
        int opcion = sc.nextInt();
        while (opcion < 1 || opcion > 2){
            System.out.println("Opcion no valida, introduzca la opcion correcta");
            opcion = sc.nextInt();
        }
        if (opcion == 1){
            System.out.println("Has elegido crear un coche...");
            
        }
        
    }
}
