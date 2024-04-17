package Fichero.Ejercicio114;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File folder = new File("textos");
		
		System.out.println(Arrays.toString(folder.list()));
		System.out.print("Escriba el nombre del fichero: ");
		String direccion = "textos\\" + sc.nextLine();
		int numLinea =0;
		
		File file = new File(direccion);
		
		

		System.out.println("Abriendo "+file.getName());
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while((line = bufferedReader.readLine() )!= null) {
				numLinea++;
				System.out.println(numLinea + ": "+line);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
