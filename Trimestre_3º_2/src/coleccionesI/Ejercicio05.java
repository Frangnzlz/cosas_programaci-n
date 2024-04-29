package coleccionesI;

/**
* 5. Realiza de nuevo el ejercicio de la colección de discos pero
* utilizando esta vez una lista para almacenar la información
* sobre los discos en lugar de un array convencional. Comprobarás
* que el código se simplifica notablemente ¿Cuánto ocupa el programa
* original hecho con un array? ¿Cuánto ocupa este nuevo programa
* hecho con una lista?
*
*/
import java.util.ArrayList;
import java.util.Scanner;



// Clase principal que contiene el método main
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Disco> discos = new ArrayList<>(); // Lista para almacenar los discos

        // Pedir información de los discos al usuario
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce los datos del disco " + (i + 1) + ":");
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Género: ");
            String genero = scanner.nextLine();
            System.out.print("Duración (minutos): ");
            int duracion = Integer.parseInt(scanner.nextLine());

            // Crear un nuevo objeto Disco con los datos proporcionados y añadirlo a la lista
            discos.add(new Disco(codigo, autor, titulo, genero, duracion));
        }

        // Mostrar la colección de discos
        System.out.println("\nColección de Discos:");
        for (Disco disco : discos) {
            System.out.println(disco); // Imprimir cada disco utilizando su método toString
        }

        scanner.close(); // Cerrar el Scanner al finalizar
    }

}
