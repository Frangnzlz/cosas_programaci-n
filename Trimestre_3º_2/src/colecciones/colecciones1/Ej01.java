package colecciones.colecciones1;

import java.util.ArrayList;

public class Ej01 {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("a");
		nombres.add("b");
		nombres.add("c");
		nombres.add("d");
		nombres.add("e");
		nombres.add("f");
		
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
	}

}
