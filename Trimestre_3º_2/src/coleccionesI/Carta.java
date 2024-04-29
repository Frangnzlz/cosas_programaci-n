
package coleccionesI;

// Clase para representar una carta de la baraja española Ejercicio 08
class Carta {
    private String palo; // Palo de la carta
    private String valor; // Valor de la carta

    // Constructor de la clase Carta
    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // Método para obtener la representación de la carta como cadena de texto
    public String toString() {
        return valor + " de " + palo;
    }

}