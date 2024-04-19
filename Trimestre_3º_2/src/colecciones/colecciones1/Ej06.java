package colecciones.colecciones1;

import java.util.HashMap;
import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		HashMap<String,String> listado = new HashMap<>();
		
		
		
		
	}

	public static boolean comprobarEntrada(HashMap<String,String> usuario) {
		Scanner sc = new Scanner(System.in);
		String nomUsuario, contUsuario;
		
		System.out.println("Introduce su usuraio");
		nomUsuario = sc.nextLine();
		
		if(usuario.containsKey(nomUsuario)) {
			System.out.println("Introduce su contraseña ");
			contUsuario = sc.nextLine();
			
			if(contUsuario.equals(usuario.get(nomUsuario))){
				System.out.println("Ha accedido al área restringida");
				return true;
			}else {
				System.out.println("Contraseña equivocada");
				return false;
			}
		}else {
			System.out.println("El usuario no existe");
			
			return false;
			
		}
		
		
	}
	
	
}
