/**
* 1. Crea un ArrayList con los nombres de 6 compañeros de clase. A
* continuación, muestra esos nombres por pantalla. Utiliza para
* ello un bucle for que recorra todo el ArrayList sin usar ningún
* índice.
*
*/
package coleccionesI;
import java.util.ArrayList;

public class Ejercicio01 {
    
public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<>();
    
    a.add("José Manuel");
    a.add("Salvador");
    a.add("Rubén");
    a.add("Irene");
    a.add("Noemí");
    a.add("Begoña");
    System.out.println("Contenido de la lista: ");
    
    for(String nombre : a) {
        System.out.println(nombre);
    }
    }
}