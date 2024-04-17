package colecciones.colecciones1;

import java.util.HashMap;
import java.util.Scanner;


public class Ej15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //Diccionario de productos con los precios
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("guisantes", 2.5);
        productos.put("zanahorias", 1.75);
        productos.put("tomates", 3.0);
        productos.put("lechuga", 2.0);
        productos.put("manzanas", 1.5);



        // Mapa para almacenar la compra agrupada
        HashMap<String, Integer> compraAgrupada = new HashMap<>();
        
        
        boolean salir=true;

        while (salir) {
            System.out.print("Ingresa el nombre del producto (o 'fin' para terminar la compra): ");
            String productoInput = scanner.nextLine().toLowerCase();
            if (productoInput.equals("fin")) {
                salir=false;
            }
            if (productos.containsKey(productoInput)) {
                try {
                    System.out.print("Ingresa la cantidad de '" + productoInput + "': ");
                    int cantidad = Integer.parseInt(scanner.nextLine());
                    if (cantidad > 0) {
                        // Agrupar productos si ya existen en la compra
                        if (compraAgrupada.containsKey(productoInput)) {
                            cantidad += compraAgrupada.get(productoInput);
                        }
                        compraAgrupada.put(productoInput, cantidad);
                    } else {
                        System.out.println("La cantidad debe ser mayor que cero.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa un número válido para la cantidad.");
                }
            } else {
                System.out.println("El producto no existe en nuestra lista.");
            }
        }

        // Calcular el total de la compra
        double totalCompra = 0;
        System.out.println("\nResumen de la compra:");
        for (HashMap.Entry<String, Integer> item : compraAgrupada.entrySet()) {
            String producto = item.getKey();
            int cantidad = item.getValue();
            double precioUnitario = productos.get(producto);
            double totalProducto = precioUnitario * cantidad;
            System.out.printf("%s: %d unidades - $%.2f%n", producto, cantidad, totalProducto);
            totalCompra += totalProducto;
        }

        // Aplicar descuento si se ingresa el código "ECODTO"
        System.out.print("\nIngresa el código de descuento (o deja en blanco si no tienes): ");
        String codigoDescuento = scanner.nextLine().toUpperCase();
        if (codigoDescuento.equals("ECODTO")) {
            double descuento = totalCompra * 0.1;
            totalCompra -= descuento;
            System.out.printf("Descuento aplicado: $%.2f%n", descuento);
        }

        System.out.printf("%nTotal de la compra: $%.2f%n", totalCompra);


    }
}




