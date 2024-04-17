package SolucionManejoFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejoFicheros1 {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt"; // Nombre del archivo de texto
        int contadorPalabras = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split("\\s+"); // Dividir la línea en palabras usando espacios como separador
                contadorPalabras += palabras.length;
            }

            System.out.println("El número total de palabras en el archivo es: " + contadorPalabras);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }
}

