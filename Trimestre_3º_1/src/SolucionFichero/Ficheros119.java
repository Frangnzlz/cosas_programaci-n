package SolucionFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros119 {
    public static void main(String[] args) {
        String archivo = "inventario.txt"; // Cambia esto por la ruta de tu archivo de inventario

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(":");
                if (datos.length == 3) {
                    String nombre = datos[0];
                    int precio = Integer.parseInt(datos[1]);
                    int cantidad = Integer.parseInt(datos[2]);
                    
                    // Mostrar el inventario
                    System.out.println("Item:");
                    System.out.println(nombre);
                    System.out.println("Precio:");
                    System.out.println(precio);
                    System.out.println("Cantidad:");
                    System.out.println(cantidad);
                    System.out.println();
                } else {
                    System.out.println("Error en el formato de la línea: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

