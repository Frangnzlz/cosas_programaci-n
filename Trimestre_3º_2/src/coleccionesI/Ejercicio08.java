package coleccionesI;

import java.util.ArrayList;
import java.util.Collections;

// Clase principal del programa
public class Ejercicio08 {
    public static void main(String[] args) {
        // Crear una baraja española
        ArrayList<Carta> baraja = new ArrayList<>();
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        // Generar todas las cartas de la baraja
        for (String palo : palos) {
            for (String valor : valores) {
                baraja.add(new Carta(palo, valor));
            }
        }

        // Barajar la baraja
        //METODO shuffle se utiliza para mezclar de manera aleatoria (barajar) los elementos de una lista. 
        //Después de llamar a este método, el orden de las cartas en la lista baraja será aleatorio.
        Collections.shuffle(baraja);

        // Seleccionar las primeras 10 cartas de la baraja
        // METODO subList(int fromIndex, int toIndex) de la clase List devuelve una SUBLISTA de la lista original desde el 
        // índice fromIndex (inclusive) hasta el índice toIndex (exclusivo). 
         ArrayList<Carta> cartasSeleccionadas = new ArrayList<>(baraja.subList(0, 10));

        // Imprimir las cartas seleccionadas
        for (Carta carta : cartasSeleccionadas) {
            System.out.println(carta);
        }
    }
}
