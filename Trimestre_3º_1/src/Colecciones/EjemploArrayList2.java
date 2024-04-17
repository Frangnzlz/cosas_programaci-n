package Colecciones;

import java.util.ArrayList;

public class EjemploArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<String>(); 
 
		color.add("blanco");
		color.add("negro");
		color.add("rojo");
		color.add("amarillo");
		color.add("verde");
		color.add("azul");
		
		System.out.println(color);
		color.removeIf(palabra-> palabra.contains("a"));
		System.out.println(color);
		
		
	}
}
