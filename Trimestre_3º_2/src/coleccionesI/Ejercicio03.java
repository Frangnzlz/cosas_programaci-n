package coleccionesI;


/**
* 3. Escribe un programa que ordene 10 números enteros introducidos por
* teclado y almacenados en un objeto de la clase ArrayList .
*
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        // Ordenar de menor a mayor
        Collections.sort(numeros);
        System.out.println("Números ordenados de menor a mayor: " + numeros);

        // Ordenar de mayor a menor
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Números ordenados de mayor a menor: " + numeros);

        scanner.close();
    }
}
