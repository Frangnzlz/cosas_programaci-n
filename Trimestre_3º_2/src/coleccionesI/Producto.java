package coleccionesI;

// Clase para representar un producto del carrito Ejercicio 17
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para obtener el subtotal del producto
    public double getPrecioTotal() {
        return precio * cantidad;
    }
    
    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    // Método para obtener una representación en cadena del producto
   @Override
    public String toString() {
        return nombre + " PVP: " + String.format("%.2f", precio) + " Unidades: " + cantidad + " Subtotal: " + String.format("%.2f", getPrecioTotal());
    }
}