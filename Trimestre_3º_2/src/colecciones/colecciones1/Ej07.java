package colecciones.colecciones1;

import clases.Moneda;
import java.util.Random;
import java.util.ArrayList;


public class Ej07 {

	public static void main(String[] args) {

		ArrayList<Moneda> monedas = new ArrayList<>();
		
		for(int i = 0; i < 6 ; i++) {
			generarMoneda(monedas);
		}
		
		for(Moneda mon : monedas) {
			System.out.println(mon);
		}
	}
	
	public static void generarMoneda(ArrayList<Moneda> moneda) {
		Random sc = new Random();
		moneda.add(new Moneda(sc.nextInt(8), sc.nextBoolean()));
	}
	

}
