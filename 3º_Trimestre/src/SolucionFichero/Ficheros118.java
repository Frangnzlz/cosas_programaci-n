package SolucionFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Escriba nombre de fichero (si no indicada nada aurora.txt):\n>> ");
            String fileName = scanner.nextLine();
            
            if (fileName.isEmpty()) {
                fileName = "aurora.txt"; // Cambiar por el nombre del archivo por defecto o el que desees
            }
            
            try {
                mostrarContenidoArchivo(fileName);
                break;
            } catch (IOException e) {
                System.err.println("Error al abrir el archivo: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
    
    // Muestra el contenido del archivo por pantalla
    private static void mostrarContenidoArchivo(String fileName) throws IOException {
        System.out.println("Abriendo " + fileName);
        
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        
        reader.close();
    }
}

