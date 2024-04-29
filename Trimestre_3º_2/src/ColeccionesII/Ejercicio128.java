/* 128.- La empresa MEDAC te ha elegido para crear un programa que se encargue 
de registrar los sueldos de los hombres y las mujeres que trabajan allí, con el fin 
de detectar si existe brecha salarial entre ambos. 
Para ello, el programa pedirá primero el número total de trabajadores de la 
empresa por teclado (N) y, posteriormente, solicitará información de cada 
persona de la siguiente forma: 
• pedirá su género (0 para varón y 1 para mujer) 
• pedirá su sueldo anual en euros. 
Esta información debe guardarse en un diccionario. Finalmente, el programa 
mostrará por pantalla el sueldo medio de cada género.
*/
package ColeccionesII;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> sueldos = new HashMap<>();
        
        System.out.print("Ingrese el número total de trabajadores de la empresa: ");
        int totalTrabajadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        for (int i = 0; i < totalTrabajadores; i++) {
            System.out.println("Ingrese los datos del trabajador " + (i + 1) + ":");
            System.out.print("Género (0 para varón, 1 para mujer): ");
            int genero = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            
            System.out.print("Sueldo anual en euros: ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            
            String generoStr = (genero == 0) ? "Hombre" : "Mujer";
            sueldos.put(generoStr, sueldos.getOrDefault(generoStr, 0.0) + sueldo);
        }
        
        double sueldoHombres = sueldos.getOrDefault("Hombre", 0.0);
        double sueldoMujeres = sueldos.getOrDefault("Mujer", 0.0);
        
        System.out.println("Sueldo promedio de hombres: " + (sueldoHombres / totalTrabajadores));
        System.out.println("Sueldo promedio de mujeres: " + (sueldoMujeres / totalTrabajadores));
        
        if (sueldoHombres > sueldoMujeres) {
            System.out.println("Existe brecha salarial a favor de los hombres.");
        } else if (sueldoHombres < sueldoMujeres) {
            System.out.println("Existe brecha salarial a favor de las mujeres.");
        } else {
            System.out.println("No existe brecha salarial entre hombres y mujeres.");
        }
        
        scanner.close();
    }
}

