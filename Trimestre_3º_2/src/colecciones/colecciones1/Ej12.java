package colecciones.colecciones1;

import clases.Carta;
import clases.Baraja;
import java.util.HashMap;
import java.util.ArrayList;

public class Ej12 {
	
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		HashMap<Integer, Integer> valores = new HashMap<Integer, Integer>();
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		valores.put(1, 11);
		valores.put(3, 10);
		valores.put(10, 2);
		valores.put(11, 3);
		valores.put(12, 4);
		
		
		baraja.barajar();
		
		cartas.addAll(baraja.darCartas(5));
		
		System.out.println("Tienes " + contarPuntos(cartas,valores) + " puntos");
		
	}
	
	public static Integer contarPuntos(ArrayList<Carta> cartas, HashMap<Integer,Integer> valores) {
		Integer puntos = 0;
		
		for(Carta carta : cartas) {
			
			if(valores.containsKey(carta.getNumero())) {
				puntos += valores.get(carta.getNumero());
			}
		}
		
		return puntos;
	}
	
}
