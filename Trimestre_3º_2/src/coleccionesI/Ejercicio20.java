package coleccionesI;

/*Ejercicio 20
Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
palabra en español con su traducción y esa traducción no la tiene ninguna otra
palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo)
y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede
dar la circunstancia de que el usuario introduzca una palabra en español que
no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
se dará la posibilidad al usuario de añadir la entrada correspondiente en el
diccionario pidiendo, claro está, la palabra en inglés.
Ejemplo:
    Introduzca una palabra y le daré los sinónimos: caliente
    Sinónimos de caliente: ardiente, abrasador
    Introduzca una palabra y le daré los sinónimos: rojo
    No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): s
    Introduzca un sinónimo de rojo: colorado
    Gracias por enseñarme nuevos sinónimos.
    Introduzca una palabra y le daré los sinónimos: blanco
    No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): s
    Introduzca la traducción de blanco en inglés: white
    Introduzca una palabra y le daré los sinónimos: rojo
    Sinónimos de rojo: colorado
    Introduzca una palabra y le daré los sinónimos: blanco
    No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): s
    Introduzca un sinónimo de blanco: albino
    Gracias por enseñarme nuevos sinónimos.
    Introduzca una palabra y le daré los sinónimos: blanco
    Sinónimos de blanco: albino
    Introduzca una palabra y le daré los sinónimos: salir
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio20 {

    private static Map<String, List<String>> diccionario = new HashMap<>();

    static {
        // Inicializamos el diccionario con algunas entradas
        List<String> sinonimosCaliente = new ArrayList<>();
        sinonimosCaliente.add("ardiente");
        sinonimosCaliente.add("abrasador");
        diccionario.put("caliente", sinonimosCaliente);

        List<String> sinonimosFrio = new ArrayList<>();
        sinonimosFrio.add("helado");
        sinonimosFrio.add("gélido");
        diccionario.put("frío", sinonimosFrio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }
            buscarSinonimos(palabra, scanner);
        }
        scanner.close();
    }

    private static void buscarSinonimos(String palabra, Scanner scanner) {
        if (diccionario.containsKey(palabra)) {
            List<String> sinonimos = diccionario.get(palabra);
            System.out.println("Sinónimos de " + palabra + ": " + String.join(", ", sinonimos));
        } else {
            System.out.println("No conozco sinónimos de esa palabra");
            System.out.print("¿Quiere añadir alguno? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                System.out.print("Introduzca un sinónimo de " + palabra + ": ");
                String nuevoSinonimo = scanner.nextLine();
                agregarSinonimo(palabra, nuevoSinonimo);
                System.out.println("Gracias por enseñarme nuevos sinónimos.");
            }
        }
    }

    private static void agregarSinonimo(String palabra, String nuevoSinonimo) {
        if (!diccionario.containsKey(palabra)) {
            diccionario.put(palabra, new ArrayList<>());
        }
        diccionario.get(palabra).add(nuevoSinonimo);
    }
}
