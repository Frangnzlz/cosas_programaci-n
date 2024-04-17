package SolucionManejoFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManejoFicheros4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario los nombres de los archivos de entrada
            List<String> nombresArchivosEntrada = new ArrayList<>();
            System.out.println("Introduce los nombres de los archivos de entrada (introduce una línea vacía para terminar):");
            String nombreArchivo;
            while (!(nombreArchivo = scanner.nextLine()).isEmpty()) {
                nombresArchivosEntrada.add(nombreArchivo);
            }

            // Solicitar al usuario el nombre del archivo de salida
            System.out.print("Introduce el nombre del archivo de salida: ");
            String nombreArchivoSalida = scanner.nextLine();

            // Concatenar el contenido de los archivos de entrada
            concatenarArchivos(nombresArchivosEntrada, nombreArchivoSalida);
            System.out.println("Archivos concatenados correctamente en " + nombreArchivoSalida);
        } catch (IOException e) {
            System.out.println("Error al concatenar los archivos.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void concatenarArchivos(List<String> nombresArchivosEntrada, String nombreArchivoSalida) throws IOException {
        try (Writer writer = new BufferedWriter(new FileWriter(nombreArchivoSalida))) {
            for (String nombreArchivoEntrada : nombresArchivosEntrada) {
                // Abrir el archivo de entrada y leer su contenido
                try (Reader reader = new BufferedReader(new FileReader(nombreArchivoEntrada))) {
                    int c;
                    while ((c = reader.read()) != -1) {
                        writer.write(c);
                    }
                }
            }
        }
    }
}

