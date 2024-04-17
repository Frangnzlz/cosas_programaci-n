package colecciones.colecciones1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random(); 
		String palabra = null;
		int aciertos = 0, fallos=0;
		int indice;
		ArrayList<Integer> indicesUsados = new ArrayList<>();
		
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("silla", "chair");
		diccionario.put("mesa", "table");
		diccionario.put("espejo", "mirror");
		diccionario.put("foto", "photo");
		diccionario.put("agua", "water");
		diccionario.put("chicle", "gum");
		diccionario.put("objeto", "object");
		diccionario.put("raton", "mouse");
		diccionario.put("fuego", "fire");
		
		ArrayList<String> palabrasEspanol = new ArrayList<>();
		palabrasEspanol.addAll(diccionario.keySet());
		
		do {
			
			indice = rn.nextInt(0, palabrasEspanol.size());
			
			if(!indicesUsados.contains(indice)) {
			
				indicesUsados.add(indice);
				System.out.println("Cual es esta palabra en ingles " + palabrasEspanol.get(indice));
				palabra = sc.nextLine().toLowerCase();
				
				if(diccionario.containsValue(palabra)) {
					aciertos++;
					System.out.println("Has acertado");
				}else {
					fallos++;
					System.out.println("Has fallado");
				}
			}
		} while ((aciertos+fallos) !=5);
		
		System.out.println("Has acertado: " + aciertos + "\nHas Fallado: " + fallos);
	
	}

}
