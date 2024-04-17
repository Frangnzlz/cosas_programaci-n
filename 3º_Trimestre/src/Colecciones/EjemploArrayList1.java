package Colecciones;

import java.util.ArrayList;

public class EjemploArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(1);
		lista.add(3);
		lista.add(-5);
		lista.add(5);
		lista.add(6);
		
		System.out.println("Nº de elementos: " + lista.size() );
		
		
		System.out.println("El elemento que hay en la posicion 1 es "  + lista.get(1));
	}

}
