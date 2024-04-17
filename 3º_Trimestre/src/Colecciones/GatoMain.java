package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class GatoMain {

	public static void main(String[] args) {
		ArrayList<Gato> g = new ArrayList<Gato>();
		
		g.add(new Gato("dgarfield" , "naranja" , "mestizo"));
		g.add(new Gato("epepe" , "gris" , "angora"));
		g.add(new Gato("wmauri" , "blanco" , "manx"));
		g.add(new Gato("aulises" , "marron" , "persa"));
		
		
		
		
		
		Collections.sort(g);
		
		System.out.println("Datos de los gatos");
		
		for (Gato gato : g) {
			System.out.println(gato);
		}
	}

}
