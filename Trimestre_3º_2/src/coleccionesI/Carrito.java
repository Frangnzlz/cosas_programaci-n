package coleccionesI;

import java.util.ArrayList;
import java.util.List;

// Clase para representar un carrito de compras /*Ejercicio17*/
class Carrito {
    private List<Producto> productos;

    // Constructor
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    /* Método para agregar un producto al carrito EJERCICIO 17
    public void agrega(Producto producto) {
        productos.add(producto);
    }
    */
    
    // Método agregar mejorado para agregar un producto al carrito EJERCICIO 18
    // Al agregar un nuevo Producto al carrito, se compruebe si ya existe el producto
    // en tal caso, se incrementa el número de unidades sin añadir un nuevo
    public void agregar(Producto producto) {
        boolean existe = false;
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre())) {
                p.aumentarCantidad(producto.getCantidad());
                existe = true;
                break;
            }
        }
        if (!existe) {
            productos.add(producto);
        }
    }
    // Método para calcular el importe total del carrito
    public double importeTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioTotal();
        }
        return total;
    }
    // Método para obtener el número de productos en el carrito
    public int numeroDeProductos() {
        return productos.size();
    }

    // Método para obtener una representación en cadena del carrito
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contenido del carrito\n");
        sb.append("=====================\n");
        for (Producto producto : productos) {
            sb.append(producto.toString()).append("\n");
        }
        return sb.toString();
    }
}