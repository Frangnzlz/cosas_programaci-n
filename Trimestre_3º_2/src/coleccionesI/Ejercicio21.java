package coleccionesI;

/*Ejercicio 21
La asociación “Amigos de los anfibios” nos ha encargado una aplicación
educativa sobre estos animalitos. Crea un programa que pida al usuario el tipo
de anfibio y que, a continuación, nos muestre su hábitat y su alimentación. Si
el tipo de anfibio introducido no existe, se debe mostrar el mensaje “Ese tipo
de anfibio no existe”.
Colecciones y diccionarios 237
Ejemplo 1:
Introduzca el tipo de anfibio: salamandra
Hábitat: Ecosistemas húmedos.
Alimentación: Pequeños crustáceos e insectos.
Ejemplo 2:
Introduzca el tipo de anfibio: gato
Ese tipo de anfibio no existe.
La información se debe guardar en dos diccionarios (dos HashMap).
Uno de ellos tendrá parejas clave-valor del tipo (tipo de anfibio,
hábitat) y otro (tipo de anfibio, alimentación).
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ejercicio21 {

    private static Map<String, String> habitats = new HashMap<>();
    private static Map<String, String> alimentacion = new HashMap<>();

    static {
        // Inicializamos los diccionarios con información sobre hábitats y alimentación de los anfibios
        habitats.put("salamandra", "Ecosistemas húmedos.");
        alimentacion.put("salamandra", "Pequeños crustáceos e insectos.");
        habitats.put("rana", "Zonas acuáticas y terrestres.");
        alimentacion.put("rana", "Insectos, larvas, gusanos y pequeños invertebrados.");
        habitats.put("sapo", "Terrenos húmedos y bosques.");
        alimentacion.put("sapo", "Insectos, larvas, lombrices y pequeños vertebrados.");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduzca el tipo de anfibio: ");
            String tipoAnfibio = scanner.nextLine();

            if (tipoAnfibio.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            mostrarInformacionAnfibio(tipoAnfibio);
        }
        scanner.close();
    }

    private static void mostrarInformacionAnfibio(String tipoAnfibio) {
        if (habitats.containsKey(tipoAnfibio)) {
            System.out.println("Hábitat: " + habitats.get(tipoAnfibio));
            System.out.println("Alimentación: " + alimentacion.get(tipoAnfibio));
        } else {
            System.out.println("Ese tipo de anfibio no existe.");
        }
    }
}