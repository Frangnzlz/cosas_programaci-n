package SolucionFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        
        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            int numeroLinea = 1;

            System.out.println("Abriendo " + nombreArchivo);
            // Leer cada línea del archivo y mostrarla precedida por el número de línea
            while ((linea = lector.readLine()) != null) {
                System.out.println(numeroLinea + ":" + linea);
                numeroLinea++;
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

