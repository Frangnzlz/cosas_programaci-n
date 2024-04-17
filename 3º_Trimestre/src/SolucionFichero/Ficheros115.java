package SolucionFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros115 {
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";

        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int cantidadMayor = 0;
            int cantidadMenor = 0;

            // Leer cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                int numero = Integer.parseInt(linea);

                // Verificar si el número actual es mayor o menor que los anteriores
                if (numero > mayor) {
                    mayor = numero;
                    cantidadMayor = 1; // Reiniciar contador de mayor
                } else if (numero == mayor) {
                    cantidadMayor++;
                }

                if (numero < menor) {
                    menor = numero;
                    cantidadMenor = 1; // Reiniciar contador de menor
                } else if (numero == menor) {
                    cantidadMenor++;
                }
            }

            lector.close();

            // Imprimir resultados
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            System.out.println("El número mayor aparece " + cantidadMayor + " veces.");
            System.out.println("El número menor aparece " + cantidadMenor + " veces.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

