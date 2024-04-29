package coleccionesI;
/*Ejercicio 14
Un supermercado de productos ecológicos nos ha pedido hacer un programa
para vender su mercancía. En esta primera versión del programa se tendrán
en cuenta los productos que se indican en la tabla junto con su precio. Los
productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
indicar el producto y el número de unidades que se compran, por ejemplo
“guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
“fin. Suponemos que el usuario no va a intentar comprar un producto que
no existe. Utiliza un diccionario para almacenar los nombres y precios de los
productos y una o varias listas para almacenar la compra que realiza el usuario.
A continuación se muestra una tabla con los productos disponibles y sus
respectivos precios:
avena garbanzos tomate jengibre quinoa guisantes
2,21 2,39 1,59 3,13 4,50 1,60
Ejemplo:
Producto: tomate
Cantidad: 1
Producto: quinoa
Cantidad: 2
Producto: avena
Cantidad: 1
Producto: tomate
Cantidad: 2
Producto: fin
Producto Precio Cantidad Subtotal
---------------------------------
tomate 1,59 1 1,59
quinoa 4,50 2 9,00
avena 2,21 1 2,21
tomate 1,59 2 3,18
---------------------------------
TOTAL: 15,98
*/
import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Crear el diccionario de productos y precios
        Map<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        // Crear la lista para almacenar la compra del usuario
        List<Compra> compras = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que realice la compra
        System.out.println("Realiza tu compra. Ingresa 'fin' para terminar.");
        while (true) {
            System.out.print("Producto: ");
            String producto = scanner.nextLine();
            if (producto.equals("fin")) {
                break;
            }
            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Verificar si el producto existe en el diccionario
            if (productos.containsKey(producto)) {
                double precio = productos.get(producto);
                compras.add(new Compra(producto, precio, cantidad));
            } else {
                System.out.println("El producto ingresado no existe.");
            }
        }

        // Imprimir la factura
        System.out.println("Producto\tPrecio\tCantidad\tSubtotal");
        System.out.println("-------------------------------------------");
        double total = 0.0;
        for (Compra compra : compras) {
            System.out.printf("%s\t\t%.2f\t%d\t\t%.2f\n", compra.getProducto(), compra.getPrecio(), compra.getCantidad(), compra.getSubtotal());
            total += compra.getSubtotal();
        }
        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL:\t\t\t\t\t%.2f\n", total);
    }
}