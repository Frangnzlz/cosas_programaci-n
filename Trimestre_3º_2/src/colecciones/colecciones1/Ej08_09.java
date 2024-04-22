package colecciones.colecciones1;

import java.util.ArrayList;
import java.util.Collections;
import clases.Carta;
import clases.Baraja;

public class Ej08_09 {
	public static void main(String[] args) {
		ArrayList<Carta> carta = new ArrayList<Carta>();
		Baraja baraja = new Baraja();
		
		baraja.barajar();
		
		for(int i = 0; i<10;i++) {
			carta.add(baraja.siguienteCarta());
		}
		

		
		
		System.out.println(carta);
		
		Collections.sort(carta);
		
		System.out.println(carta);
	}
}
