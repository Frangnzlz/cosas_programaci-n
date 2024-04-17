package SolucionManejoFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejoFicheros2 {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt"; // Nombre del archivo de texto
        String palabraBuscada = "palabra"; // Palabra que se va a buscar en el archivo

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 1;

            while ((linea = reader.readLine()) != null) {
                int indice = 0;
                while ((indice = linea.indexOf(palabraBuscada, indice)) != -1) {
                    System.out.println("Palabra encontrada en la línea " + numeroLinea + ", posición " + indice);
                    indice += palabraBuscada.length(); // Mover el índice después de la última ocurrencia encontrada
                }
                numeroLinea++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }
}

