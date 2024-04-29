package coleccionesI;

/** 7. La máquina Eurocoin genera una moneda de curso legal cada vez que
* se pulsa un botón siguiendo la siguiente pauta: o bien coincide el
* valor con la moneda anteriormente generada - 1 céntimo, 2 céntimos,
* 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros -
* o bien coincide la posición – cara o cruz. Simula, mediante un
* programa, la generación de 6 monedas aleatorias siguiendo la pauta
* correcta. Cada moneda generada debe ser una instancia de la clase
* Moneda y la secuencia se debe ir almacenando en una lista.
* Ejemplo:
* 2 céntimos – cara
* 2 céntimos – cruz
* 50 céntimos – cruz
* 1 euro – cruz
* 1 euro – cara
* 10 céntimos – cara
 */
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {
        // Crear una lista para almacenar las monedas generadas
        ArrayList<Moneda> secuenciaMonedas = new ArrayList<>();

        // Valores y posiciones posibles para las monedas
        String[] valores = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
        String[] posiciones = {"cara", "cruz"};

        // Crear un generador de números aleatorios
        Random random = new Random();

        // Generar 6 monedas aleatorias siguiendo la pauta correcta
        for (int i = 0; i < 6; i++) {
            // Generar índice aleatorio para el valor y la posición
            int indiceValor = random.nextInt(valores.length);
            int indicePosicion = random.nextInt(posiciones.length);

            // Crear una nueva moneda con el valor y la posición aleatorios
            Moneda moneda = new Moneda(valores[indiceValor], posiciones[indicePosicion]);

            // Añadir la moneda a la lista de secuencia de monedas
            secuenciaMonedas.add(moneda);
        }

        // Mostrar la secuencia de monedas generadas
        for (Moneda moneda : secuenciaMonedas) {
            System.out.println(moneda);
        }
    }
}

