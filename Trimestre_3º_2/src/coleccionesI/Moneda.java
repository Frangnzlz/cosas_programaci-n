
package coleccionesI;

/// Clase para representar una moneda del Ejercicio7
class Moneda {
    private String valor; // Valor de la moneda (en céntimos)
    private String posicion; // Posición de la moneda (cara o cruz)

    // Constructor
    public Moneda(String valor, String posicion) {
        this.valor = valor;
        this.posicion = posicion;
    }

    // Método para obtener la representación de la moneda como cadena de texto
    public String toString() {
        return valor + " céntimos - " + posicion;
    }
}
