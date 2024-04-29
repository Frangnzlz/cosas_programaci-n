package coleccionesI;

// Clase Pieza Ejercicio23
class Pieza {
    private String nombre;
    private int valorEnPeones;

    public Pieza(String nombre, int valorEnPeones) {
        this.nombre = nombre;
        this.valorEnPeones = valorEnPeones;
    }

    public int getValorEnPeones() {
        return valorEnPeones;
    }

    public String toString() {
        return nombre + " (" + valorEnPeones + " peones)";
    }
}