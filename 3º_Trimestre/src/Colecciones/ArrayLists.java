package Colecciones;


import java.util.List;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona(1, "a", 20));
		lista.add(new Persona(2, "b", 20));
		lista.add(new Persona(3, "c", 20));
		lista.add(new Persona(4, "d", 20));
		lista.add(new Persona(5, "e", 20));
		
		System.out.println("-------------FOR---------");
		
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("prueba: " + lista.get(i).getNombre());
		}
		
		for (Persona persona : lista) {
			System.out.println("prueba: " + persona.getNombre() );
		}
	}

}
