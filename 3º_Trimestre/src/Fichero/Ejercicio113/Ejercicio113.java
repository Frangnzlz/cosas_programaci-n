package Fichero.Ejercicio113;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio113 {

	public static void main(String[] args) {
		File file = new File("textos\\EJ113.txt");
		String linea = null;
		Scanner sc = new Scanner(System.in);
		try {
			//Condicional que comprueba si se ha creado el archivo
			if(file.createNewFile()) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				//Bucle do while para introducir las lineas que decidimos
				do {

					//Metodo para introducir un archivo
					System.out.println("Introduce una frase para Introducir en el archivo");
					linea = sc.nextLine();
					writer.write(linea);
					writer.newLine();

					
				} while (!linea.isEmpty());
				writer.close();
			}else {
				System.out.println("El archivo ya existe");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Fin del programa");
			sc.close();
		}
		
		
	
	}
	

}
