package gestionvehiculos;

import java.util.Scanner;

public class pruebaVehiculo {

    static Scanner sc = new Scanner(System.in);
    static int contArray = 0;
    static Vehiculo arrayVehiculos[] = new Vehiculo[5];

    public static void main(String[] args) {

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
                muestraMenu();
                menuSwitch(sc.nextInt());
                break;
            case 2:
                for (int i = 0; i < contArray; i++) {
                    System.out.println(arrayVehiculos[i]);
                    arrayVehiculos[i].calcularImpuesto();
                }
                muestraMenu();
                menuSwitch(sc.nextInt());
                break;
            case 3:
                System.out.println("Adios...");
                break;
            default: System.out.println("Opcion no permitida. Seleccione la opcion");
                    muestraMenu();
                    menuSwitch(sc.nextInt());
        }
    }

    static void agregaVehiculo() {
        System.out.println("Quiere crear un coche(1) o un camion(2): ");
        System.out.println("Eliga 1 o 2");
        int opcion = sc.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.println("Opcion no valida, introduzca la opcion correcta");
            opcion = sc.nextInt();
        }
        if (opcion == 1) {
            System.out.println("Has elegido crear un coche...");
            creaCoche();
        } else {
            creaCamion();
        }

    }

    static void creaCoche() {
        if (contArray >= 5) {
            System.out.println("No se pueden anadir mas vehiculos.");
        } else {
            sc.nextLine();
            System.out.print("Introduzca la marca del coche: ");
            String marca = sc.nextLine();
            System.out.print("Introduzca el modelo del coche: ");
            String modelo = sc.nextLine();
            System.out.print("Introduzca el anyo de creacion del coche: ");
            int anyo = sc.nextInt();
            System.out.print("Cuantas puertas tiene el coche: ");
            int puertas = sc.nextInt();
            Auto coche = new Auto(marca, modelo, anyo, puertas);
            arrayVehiculos[contArray] = coche;
            contArray++;
        }
    }

    static void creaCamion() {
        if (contArray >= 5) {
            System.out.println("No se pueden anadir mas vehiculos");
        } else {
            sc.nextLine(); //purgo el scanner
            System.out.print("Introduzca la marca del camion: ");
            String marca = sc.nextLine();
            System.out.print("Introduzca el modelo del camion: ");
            String modelo = sc.nextLine();
            System.out.print("Introduzca el anyo de creacion del camion: ");
            int anyo = sc.nextInt();
            System.out.print("Introduzca el peso (En Toneladas) que puede cargar el camion: ");
            int toneladas = sc.nextInt();
            Camion camion = new Camion(marca, modelo, anyo, toneladas);
            arrayVehiculos[contArray] = camion;
            contArray++;
        }
    }
}
