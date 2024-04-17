package Fichero.Ejercicio117;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio117 {

	public static void main(String[] args) {
		
		File file = new File("textos\\margarita.txt");
		int num_caracteres = 0, num_palabras = 0, num_lineas = 0 ;
		String caracter_actual;
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			do {
				
				caracter_actual = (reader.read() != -1) ? (String.valueOf((char) reader.read())) : ("-1");
				if (caracter_actual != "-1") {
					num_caracteres++;

				} else {
					//break;
				}
				if(caracter_actual.equalsIgnoreCase(" ")) {
					num_palabras++;
				}
				if(caracter_actual.equalsIgnoreCase("\n")) {
					num_lineas++;
				}
			} while (caracter_actual != "-1");
			
			System.out.println("Numero de caracteres: "+ num_caracteres);
			System.out.println("Numero de palabras: "+ num_palabras);
			System.out.println("Numero de lineas: "+ num_lineas);
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
