package SolucionFichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Creamos el archivo EJ113.dat y el escritor para escribir en él
            BufferedWriter writer = new BufferedWriter(new FileWriter("EJ113.dat"));

            System.out.println("Introduce frases por teclado (introduce una frase vacía para terminar):");

            // Leemos las frases del usuario hasta que introduzca una frase vacía
            String frase;
            do {
                frase = scanner.nextLine();
                if (!frase.isEmpty()) {
                    // Escribimos la frase en el archivo
                    writer.write(frase);
                    writer.newLine(); // Añadimos una nueva línea para separar las frases en el archivo
                }
            } while (!frase.isEmpty());

            // Cerramos el escritor
            writer.close();

            System.out.println("Frases guardadas correctamente en el archivo EJ113.dat.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        } finally {
            // Cerramos el scanner
            scanner.close();
        }
    }
}

