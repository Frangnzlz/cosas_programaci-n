package coleccionesI;
/*
* 9. Modifica el programa anterior de tal forma que las cartas se
* muestren ordenadas. Primero se ordenarán por palo: bastos,
* copas, espadas, oros. Cuando coincida el palo, se ordenará por
* número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
*
*/
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio09 {
    public static void main(String[] args) {
        // Crear una lista para almacenar las cartas
        ArrayList<CartaComparable> baraja = new ArrayList<>();

        // Agregar las cartas a la baraja
        String[] palos = {"bastos", "copas", "espadas", "oros"};
        String[] numeros = {"as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
        for (String palo : palos) {
            for (String numero : numeros) {
                baraja.add(new CartaComparable(palo, numero));
            }
        }

        // Barajar las cartas
        Collections.shuffle(baraja);

        // Ordenar las cartas sort
        // El método compareTo no se utiliza directamente en el main para ordenar explícitamente las cartas. 
        // Se invoca implícitamente cuando utilizamos Collections.sort para ordenar la lista de cartas.
        // Al llamar a Collections.sort, el método sort utiliza el método compareTo de la interfaz Comparable para comparar ç
        // y ordenar los elementos de la lista. 
        Collections.sort(baraja);

        // Mostrar las cartas ordenadas
        for (CartaComparable cartaComparable : baraja) {
            System.out.println(cartaComparable);
        }
    }
}
