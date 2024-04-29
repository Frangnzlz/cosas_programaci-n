/*127.- Haciendo uso de la clase persona del ejercicio anterior, crea la clase 
Agenda, la cual tendrá una lista de personas (arrayList) y los métodos: 
• AniadirPersona: recibe como argumento una persona y la añade a la lista. 
• BorrarPersona: recibe como argumento un DNI y ,en el caso de que exista 
una persona con DNI, la borra. Nota: borra la primera que encuentre. 
• BuscarPersona: recibe como argumento un DNI y muestra los datos de la 
persona con ese DNI. O un mensaje si ese DNI no está en la lista. 
• MostrarAgenda (toString): muestra todos los datos de cada persona de 
manera ordenada. 
• OrdenarAgenda: ordena las personas de la lista por apellidos. Nota: para 
este punto debes buscar información sobre el método Collections.sort 
Crea un fichero main para probar la clase anterior. Para ello, muestra un menú 
para poder realizar las acciones antes indicadas y prueba su funcionamiento.
*/
package ColeccionesII;
import java.util.Scanner;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir Persona");
            System.out.println("2. Borrar Persona");
            System.out.println("3. Buscar Persona");
            System.out.println("4. Mostrar Agenda");
            System.out.println("5. Ordenar Agenda");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos de la persona:");
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Sexo: ");
                    char sexo = scanner.nextLine().charAt(0);
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    Persona nuevaPersona = new Persona(dni, nombre, apellido, sexo, edad, peso);
                    agenda.añadirPersona(nuevaPersona);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI de la persona a borrar: ");
                    String dniBorrar = scanner.nextLine();
                    agenda.borrarPersona(dniBorrar);
                    break;
                case 3:
                    System.out.print("Ingrese el DNI de la persona a buscar: ");
                    String dniBuscar = scanner.nextLine();
                    agenda.buscarPersona(dniBuscar);
                    break;
                case 4:
                    System.out.println("Agenda:");
                    agenda.mostrarAgenda();
                    break;
                case 5:
                    System.out.println("Ordenando agenda por apellido...");
                    agenda.ordenarAgenda();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}