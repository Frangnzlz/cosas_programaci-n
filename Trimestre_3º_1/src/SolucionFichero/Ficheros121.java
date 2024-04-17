package SolucionFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros121 {
    private static final String PADRON_FILE = "padron.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Padrón de Habitantes de Villanueva del Trabuco");
        System.out.println("==============================================");

        int opcion;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Registrar habitante");
            System.out.println("2. Mostrar padrón");
            System.out.println("3. Salir");
            System.out.print("¿Opción? ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    registrarHabitante(scanner);
                    break;
                case 2:
                    mostrarPadron();
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida (1-3)");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void registrarHabitante(Scanner scanner) {
        try {
            FileReader fr = new FileReader(PADRON_FILE);
            BufferedReader br = new BufferedReader(fr);
            String line;
            boolean encontrado = false;

            System.out.print("DNI? ");
            String dni = scanner.nextLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().equals(dni)) {
                    encontrado = true;
                    break;
                }
            }

            br.close();

            if (!encontrado) {
                FileWriter fw = new FileWriter(PADRON_FILE, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);

                out.println(dni);
                out.close();

                System.out.println("Habitante registrado");
            } else {
                System.out.println("El habitante ya está registrado. Introduce otro DNI.");
            }
        } catch (IOException e) {
            System.err.println("Error al leer/escribir en el archivo: " + e.getMessage());
        }
    }

    private static void mostrarPadron() {
        try {
            FileReader fr = new FileReader(PADRON_FILE);
            BufferedReader br = new BufferedReader(fr);
            String line;

            System.out.println("Padrón de Habitantes de Villanueva del Trabuco");
            System.out.println("==============================================");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

