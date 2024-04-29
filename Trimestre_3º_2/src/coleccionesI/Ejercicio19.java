package coleccionesI;

/** Ejercicio 19
Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
proporciona a continuación. El programa preguntará una palabra y dará una
lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
“caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
“hot”), por tanto solo tendrá que buscar las palabras en español que también
signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
(“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
Ejemplo:
Introduzca una palabra y le daré los sinónimos: caliente
Sinónimos de caliente: ardiente, abrasador
Introduzca una palabra y le daré los sinónimos: rojo
No conozco sinónimos de esa palabra
Introduzca una palabra y le daré los sinónimos: blanco
No conozco esa palabra
Introduzca una palabra y le daré los sinónimos: grande
No conozco sinónimos de esa palabra
Introduzca una palabra y le daré los sinónimos: salir
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Ejercicio19 {
 
    //Se declara una variable estática diccionario, que es un mapa que asigna una palabra en español (String) a una
    // lista de sinónimos (List<String>). Se inicializa como una nueva instancia de HashMap.
    //static porque al añadir nuevas palabras siempre se maneja el mismo diccionario y no se crean nuevas instancias
    //Cada entrada en el diccionario consiste en una palabra en español como clave y una lista de sinónimos en español como 
    //valor.
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
        
        List<String> sinonimosOptimo = new ArrayList<>();
        sinonimosFrio.add("Excelente");
        sinonimosFrio.add("Sobresaliente");
        diccionario.put("Optimo", sinonimosOptimo);
        
        List<String> sinonimosVeloz = new ArrayList<>();
        sinonimosFrio.add("ligero");
        sinonimosFrio.add("pronto");
        diccionario.put("Optimo", sinonimosVeloz);
        
        List<String> sinonimosFeliz = new ArrayList<>();
        sinonimosFrio.add("Contento");
        sinonimosFrio.add("Alegre");
        diccionario.put("Feliz", sinonimosFeliz);

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

            buscarSinonimos(palabra);
        }
        scanner.close();
    }

    private static void buscarSinonimos(String palabra) {
        if (diccionario.containsKey(palabra)) {
            List<String> sinonimos = diccionario.get(palabra);
            System.out.println("Sinónimos de " + palabra + ": " + String.join(", ", sinonimos));
        } else {
            System.out.println("No conozco sinónimos de esa palabra");
        }
    }
}
