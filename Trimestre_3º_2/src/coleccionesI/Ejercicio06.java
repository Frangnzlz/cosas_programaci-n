package coleccionesI;
/**
* 6. Implementa el control de acceso al área restringida de un
* programa. Se debe pedir un nombre de usuario y una contraseña. Si
* el usuario introduce los datos correctamente, el programa dirá
* "Ha accedido al área restringida". El usuario tendrá un máximo de
* 3 oportunidades. Si se agotan las oportunidades el programa dirá
* "Lo siento, no tiene acceso al área restringida". Los nombres de
* usuario con sus correspondientes contraseñas deben estar
* almacenados en una estructura de la clase HashMap.
*
*/
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los nombres de usuario y contraseñas
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("usuario1", "contrasena1");
        usuarios.put("usuario2", "contrasena2");
        usuarios.put("usuario3", "contrasena3");

        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Contador para contar el número de intentos
        int intentos = 3;

        // Bucle para permitir hasta 3 intentos
        while (intentos > 0) {
            // Solicitar nombre de usuario y contraseña
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contrasena = scanner.nextLine();

            // Verificar si el nombre de usuario existe y la contraseña coincide
            if (usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(contrasena)) {
                System.out.println("Ha accedido al área restringida.");
                return; // Salir del programa si el acceso es exitoso
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Intentos restantes: " + (--intentos));
            }
        }
        // Si se agotan los intentos
        System.out.println("Lo siento, no tiene acceso al área restringida.");
    }
}
