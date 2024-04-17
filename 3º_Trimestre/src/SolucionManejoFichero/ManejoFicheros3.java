package SolucionManejoFichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManejoFicheros3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el nombre del archivo: ");
            String nombreArchivo = scanner.nextLine();

            System.out.println("Introduce el contenido del archivo (introduce una línea vacía para finalizar):");
            String contenido = "";
            String linea;
            while (!(linea = scanner.nextLine()).isEmpty()) {
                contenido += linea + "\n";
            }

            // Crear el archivo y escribir el contenido
            crearArchivo(nombreArchivo, contenido);
            System.out.println("Archivo \"" + nombreArchivo + "\" creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void crearArchivo(String nombreArchivo, String contenido) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
        writer.write(contenido);
        writer.close();
    }
}

