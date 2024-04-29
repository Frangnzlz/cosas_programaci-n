package coleccionesI;

// Clase Carta que representa una carta de la baraja española Ejercicio09
class CartaComparable implements Comparable<CartaComparable> {
    private String palo; // Palo de la carta
    private String numero; // Número de la carta

    // Constructor
    public CartaComparable(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    // Método para obtener la representación de la carta como cadena de texto
    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    // Método compareTo para comparar cartas
    @Override
    public int compareTo(CartaComparable otraCarta) {
        // Comparación por palo
        int comparacionPalo = this.palo.compareTo(otraCarta.palo);
        if (comparacionPalo != 0) {
            return comparacionPalo;
        }
        // Si los palos son iguales, comparar por número
        return obtenerValorNumero(this.numero) - obtenerValorNumero(otraCarta.numero);
    }

    // Método auxiliar para obtener el valor numérico de las cartas (as, sota, caballo, rey)
    private int obtenerValorNumero(String numero) {
        switch (numero) {
            case "as":
                return 1;
            case "sota":
                return 10;
            case "caballo":
                return 11;
            case "rey":
                return 12;
            default:
                return Integer.parseInt(numero);
        }
    }
}
