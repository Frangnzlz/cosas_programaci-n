
/* 125.- Crea un programa que, haciendo uso de un ArrayList de números enteros, 
muestre por pantalla un menú con las siguientes opciones: 
1. Agregar: se le pide al usuario que indique un número entero por teclado 
y mete ese número dentro de la estructura. 
2. Buscar: se le pide al usuario un número entero e indica si ese número se 
encuentra en la estructura o no. 
3. Eliminar:  se le pide al usuario un número entero y, si el elemento está en 
la estructura, lo elimina (y lo indica por pantalla). Si el elemento no está 
en la estructura, saca un mensaje indicándolo. 
4. Modificar:  se le pide al usuario un número entero y, si el elemento está 
en la estructura, se solicita otro número para cambiarlo. Si el elemento no 
está en la estructura, saca un mensaje indicándolo. 
5. Insertar en posición:  se le pide al usuario un número entero y una 
posición (entero mayor a 0). Mete el número en la posición indicada de la 
estructura. 
6. Mostrar: muestra el contenido de la estructura. 
7. Salir: Sale del programa y muestra un mensaje de despedida.
*/
package ColeccionesII;
        
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio125 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Modificar");
            System.out.println("5. Insertar en posición");
            System.out.println("6. Mostrar");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    int numeroAgregar = scanner.nextInt();
                    numeros.add(numeroAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el número a buscar: ");
                    int numeroBuscar = scanner.nextInt();
                    if (numeros.contains(numeroBuscar)) {
                        System.out.println("El número está en la estructura.");
                    } else {
                        System.out.println("El número no está en la estructura.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número a eliminar: ");
                    int numeroEliminar = scanner.nextInt();
                    if (numeros.remove(Integer.valueOf(numeroEliminar))) {
                        System.out.println("El número ha sido eliminado.");
                    } else {
                        System.out.println("El número no está en la estructura.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el número a modificar: ");
                    int numeroModificar = scanner.nextInt();
                    if (numeros.contains(numeroModificar)) {
                        System.out.print("Ingrese el nuevo número: ");
                        int nuevoNumero = scanner.nextInt();
                        int index = numeros.indexOf(numeroModificar);
                        numeros.set(index, nuevoNumero);
                        System.out.println("El número ha sido modificado.");
                    } else {
                        System.out.println("El número no está en la estructura.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el número a insertar: ");
                    int numeroInsertar = scanner.nextInt();
                    System.out.print("Ingrese la posición donde insertar (entero mayor a 0): ");
                    int posicion = scanner.nextInt();
                    numeros.add(posicion - 1, numeroInsertar);
                    System.out.println("El número ha sido insertado en la posición " + posicion);
                    break;
                case 6:
                    System.out.println("Contenido de la estructura:");
                    for (Integer num : numeros) {
                        System.out.println(num);
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
