package coleccionesI;
/**
* 12. Escribe un programa que genere una secuencia de 5 cartas de la
* baraja española y que sume los puntos según el juego de la
* brisca. El valor de las cartas se debe guardar en una estructura
* <code>HashMap</code> que debe contener parejas (figura, valor),
* por ejemplo ("caballo", 3).
* La secuencia de cartas debe ser una estructura de la clase <code>
* ArrayList</code> que contiene objetos de la clase <code>Carta
* </code>. El valor de las cartas es el siguiente: as 
*/

/*JUEGO BRISCA +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
El objetivo del juego es ganar la mayor cantidad posible de bazas, que son conjuntos de cartas jugadas en una ronda.
Se juega con una baraja española de 40 cartas. Cada carta tiene un FIGURA y un PALO.
El valor de las cartas varía según su figura. Aquí tienes el valor típico de las cartas en la Brisca:
    As: 11 puntos.
    3: 10 puntos.
    Rey: 4 puntos.
    Caballo: 3 puntos.
    Sota: 2 puntos.
    7, 6, 5 y 4: 0 puntos.
    2: 0 puntos.
En la Brisca, cada jugador recibe tres cartas. Luego, se reparte una carta boca arriba en el centro de la mesa. 
La carta que se muestra en el centro determina el palo que es triunfo para esa mano.

El jugador a la derecha del que reparte comienza la primera baza, jugando una carta.
Los jugadores deben seguir el palo de la primera carta jugada, si pueden. Si no, pueden jugar una carta de otro palo.
El jugador que gana una baza comienza la siguiente baza.
Al finalizar la ronda, se suman los puntos de las cartas ganadas por cada equipo. El equipo que haya ganado más puntos gana la partida.
Carta triunfo:
La carta que se muestra en el centro determina el palo triunfo para esa mano. Las cartas del palo triunfo tienen prioridad sobre las cartas de otros palos.
El equipo que gana más bazas recibe puntos según las cartas que haya ganado. Ganar la última baza otorga un punto adicional.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Ejercicio12 {
   public static void main(String[] args) {
        // Crear una estructura HashMap para almacenar los valores de las cartas
        HashMap<String, Integer> valoresCartas = new HashMap<>();
        valoresCartas.put("as", 11);
        valoresCartas.put("3", 10);
        valoresCartas.put("rey1", 4); // Diferente clave para el rey
        valoresCartas.put("2", 0);
        valoresCartas.put("4", 0);
        valoresCartas.put("5", 0);
        valoresCartas.put("6", 0);
        valoresCartas.put("7", 0);
        valoresCartas.put("sota", 2);
        valoresCartas.put("caballo", 3);
        valoresCartas.put("rey2", 4); // Otra clave diferente para el rey

        // Crear el mazo de cartas
        CartaBrisca[] mazo = crearMazo();
        
        // Crear una lista de cartas para representar la mano del jugador
        ArrayList<CartaBrisca> mano = new ArrayList<>();
        
        // Generar una secuencia de 5 cartas aleatorias
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            // Obtener un índice aleatorio para seleccionar una carta del mazo
            int indiceCarta = rand.nextInt(mazo.length);
            // Obtener la carta del mazo usando el índice aleatorio
            CartaBrisca carta = mazo[indiceCarta];
            // Agregar la carta a la mano del jugador
            mano.add(carta);
        }
        
        // Calcular la puntuación total de la mano
        int puntuacionTotal = 0;
        for (CartaBrisca carta : mano) {
            // Obtener el valor de la carta desde el HashMap
            int valor = valoresCartas.get(carta.getFigura());
            // Sumar el valor al total de puntuación
            puntuacionTotal += valor;
        }
        
        // Mostrar la mano y la puntuación total
        System.out.println("Mano de cartas:");
        for (CartaBrisca carta : mano) {
            System.out.println(carta);
        }
        System.out.println("Puntuación total: " + puntuacionTotal);
    }
    
    // Método para crear el mazo de cartas
    public static CartaBrisca[] crearMazo() {
        String[] figuras = {"as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
        String[] palos = {"bastos", "copas", "espadas", "oros"};
        CartaBrisca[] mazo = new CartaBrisca[40];
        int index = 0;
        for (String figura : figuras) {
            for (String palo : palos) {
                mazo[index] = new CartaBrisca(figura, palo);
                index++;
            }
        }
        return mazo;
    }
}
