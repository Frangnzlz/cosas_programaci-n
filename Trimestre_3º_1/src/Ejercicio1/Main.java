package Ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ruta;
		
		File fichero;
		
		System.out.println("Introduce la ruta del fichero");
			
		ruta = sc.nextLine();
		sc.close();
		fichero = new File (ruta);
		fichero.setReadable(false);
		fichero.setWritable(false);

		if(fichero.exists() && !fichero.isDirectory()) {
			System.out.println("Nombre" + fichero.getName());
			
			System.out.println("Tamaño" + fichero.length());
			
			System.out.println("¿Tiene permisos de lectura? " + (fichero.canRead() ? "Sí" : "No"));
			
			System.out.println("¿Tiene permisos de escritura? " + (fichero.canWrite() ? "Sí" : "No"));
		
		} else if (fichero.isDirectory()){
			System.out.println("Es un directorio");
		}
		else {
			System.out.println("No existe esa dirección de ruta");
		}
	}
}
