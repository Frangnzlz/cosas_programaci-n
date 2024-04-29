package coleccionesI;

/** Ejercicio 18
Mejora el programa anterior (en otro proyecto diferente) de tal forma que al
intentar agregar un elemento al carrito, se compruebe si ya existe el producto
y, en tal caso, se incremente el número de unidades sin añadir un nuevo
elemento. Observa que en el programa anterior, se repetía el producto “Tarjeta
SD 64Gb” dos veces en el carrito. En esta nueva versión ya no sucede esto, si
no que se incrementa el número de unidades del producto que se agrega.
El contenido del main es idéntico al ejercicio anterior.
Salida:
Colecciones y diccionarios 235
Contenido del carrito
=====================
Tarjeta SD 64Gb PVP: 19,95 Unidades: 2 Subtotal: 39,90
Canon EOS 2000D PVP: 449,00 Unidades: 1 Subtotal: 449,00
Hay 2 productos en la cesta.
El total asciende a 488,90 euros
Continúa la compra...
Contenido del carrito
=====================
Tarjeta SD 64Gb PVP: 19,95 Unidades: 3 Subtotal: 59,85
Canon EOS 2000D PVP: 449,00 Unidades: 1 Subtotal: 449,00
Samsung Galaxy Tab PVP: 199,00 Unidades: 3 Subtotal: 597,00
Ahora hay 3 productos en la cesta.
El total asciende a 1105,85 euros
 */
public class Ejercicio18 {

        public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        miCarrito.agregar(new Producto("Tarjeta SD 64Gb", 19.95, 2));
        miCarrito.agregar(new Producto("Canon EOS 2000D", 449, 1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeProductos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");

        System.out.println("\nContinúa la compra...\n");

        miCarrito.agregar(new Producto("Samsung Galaxy Tab", 199, 3));
        miCarrito.agregar(new Producto("Tarjeta SD 64Gb", 19.95, 1));
        System.out.println(miCarrito);
        System.out.print("Ahora hay " + miCarrito.numeroDeProductos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    }
}
