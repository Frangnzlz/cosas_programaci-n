package SolucionFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Ficheros122 {
    private static final String DATA_DIRECTORY = "data/";
    private static final String PLAYER_FILE_EXTENSION = ".dat";
    private static final String HORSES_FILE = DATA_DIRECTORY + "horses.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso a: Mensaje de bienvenida y pedir nombre del jugador
        System.out.println("Bienvenido a Hol Horse Alone");
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreJugador = scanner.nextLine();
        String playerFile = DATA_DIRECTORY + nombreJugador + PLAYER_FILE_EXTENSION;

        try {
            // Paso c: Cargar datos del jugador o crear nuevo archivo
            int dinero = 0, apuestasTotales = 0, apuestasGanadas = 0;
            boolean nuevoJugador = false;

            try (BufferedReader br = new BufferedReader(new FileReader(playerFile))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(":");
                    switch (partes[0]) {
                        case "dinero":
                            dinero = Integer.parseInt(partes[1]);
                            break;
                        case "aput":
                            apuestasTotales = Integer.parseInt(partes[1]);
                            break;
                        case "apug":
                            apuestasGanadas = Integer.parseInt(partes[1]);
                            break;
                    }
                }
            } catch (IOException e) {
                // El archivo del jugador no existe, se creará más tarde
                nuevoJugador = true;
            }

            // Paso d: Mostrar datos del jugador
            System.out.println("Datos del jugador:");
            System.out.println("Nombre: " + nombreJugador);
            System.out.println("Dinero: " + dinero);
            System.out.println("Apuestas totales: " + apuestasTotales);
            System.out.println("Apuestas ganadas: " + apuestasGanadas);

            // Paso e: Cargar datos de los caballos
            String[] nombresCaballos = new String[3];
            int[] victoriasCaballos = new int[3];

            try (BufferedReader br = new BufferedReader(new FileReader(HORSES_FILE))) {
                for (int i = 0; i < 3; i++) {
                    String[] partes = br.readLine().split(":");
                    nombresCaballos[i] = partes[0];
                    victoriasCaballos[i] = Integer.parseInt(partes[1]);
                }
            } catch (IOException e) {
                System.err.println("Error: No se puede cargar el archivo de caballos.");
                return;
            }

            // Paso f: Mostrar los datos de los caballos y pedir al jugador que elija uno
            System.out.println("\nCaballos disponibles:");
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + nombresCaballos[i] + " - Victorias: " + victoriasCaballos[i]);
            }
            System.out.print("Elige un caballo para apostar (1-3): ");
            int caballoElegido = scanner.nextInt();
            if (caballoElegido < 1 || caballoElegido > 3) {
                System.out.println("Opción no válida. Saliendo del juego.");
                return;
            }

            // Paso g: Pedir apuesta al jugador
            System.out.print("Ingrese su apuesta (mínimo 15€): ");
            int apuesta = scanner.nextInt();
            if (apuesta < 15 || apuesta > dinero) {
                System.out.println("Apuesta inválida. Saliendo del juego.");
                return;
            }

            // Paso h: Confirmar apuesta
            scanner.nextLine(); // Limpiar buffer
            System.out.print("¿Estás seguro de apostar " + apuesta + "€ al caballo " + nombresCaballos[caballoElegido - 1] + "? (s/n): ");
            String confirmacion = scanner.nextLine();
            if (!confirmacion.equalsIgnoreCase("s")) {
                System.out.println("Apuesta cancelada. Saliendo del juego.");
                return;
            }

            // Paso i: Simular carrera y determinar ganador
            Random random = new Random();
            int caballoGanador = random.nextInt(3) + 1;
            System.out.println("\n¡Y los caballos están fuera! La carrera está en pleno apogeo...");
            System.out.println("El caballo ganador es: " + nombresCaballos[caballoGanador - 1] + "!");
            boolean ganador = (caballoGanador == caballoElegido);

            // Paso j: Calcular ganancias/perdidas y actualizar datos del jugador y caballo
            if (ganador) {
                int ganancia = apuesta * 3 / 2;
                dinero += ganancia;
                apuestasGanadas++;
                victoriasCaballos[caballoGanador - 1]++;
                System.out.println("¡Felicidades! Has ganado " + ganancia + "€.");
            } else {
                dinero -= apuesta;
                System.out.println("Lo siento, has perdido " + apuesta + "€.");
            }
            apuestasTotales++;

            // Paso k: Actualizar datos del jugador y guardarlos en el archivo
            try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(playerFile)))) {
                pw.println("nombre:" + nombreJugador);
                pw.println("dinero:" + dinero);
                pw.println("aput:" + apuestasTotales);
                pw.println("apug:" + apuestasGanadas);
            } catch (IOException e) {
                System.err.println("Error: No se puede guardar los datos del jugador.");
                return;
            }

            // Paso l: Verificar si el jugador puede continuar apostando
            if (dinero < 15) {
                System.out.println("Lo siento, no tienes suficiente dinero para continuar. Saliendo del juego.");
                return;
            } else {
                System.out.print("¿Quieres seguir apostando? (s/n): ");
                confirmacion = scanner.nextLine();
                if (!confirmacion.equalsIgnoreCase("s")) {
                    System.out.println("Gracias por jugar. Saliendo del juego.");
                    return;
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

