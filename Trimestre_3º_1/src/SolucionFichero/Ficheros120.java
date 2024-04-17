package SolucionFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los nombres de los archivos de texto
        System.out.print("Ingrese el nombre del primer archivo de texto: ");
        String primerArchivo = scanner.nextLine();
        System.out.print("Ingrese el nombre del segundo archivo de texto: ");
        String segundoArchivo = scanner.nextLine();

        // Crear el nombre del nuevo archivo
        String nombreNuevoArchivo = primerArchivo.replace(".txt", "") + "-" + segundoArchivo.replace(".txt", "") + ".txt";

        try {
            // Leer el contenido del primer archivo
            BufferedReader lectorPrimerArchivo = new BufferedReader(new FileReader(primerArchivo));
            BufferedWriter escritorNuevoArchivo = new BufferedWriter(new FileWriter(nombreNuevoArchivo));

            String linea;
            while ((linea = lectorPrimerArchivo.readLine()) != null) {
                escritorNuevoArchivo.write(linea);
                escritorNuevoArchivo.newLine();
            }

            // Leer el contenido del segundo archivo
            BufferedReader lectorSegundoArchivo = new BufferedReader(new FileReader(segundoArchivo));
            while ((linea = lectorSegundoArchivo.readLine()) != null) {
                escritorNuevoArchivo.write(linea);
                escritorNuevoArchivo.newLine();
            }

            // Cerrar los lectores y escritores
            lectorPrimerArchivo.close();
            lectorSegundoArchivo.close();
            escritorNuevoArchivo.close();

            System.out.println("Se ha creado el archivo " + nombreNuevoArchivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

