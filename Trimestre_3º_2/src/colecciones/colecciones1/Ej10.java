package colecciones.colecciones1;

import java.util.HashMap;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = null;
		
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
		
		
		System.out.println("Por favor, introduzca una palabra");
		palabra = sc.nextLine().toLowerCase();
		
		if(diccionario.containsKey(palabra)) {
			System.out.println(diccionario.get(palabra));
		}else {
			System.out.println("No hay registro de esa palabra");
		}
		
	}

}
