package coleccionesI;

/**Ejercicio 23
En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones,
una torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente,
1 peón. Realiza un programa que genere al azar las capturas que ha hecho
un jugador durante una partida. El número de capturas será un valor aleatorio
entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de
capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles,
2 caballos y 8 peones. Al final debe aparecer la puntuación total.
Ejemplo:
    Fichas capturadas por el jugador:
    Alfil (3 peones)
    Caballo (2 peones)
    Peón (1 peones)
    Torre (5 peones)
    Peón (1 peones)
    Puntos totales: 12 peones
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ejercicio23 {
    
    public static void main(String[] args) {
        
        // Lista de piezas disponibles para capturar
        List<Pieza> piezasDisponibles = new ArrayList<>();
        piezasDisponibles.add(new Pieza("Dama", 9));
        piezasDisponibles.add(new Pieza("Torre", 5));
        piezasDisponibles.add(new Pieza("Alfil", 3));
        piezasDisponibles.add(new Pieza("Caballo", 2));
        piezasDisponibles.add(new Pieza("Peón", 1));

        // Generador de números aleatorios
        Random random = new Random();

        // Generar un número aleatorio entre 0 y 15 para representar las capturas
        int numCapturas = random.nextInt(16); // Entre 0 y 15 capturas

        // Mostrar las fichas capturadas por el jugador
        System.out.println("Fichas capturadas por el jugador:");
        int puntosTotales = 0; // Puntuación total inicializada en 0
        for (int i = 0; i < numCapturas; i++) {
            // Seleccionar una pieza aleatoria de la lista de piezas disponibles
            Pieza piezaCapturada = piezasDisponibles.get(random.nextInt(piezasDisponibles.size()));
            // Agregar el valor de la pieza capturada a la puntuación total
            puntosTotales += piezaCapturada.getValorEnPeones();
            // Mostrar la pieza capturada
            System.out.println(piezaCapturada);
            // Si se captura un peón, se quita una instancia de peón de las piezas disponibles
            if (piezaCapturada.getValorEnPeones() == 1) {
                piezasDisponibles.removeIf(p -> p.getValorEnPeones() == 1);
            }
        }

        // Mostrar la puntuación total
        System.out.println("Puntos totales: " + puntosTotales + " peones");
    }
}