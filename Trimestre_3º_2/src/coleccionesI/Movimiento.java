
package coleccionesI;

//Ejercicio22
class Movimiento {
    private String tipo;
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String toString() {
        return tipo + " de " + cantidad + " €";
    }
}