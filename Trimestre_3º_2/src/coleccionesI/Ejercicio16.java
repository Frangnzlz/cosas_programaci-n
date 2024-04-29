package coleccionesI;

/* Ejercicio 16
Realiza un programa que sepa decir la capital de un país (en caso de conocer
la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
principio, el programa solo conoce las capitales de España, Portugal y Francia.
Estos datos deberán estar almacenados en un diccionario. Los datos sobre
capitales que vaya aprendiendo el programa se deben almacenar en el mismo
diccionario. El usuario sale del programa escribiendo la palabra “salir”.
Ejemplo:
    Escribe el nombre de un país y te diré su capital: España
    La capital de España es Madrid
    Escribe el nombre de un país y te diré su capital: Alemania
    No conozco la respuesta ¿cuál es la capital de Alemania?: Berlín
    Gracias por enseñarme nuevas capitales
    Escribe el nombre de un país y te diré su capital: Portugal
    La capital de Portugal es Lisboa
    Escribe el nombre de un país y te diré su capital: Alemania
    La capital de Alemania es Berlín
    Escribe el nombre de un país y te diré su capital: Francia
    La capital de Francia es París
    Escribe el nombre de un país y te diré su capital: salir
  */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> capitales = new HashMap<>();

        // Inicializamos el diccionario con las capitales conocidas
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        String pais;
        while (true) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = scanner.nextLine();
            if (pais.equalsIgnoreCase("salir")) {
                System.out.println("Hasta luego!");
                break;
            }

            // Verificamos si conocemos la capital del país
            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));
            } else {
                System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
                String capital = scanner.nextLine();
                capitales.put(pais, capital);
                System.out.println("Gracias por enseñarme nuevas capitales.");
            }
        }
        scanner.close();
    }
}
