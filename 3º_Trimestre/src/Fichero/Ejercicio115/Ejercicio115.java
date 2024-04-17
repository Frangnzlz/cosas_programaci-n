package Fichero.Ejercicio115;

import java.io.*;

public class Ejercicio115 {

	public static void main(String[] args) {
		File file = new File("textos\\numeros.txt");
		int numMayor = Integer.MIN_VALUE ;
		int numMenor = Integer.MAX_VALUE;
		int contMayor = 0;
		int contMenor = 0; 
		int numero;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			
			while((line = reader.readLine() )!= null) {
				numero = Integer.parseInt(line);
				if (numero > numMayor) {
					numMayor = numero;
					contMayor = 1;
				}else if(numero == numMayor) {
					contMayor++;
				}
				if (numero < numMenor) {
					numMenor = numero;
					contMenor = 1;
				}else if(numero == numMenor) {
					contMenor++;
				}
					
			}
			reader.close();

			System.out.println("El mayor numero es " + numMayor + " y sale " + contMayor);
			
			System.out.println("El menor numero es " + numMenor + " y sale " + contMenor);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

}
