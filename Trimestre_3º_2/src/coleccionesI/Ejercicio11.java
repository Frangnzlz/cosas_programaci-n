package coleccionesI;
/**
* 11. Realiza un programa que escoja al azar 5 palabras en español del
* minidiccionario del ejercicio anterior. El programa irá pidiendo
* que el usuario teclee la traducción al inglés de cada una de las
* palabras y comprobará si son correctas. Al final, el programa
* deberá mostrar cuántas respuestas son válidas y cuántas erróneas.
*
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio11 {

    // Método principal
    public static void main(String[] args) {
        // Crear el minidiccionario con palabras en español como clave y su traducción al inglés como valor
        Map<String, String> miniDiccionario = new HashMap<>();
        miniDiccionario.put("casa", "house");
        miniDiccionario.put("perro", "dog");
        miniDiccionario.put("gato", "cat");
        miniDiccionario.put("árbol", "tree");
        miniDiccionario.put("libro", "book");

        // Crear una lista de palabras en español, obtenemos la clave del Map
        List<String> palabras = new ArrayList<>(miniDiccionario.keySet());

        // Mezclar las palabras para obtener una selección aleatoria
        Collections.shuffle(palabras);

        // Contadores para respuestas válidas y erróneas
        int respuestasValidas = 0;
        int respuestasErroneas = 0;

        // Escaner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Iterar sobre las palabras seleccionadas que son las primeras 5 palabras
        for (String palabra : palabras.subList(0, 5)) {
            // Obtener la traducción correcta
            String traduccionCorrecta = miniDiccionario.get(palabra);

            // Pedir la traducción al usuario
            System.out.print("Traduce '" + palabra + "' al inglés: ");
            String traduccionUsuario = scanner.nextLine();

            // Comprobar si la traducción es correcta
            if (traduccionUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasValidas++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es: " + traduccionCorrecta);
                respuestasErroneas++;
            }
        }

        // Mostrar el resultado final
        System.out.println("Respuestas válidas: " + respuestasValidas);
        System.out.println("Respuestas erróneas: " + respuestasErroneas);
    }
}
