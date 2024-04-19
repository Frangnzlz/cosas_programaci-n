package colecciones.colecciones1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ej04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Introduce una palabra:");
			palabras.add(sc.nextLine());
		}
		System.out.println(palabras);
		
		Collections.sort(palabras);
		System.out.println(palabras);
		
	}
}
