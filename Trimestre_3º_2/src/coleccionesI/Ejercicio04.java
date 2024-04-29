package coleccionesI;

/** 4. Realiza un programa equivalente al anterior pero en esta ocasión,
* el programa debe ordenar palabras en lugar de números.
*
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> palabras = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            palabras.add(scanner.nextLine());
        }

        // Ordenar de menor a mayor
        Collections.sort(palabras);
        System.out.println("Palabras ordenadas de menor a mayor: " + palabras);

        // Ordenar de mayor a menor
        Collections.sort(palabras, Collections.reverseOrder());
        System.out.println("Palabras ordenadas de mayor a menor: " + palabras);

        scanner.close();
    }
}
