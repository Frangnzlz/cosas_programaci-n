package Fichero.Ejercicio112;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio112 {

	public static void main(String[] args) {
		File file = new File("textos\\datos.txt");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			BufferedWriter writer  = new BufferedWriter( new FileWriter(file));
			System.out.print("Dime tu nombre");
			writer.write(sc.nextLine());
			
			writer.newLine();
			
			System.out.print("Dime tu edad");
			writer.write(sc.nextLine());
			
			System.out.println("Datos guardados en fichero de datos.txt");
			
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
