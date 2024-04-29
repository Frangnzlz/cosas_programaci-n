package coleccionesI;

/**
Ejercicio 15
Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si
algún producto se repite en diferentes líneas, se deben agrupar en una sola.
Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
el extracto se debe mostrar que se han pedido 4 botes de tomate. Después de
teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
el código “ECODTO”, se aplica un 10% de descuento en la compra.
Ejemplo:
Producto: tomate
Cantidad: 1
Producto: quinoa
Cantidad: 2
Producto: avena
Cantidad: 1
Producto: quinoa
Cantidad: 2
Producto: tomate
Cantidad: 2
Producto: fin
Introduzca código de descuento (INTRO si no tiene ninguno): ECODTO
Producto Precio Cantidad Subtotal
---------------------------------
tomate 1,59 3 4,77
quinoa 4,50 4 18,00
avena 2,21 1 2,21
---------------------------------
Descuento: 2,50
---------------------------------
TOTAL: 22,48
 */
        
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pedido = new HashMap<>();
        double total = 0;

        // Entrada de productos
        String producto;
        do {
            System.out.print("Producto: ");
            producto = scanner.nextLine();
            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(scanner.nextLine());
                //pedido.getOrDefault(producto, 0): obtiene el valor asociado a la clave producto en el mapa pedido. 
                //Si la clave no existe, devuelve 0 como valor por defecto.
                //Si el producto ya estaba en el pedido, se suma la cantidad nueva a la cantidad existente. 
                //Si el producto no estaba en el pedido, se crea una nueva entrada en el mapa con la cantidad proporcionada.          
                pedido.put(producto, pedido.getOrDefault(producto, 0) + cantidad);
            }
        } while (!producto.equals("fin"));

        // Aplicar descuento si es necesario
        double descuento = 0;
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigoDescuento = scanner.nextLine();
        if (codigoDescuento.equals("ECODTO")) {
            descuento = calcularDescuento(total);
        }

        // Calcular subtotal y mostrar extracto del pedido
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        for (Map.Entry<String, Integer> entry : pedido.entrySet()) {
            String productoActual = entry.getKey();
            int cantidad = entry.getValue();
            double precio = obtenerPrecioProducto(productoActual);
            double subtotalProducto = precio * cantidad;
            total += subtotalProducto;
            System.out.printf("%-8s %.2f %d %.2f%n", productoActual, precio, cantidad, subtotalProducto);
        }
        System.out.println("---------------------------------");
        System.out.printf("Descuento: %.2f%n", descuento);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f%n", total - descuento);
    }

    private static double obtenerPrecioProducto(String producto) {
        // Simulación de precios de productos
        Map<String, Double> precios = new HashMap<>();
        precios.put("tomate", 1.59);
        precios.put("quinoa", 4.50);
        precios.put("avena", 2.21);
        // Aquí se podrían añadir más productos y precios si es necesario
        return precios.getOrDefault(producto, 0.0);
    }

    private static double calcularDescuento(double total) {
        return total * 0.10;
    }
}
