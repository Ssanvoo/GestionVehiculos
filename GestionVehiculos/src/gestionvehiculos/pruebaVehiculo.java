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
        while (opcion != 6) {
            
            switch (opcion) {
                case 1 -> agregaVehiculo();
                case 2 -> {
                    for (int i = 0; i < contArray; i++) {
                        System.out.println(arrayVehiculos[i]);
                        arrayVehiculos[i].calcularImpuesto();
                    }
                }
                case 3 -> System.out.println("Adios...");   
                default -> System.out.println("Opcion no permitida. Seleccione la opcion");

            }
            muestraMenu();
            opcion = sc.nextInt();
          
        }
        System.out.println("Adios...");
    }

    static void agregaVehiculo() {
        System.out.println("Quiere crear un coche(1), un camion(2), o una moto(3): ");
        System.out.println("Eliga 1, 2 o 3");
        int opcion = sc.nextInt();
        while (opcion < 1 || opcion > 3) {
            System.out.println("Opcion no valida, introduzca la opcion correcta");
            opcion = sc.nextInt();
        }
        if (opcion == 1) {
            System.out.println("Has elegido crear un coche...");
            creaCoche();
        } else if (opcion == 2) {
            creaCamion();
        } else {
            creaMoto();
        }

    }

    static void creaCoche() {
        if (contArray >= 5) {
            System.out.println("No se pueden anadir mas vehiculos.");
        } else {
            sc.nextLine();
            System.out.println("Datos del propietario: ");
            System.out.print("Introduzca el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca el apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Introduzca el DNI: ");
            String dni = sc.nextLine();
            System.out.print("Introduzca la direccion del propietario: ");
            String direccion = sc.nextLine();
            Propietario propietario = new Propietario(nombre, apellido, dni, direccion);
            System.out.print("Introduzca la marca del coche: ");
            String marca = sc.nextLine();
            System.out.print("Introduzca el modelo del coche: ");
            String modelo = sc.nextLine();
            System.out.print("Introduzca el anyo de creacion del coche: ");
            int anyo = sc.nextInt();
            System.out.print("Cuantas puertas tiene el coche: ");
            int puertas = sc.nextInt();
            Auto coche = new Auto(marca, modelo, anyo, puertas, propietario);
            arrayVehiculos[contArray] = coche;
            contArray++;
        }
    }

    static void creaCamion() {
        if (contArray >= 5) {
            System.out.println("No se pueden anadir mas vehiculos");
        } else {
            sc.nextLine(); //purgo el scanner
            System.out.println("Datos del propietario: ");
            System.out.print("Introduzca el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca el apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Introduzca el DNI: ");
            String dni = sc.nextLine();
            System.out.print("Introduzca la direccion del propietario: ");
            String direccion = sc.nextLine();
            Propietario propietario = new Propietario(nombre, apellido, dni, direccion);

            System.out.print("Introduzca la marca del camion: ");
            String marca = sc.nextLine();
            System.out.print("Introduzca el modelo del camion: ");
            String modelo = sc.nextLine();
            System.out.print("Introduzca el anyo de creacion del camion: ");
            int anyo = sc.nextInt();
            System.out.print("Introduzca el peso (En Toneladas) que puede cargar el camion: ");
            int toneladas = sc.nextInt();
            Camion camion = new Camion(marca, modelo, anyo, toneladas, propietario);
            arrayVehiculos[contArray] = camion;
            contArray++;
        }
    }

    static void creaMoto() {
        if (contArray >= 5) {
            System.out.println("No se pueden anadir mas vehiculos.");
        } else {
            sc.nextLine();
            System.out.print("Introduzca el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca el apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Introduzca el DNI: ");
            String dni = sc.nextLine();
            System.out.print("Introduzca la direccion del propietario: ");
            String direccion = sc.nextLine();
            Propietario propietario = new Propietario(nombre, apellido, dni, direccion);

            System.out.print("Introduzca la marca de la moto: ");
            String marca = sc.nextLine();
            System.out.print("Introduzca el modelo de la moto: ");
            String modelo = sc.nextLine();
            System.out.print("Introduzca el anyo de creacion de la moto: ");
            int anyo = sc.nextInt();
            System.out.print("Introduzca la cilindrada del amoto: ");
            int cilindrada = sc.nextInt();
            Moto moto = new Moto(marca, modelo, anyo, cilindrada, propietario);
            arrayVehiculos[contArray] = moto;
            contArray++;
        }
    }

}
