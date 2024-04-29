/*130.- Implementa un programa que cuente el numero de apariciones de cada 
palabra de un texto. Para ello se debe crear una estructura que almacene cada 
palabra y el número de veces que aparece en el texto. 
Recuerda que un texto puede tener entre 0 y N palabras (siendo N un número 
desconocido) y que una palabra puede estar escrita en mayúscula, minúscula o 
combinación de ambas (y sigue siendo la misma palabra) 
Para este ejercicio, el texto va a ser introducido línea a línea hasta por el usuario 
hasta que se introduzca una línea vacía. 
Tras eso deben mostrarse todas las palabras del texto una debajo de otra junto 
con el número de veces que aparece cada una. 
A tener en cuenta: 
• Hay que usar funciones para trabajar con cadenas  Te recomiendo que uses 
split().Te va a ser muy útil en este ejercicio. 
• Vamos a suponer que no se introducen signos de puntuación en el texto. Sólo 
letras,números y espacios en blanco.
*/
package ColeccionesII;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio130 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        // Solicitar texto línea por línea hasta una línea vacía
        System.out.println("Introduce el texto (línea vacía para terminar):");
        while (true) {
            String linea = scanner.nextLine();
            if (linea.isEmpty()) {
                break;
            }

            // Dividir la línea en palabras y contar las apariciones de cada palabra
            String[] palabras = linea.split("\\s+");
            for (String palabra : palabras) {
                palabra = palabra.toLowerCase(); // Convertir a minúsculas para evitar diferencias de capitalización
                contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Mostrar cada palabra y su cantidad de apariciones
        System.out.println("Número de apariciones de cada palabra:");
        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}