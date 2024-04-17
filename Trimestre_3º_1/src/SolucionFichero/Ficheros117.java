package SolucionFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del archivo de texto
        System.out.print("Introduce el nombre del archivo de texto: ");
        String filePath = scanner.nextLine();

        try {
            // Contar caracteres, palabras y líneas del archivo de texto
            int[] stats = contarEstadisticas(filePath);

            // Mostrar las estadísticas
            System.out.println("Número de caracteres: " + stats[0]);
            System.out.println("Número de palabras: " + stats[1]);
            System.out.println("Número de líneas: " + stats[2]);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Contar caracteres, palabras y líneas del archivo de texto
    private static int[] contarEstadisticas(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        int caracteres = 0;
        int palabras = 0;
        int lineas = 0;

        String linea;
        while ((linea = reader.readLine()) != null) {
            lineas++;
            caracteres += linea.length();

            // Contar palabras
            String[] palabrasLinea = linea.split("\\s+");
            palabras += palabrasLinea.length;
        }

        reader.close();

        return new int[]{caracteres, palabras, lineas};
    }
}

