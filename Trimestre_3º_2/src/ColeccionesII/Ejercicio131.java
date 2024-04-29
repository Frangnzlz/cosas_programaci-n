
package ColeccionesII;

import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ARAS aras = new ARAS();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Borrar entrada");
            System.out.println("2. Añadir entrada");
            System.out.println("3. Actualizar entrada");
            System.out.println("4. Comprobar si existe clave");
            System.out.println("5. Comprobar si existe valor");
            System.out.println("6. Obtener primera clave para un valor");
            System.out.println("7. Mostrar diccionario");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la clave a borrar: ");
                    String claveBorrar = scanner.nextLine();
                    aras.borrar(claveBorrar);
                    break;
                case 2:
                    System.out.print("Ingrese la clave: ");
                    String claveAñadir = scanner.nextLine();
                    System.out.print("Ingrese el valor: ");
                    String valorAñadir = scanner.nextLine();
                    aras.meter(claveAñadir, valorAñadir);
                    break;
                case 3:
                    System.out.print("Ingrese la clave a actualizar: ");
                    String claveActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo valor: ");
                    String valorActualizar = scanner.nextLine();
                    aras.actualizar(claveActualizar, valorActualizar);
                    break;
                case 4:
                    System.out.print("Ingrese la clave a comprobar: ");
                    String claveExiste = scanner.nextLine();
                    System.out.println("La clave '" + claveExiste + "' " + (aras.existeClave(claveExiste) ? "existe." : "no existe."));
                    break;
                case 5:
                    System.out.print("Ingrese el valor a comprobar: ");
                    String valorExiste = scanner.nextLine();
                    System.out.println("El valor '" + valorExiste + "' " + (aras.existeValor(valorExiste) ? "existe." : "no existe."));
                    break;
                case 6:
                    System.out.print("Ingrese el valor para obtener la primera clave: ");
                    String valorClave = scanner.nextLine();
                    String primeraClave = aras.primerValor(valorClave);
                    System.out.println("La primera clave para el valor '" + valorClave + "' es: " + primeraClave);
                    break;
                case 7:
                    aras.mostrar();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
