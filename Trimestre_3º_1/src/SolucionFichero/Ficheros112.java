package SolucionFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pidiendo al usuario su nombre y edad
        System.out.print("Dime tu nombre >> ");
        String nombre = scanner.nextLine();

        System.out.print("Dime tu edad >> ");
        int edad = Integer.parseInt(scanner.nextLine());

        // Guardando los datos en el archivo datos.txt
        guardarDatos(nombre, edad);

        scanner.close();
    }

    public static void guardarDatos(String nombre, int edad) {
        // Ruta del archivo
        String rutaArchivo = "datos.txt";
        File archivo = new File(rutaArchivo);

        try {
            // Borrar el contenido del archivo si ya existe
            if (archivo.exists()) {
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(""); // Escribir una cadena vacía para borrar el contenido
                escritor.close();
            }

            // Escribir los datos en el archivo
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("Nombre: " + nombre + "\n");
            escritor.write("Edad: " + edad + "\n");
            escritor.close();

            System.out.println("Datos guardados en fichero " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo: " + e.getMessage());
        }
    }
}

