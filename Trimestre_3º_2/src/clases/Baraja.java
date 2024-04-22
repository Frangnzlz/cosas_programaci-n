package clases;

import java.util.ArrayList;

public class Baraja {
	private Carta carta[] ;
	private Carta usadas[];
	private static int utilizadas;
	
	public Baraja() {
		carta = new Carta[48];
		usadas = new Carta[48];
		
		for (int j2 = 1, i = 0; j2 < 13; j2++) {
			for (int j = 0; j < 4; j++, i++) {
				switch (j) {
					case 0:
						carta[i] = new Carta(j2,"Basto", 3);
						break;
					case 1:
						carta[i] = new Carta(j2, "Copa", 1);
						break;
					case 2:
						carta[i] = new Carta(j2,"Espada", 4);
						break;
					case 3:
						carta[i] = new Carta(j2,"Oros",2);
						break;
				}
			}
		}
	}
	public int tamañoBaraja(){
		return carta.length;
	}
	
	public int cartasDisponibles() {
		int contador = 0;
		for (int i = 0; i < carta.length; i++) {
			if(carta[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	public Carta siguienteCarta() {
		if(carta[utilizadas] != null) {
			usadas[utilizadas] = carta[utilizadas];
			carta[utilizadas] = null;

			if(utilizadas < carta.length-1) {
				utilizadas++;
			}
			return usadas[utilizadas-1];
		}else {
			System.out.println("No quedan cartas disponibles");
			return null;
		}
	}
	public ArrayList<Carta> darCartas(int num) {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		if(cartasDisponibles() > num) {
			for (; num>0 ; num-- , utilizadas++) {
				System.out.println(carta[utilizadas]);
				usadas[utilizadas] = carta[utilizadas];
				cartas.add(carta[utilizadas]);
				carta[utilizadas] = null;
				
			}
		}else {
			System.out.println("No puedes repartir mas cartas de las que dispones");
		}
		return cartas;
	}
	
	public void reiniciar() {
		for (int i = 0; i < utilizadas; i++) {
			carta[i] = usadas[i];
			usadas[i] = null;
			
		}
		utilizadas = 0;

	}
	
	public void barajar() {
		for(int i = carta.length - 1; i > 0; i--) {
		      // calculamos un índice aleatorio dentro del rango permitido
		      int shuffled_index = (int)Math.floor(Math.random() * (i + 1));
		      //guardamos el elemento que estamos iterando
		      Carta tmp = carta[i];
		      // asignamos el elemento aleatorio al índice iterado
		      carta[i] = carta[shuffled_index];
		      // asignamos el elemento iterado al índice aleatorio
		      carta[shuffled_index] = tmp;
		    }
	}
	
	public void mostrar() {
		for (int i = 0; i < carta.length;) {
			for (int j = 0; j < 4; j++, i++) {
				System.out.print(carta[i]);
			}
			System.out.println();
		}
	}
	
	public void cartasUsadas() {
		for (int i = 0; i < utilizadas;) {
			for (int j = 0; j < 4; j++, i++) {
				System.out.print(usadas[i]);
			}
			System.out.println();
		}
	}
	
}
