
package coleccionesI;
// Clase para representar una carta de la baraja Ejercicio 12
public class CartaBrisca {
    private String figura;
    private String palo;
    
    public CartaBrisca(String figura, String palo) {
        this.figura = figura;
        this.palo = palo;
    }
    
    public String getFigura() {
        return figura;
    }
    
    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        return figura + " de " + palo;
    }
}   
