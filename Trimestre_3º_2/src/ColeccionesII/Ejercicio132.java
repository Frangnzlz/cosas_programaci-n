package ColeccionesII;
        
import java.util.Scanner;
public class Ejercicio132 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instituto instituto = new Instituto();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir Alumno.");
            System.out.println("2. Borrar Alumno.");
            System.out.println("3. Mostrar Instituto.");
            System.out.println("4. Alumnos por ciudad.");
            System.out.println("5. Mostrar datos.");
            System.out.println("6. Borrar todo.");
            System.out.println("7. Resumen.");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la ciudad de nacimiento: ");
                    String ciudad = scanner.nextLine();
                    instituto.aniadirAlumno(nombre, ciudad);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del alumno a borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    instituto.borrar(nombreBorrar);
                    break;
                case 3:
                    System.out.println("Datos del Instituto:");
                    System.out.println(instituto.mostrarDatos());
                    break;
                case 4:
                    System.out.print("Ingrese la ciudad para ver el número de alumnos: ");
                    String ciudadAlumnos = scanner.nextLine();
                    instituto.mostrarCiudad(ciudadAlumnos);
                    break;
                case 5:
                    System.out.println("Datos de los alumnos:");
                    System.out.println(instituto.mostrarDatos());
                    break;
                case 6:
                    instituto.borrar();
                    break;
                case 7:
                    System.out.println("Resumen del Instituto:");
                    System.out.println(instituto.resumen());
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
