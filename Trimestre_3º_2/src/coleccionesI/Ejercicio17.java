package coleccionesI;

/*** Ejercicio 17
Una empresa de venta por internet de productos electrónicos nos ha encargado
implementar un carrito de la compra. Crea la clase Carrito. Al carrito se le
pueden ir agregando elementos que se guardarán en una lista, por tanto,
deberás crear la clase Elemento. Cada elemento del carrito deberá contener el
nombre del producto, su precio y la cantidad (número de unidades de dicho
producto). A continuación se muestra tanto el contenido del programa principal
como la salida que debe mostrar el programa. Los métodos a implementar se
pueden deducir del main.
Contenido del main:
    Carrito miCarrito = new Carrito();
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
    miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
    System.out.println(miCarrito);
    
    System.out.print("Hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a "
    + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    
    System.out.println("\nContinúa la compra...\n");
    miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
    System.out.println(miCarrito);
    System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a "
    + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    
    * Salida:
    
    Contenido del carrito
    =====================
    Tarjeta SD 64Gb PVP: 19,95 Unidades: 2 Subtotal: 39,90
    Canon EOS 2000D PVP: 449,00 Unidades: 1 Subtotal: 449,00
    Hay 2 productos en la cesta.
    El total asciende a 488,90 euros
    Continúa la compra...
    Contenido del carrito
    =====================
    Tarjeta SD 64Gb PVP: 19,95 Unidades: 2 Subtotal: 39,90
    Canon EOS 2000D PVP: 449,00 Unidades: 1 Subtotal: 449,00
    Samsung Galaxy Tab PVP: 199,00 Unidades: 3 Subtotal: 597,00
    Tarjeta SD 64Gb PVP: 19,95 Unidades: 1 Subtotal: 19,95
    Ahora hay 4 productos en la cesta.
    El total asciende a 1105,85 euros
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        // Crear un nuevo carrito
        Carrito miCarrito = new Carrito();

        // Agregar productos al carrito
        miCarrito.agregar(new Producto("Tarjeta SD 64Gb", 19.95, 2));
        miCarrito.agregar(new Producto("Canon EOS 2000D", 449, 1));

        // Mostrar el contenido del carrito y el total
        System.out.println(miCarrito);
        System.out.println("Hay " + miCarrito.numeroDeProductos() + " productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros\n");

        // Continuar la compra
        System.out.println("Continúa la compra...\n");
        miCarrito.agregar(new Producto("Samsung Galaxy Tab", 199, 3));
        miCarrito.agregar(new Producto("Tarjeta SD 64Gb", 19.95, 1));

        // Mostrar el contenido del carrito actualizado y el total
        System.out.println(miCarrito);
        System.out.println("Ahora hay " + miCarrito.numeroDeProductos() + " productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    }
}
