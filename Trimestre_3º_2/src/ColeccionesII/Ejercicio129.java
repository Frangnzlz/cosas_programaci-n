/*129.- Crea un programa que vaya solicitando nombres de diferentes alumnos 
junto con su nota media del curso hasta que el nombre sea igual a “fin” 
(minúsculas). 
Almacena todos esos datos en una estructura tipo diccionario y muestra cada 
alumno con su nota en una línea. 
A continuación, sube un punto la nota de aquellos alumnos cuyo nombre 
empiecen por ‘J’ y borra aquellos cuyo nombre empiecen ‘A’ o por ‘D’ 
Para finalizar, si la estructura no está vacía, muestra solo las notas y la media de 
todas ellas. 
*/
package ColeccionesII;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> alumnos = new HashMap<>();
        
        // Solicitar nombres y notas hasta que se ingrese "fin"
        while (true) {
            System.out.print("Ingrese el nombre del alumno (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("fin")) {
                break;
            }
            
            System.out.print("Ingrese la nota media del alumno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            
            alumnos.put(nombre, nota);
        }
        
        // Mostrar cada alumno con su nota
        System.out.println("Alumnos:");
        for (String nombre : alumnos.keySet()) {
            System.out.println(nombre + ": " + alumnos.get(nombre));
        }
        
        // Aumentar la nota de los alumnos cuyo nombre comience por 'J'
        for (String nombre : alumnos.keySet()) {
            if (nombre.startsWith("J")) {
                alumnos.put(nombre, alumnos.get(nombre) + 1.0);
            }
        }
        
        // Eliminar los alumnos cuyo nombre comience por 'A' o 'D'
        alumnos.keySet().removeIf(nombre -> nombre.startsWith("A") || nombre.startsWith("D"));
        
        // Mostrar las notas y la media si la estructura no está vacía
        if (!alumnos.isEmpty()) {
            double sumaNotas = 0;
            for (double nota : alumnos.values()) {
                sumaNotas += nota;
            }
            double media = sumaNotas / alumnos.size();
            
            System.out.println("Notas de los alumnos:");
            for (String nombre : alumnos.keySet()) {
                System.out.println(nombre + ": " + alumnos.get(nombre));
            }
            System.out.println("Media de las notas: " + media);
        } else {
            System.out.println("No hay alumnos en la estructura.");
        }
        
        scanner.close();
    }
}
