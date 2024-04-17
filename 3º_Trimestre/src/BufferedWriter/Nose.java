package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		
		
		try {
			BufferedWriter writer = new BufferedWriter( new FileWriter("nose.txt",true));
			do {
				System.out.println("Introduce una linea de texto");
				line = sc.nextLine();
				writer.write(line);

				System.out.println("Quieres seguir añadiendo lineas? s/n");
				if(sc.nextLine().toLowerCase().charAt(0) == 'n') {
					break;
				}
				
				writer.newLine();
			} while (true);
			sc.close();
			writer.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
