package colecciones.colecciones1;

import java.util.HashMap;
import java.util.Scanner;

public class Ej16 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> diccionario = new HashMap<String,String>();
		String pais;
		String capital;
		
		diccionario.put("España", "Madrid");
		diccionario.put("Portugal", "Lisboa");
		diccionario.put("Francia", "Paris");
		
		
		do {
				System.out.print("Escribe el nombre de un pais y te dire su capital: ");
				pais = sc.nextLine();
				
				if(!diccionario.containsKey(pais) && !pais.equalsIgnoreCase("salir")) {
					
					System.out.print("No conozla respuesta ¿Cuál es la capital de " + pais +"? ");
					capital = sc.nextLine();
					
					diccionario.put(pais, capital);
					
				}else if(diccionario.containsKey(pais)){
					System.out.println("La capital de " + pais + " es " + diccionario.get(pais));
				}
		}while (!pais.equalsIgnoreCase("salir"));
		
		
		
	}
}
