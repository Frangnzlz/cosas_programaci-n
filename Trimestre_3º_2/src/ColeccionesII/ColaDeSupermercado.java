/*126.-  Crea la clase persona. De un apersona necesitamos el DNI, nombre, 
apellido (uno solo), sexo, edad y peso. Todas las propiedades serán privadas. 
La clase tendrá un constructor normal (con todos los argumentos) y uno solo con 
el DNI (nombre y apellido quedaran como cadena vacía, edad y peso se 
inicializará a 0. 
Además de los getters y setters correspondientes, la clase tendrá los métodos: 
toString y equals. 
Haciendo uso de la clase persona, implementa la clase Cola de Supermercado. 
En una cola de supermercado, la primera persona que entra en la cola, es la 
primera que puede abandonarla. 
Usa las variables de clase que creas necesarias (todas privadas) e implementa 
los métodos: 
a) EstaVacia: devuelve Verdadero o Falso si la cola está vacía o no. 
b) Entrar: mete una persona en la cola. 
c) Salir: saca de la cola a la persona que le corresponde. Muestra la 
información de esa persona. 
d) Primero: este método devuelve una persona. La persona devuelta será la 
que está primera en la cola. Nota: No muestra nada por pantalla. 
e) Cantidad: devuelve el número de personas que hay en la cola.
*/
package ColeccionesII;

import java.util.ArrayList;
import java.util.HashMap;
        
public class ColaDeSupermercado {
    private ArrayList<Persona> cola;
    private HashMap<String, Integer> posicionPorDni;

    public ColaDeSupermercado() {
        this.cola = new ArrayList<>();
        this.posicionPorDni = new HashMap<>();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void entrar(Persona persona) {
        cola.add(persona);
        posicionPorDni.put(persona.getDni(), cola.size() - 1);
    }

    public Persona salir() {
        if (!cola.isEmpty()) {
            Persona persona = cola.remove(0);
            posicionPorDni.remove(persona.getDni());
            return persona;
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public Persona primero() {
        if (!cola.isEmpty()) {
            return cola.get(0);
        } else {
            System.out.println("La cola está vacía.");
            return null;
        }
    }

    public int cantidad() {
        return cola.size();
    }
}
