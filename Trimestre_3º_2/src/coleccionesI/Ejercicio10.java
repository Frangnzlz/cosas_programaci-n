package coleccionesI;

/**
* 10. Crea un mini-diccionario español-inglés que contenga, al menos,
* 20 palabras (con su traducción).
* 
* Utiliza un objeto de la clase <code>HashMap</code> para almacenar
* las parejas de palabras. El programa pedirá una palabra en
* español y dará la correspondiente traducción en inglés.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear el diccionario español-inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("árbol", "tree");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("fuego", "fire");
        diccionario.put("aire", "air");
        diccionario.put("tierra", "earth");
        diccionario.put("mar", "sea");

        // Pedir una palabra en español al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine();

        // Buscar la traducción en el diccionario
        String traduccion = diccionario.get(palabraEspañol);
        if (traduccion != null) {
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra no está en el diccionario.");
        }
    }
}
