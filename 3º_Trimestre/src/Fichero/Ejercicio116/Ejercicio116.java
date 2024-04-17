package Fichero.Ejercicio116;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio116 {

	  public static void main(String[] args) {
	        String rutaArchivo = "textos\\texto.txt";

	        try {
	            FileReader fileReader = new FileReader(rutaArchivo);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String linea;
	            String lineaMasLarga = "";
	            int longitudMasLarga = 0;
	            List<String> lineasMasLargas = new ArrayList<>();

	            while ((linea = bufferedReader.readLine()) != null) {
	                int longitud = linea.length();

	                if (longitud > longitudMasLarga) {
	                    longitudMasLarga = longitud;
	                    lineaMasLarga = linea;
	                    lineasMasLargas.clear(); // Limpiamos la lista porque encontramos una línea más larga
	                } else if (longitud == longitudMasLarga) {
	                    lineasMasLargas.add(linea);
	                }
	            }

	            bufferedReader.close();

	            // Mostrar la línea más larga según los criterios
	            System.out.println("Línea más larga:");
	            System.out.println(lineaMasLarga);

	            if (!lineasMasLargas.isEmpty()) {
	                System.out.println("\nOtras líneas con la misma longitud:");
	                for (String lineaExtra : lineasMasLargas) {
	                    System.out.println(lineaExtra);
	                }
	            }

	        } catch (IOException e) {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	    }
	
}
