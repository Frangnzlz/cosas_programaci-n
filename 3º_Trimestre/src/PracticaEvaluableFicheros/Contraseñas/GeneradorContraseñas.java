package PracticaEvaluableFicheros.Contraseñas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.security.SecureRandom;

public class GeneradorContraseñas {
	
	public static void main(String [] args) {
		
		
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\cosas\\Programacion_3_trimestre\\textosPractica\\contraseñas.txt"));
			
			SecureRandom sr = new SecureRandom();
			
			for(int i = 0; i <= 10; i++) {
				for (int j = 0; j <10; j++) {
					writer.write(sr.nextInt());
				}
				writer.newLine();
				
			}
			writer.close();
			
		} catch (IOException e) {
			System.out.println("El programa ha fallado " + e.getMessage() );
		}
		
	}
}
