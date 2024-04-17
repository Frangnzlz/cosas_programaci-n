package Fichero.Ejercicio117;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio117V2 {

	public static void main(String[] args) {
		File file = new File("textos\\margarita.txt");
		int num_caracteres = 0, num_palabras = 0, num_lineas = 0 ;
		String linea;
		ArrayList<String> palabras = new ArrayList<String>();
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while((linea = reader.readLine()) != null) {
				palabras.clear();
				num_caracteres += linea.length();
				num_lineas++;
				
				palabras.addAll(Arrays.asList(linea.split("\\s")));
				num_palabras += palabras.size();
			}
			reader.close();
			System.out.println("Numero de caracteres: "+ num_caracteres);
			System.out.println("Numero de palabras: "+ num_palabras);
			System.out.println("Numero de lineas: "+ num_lineas);
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
