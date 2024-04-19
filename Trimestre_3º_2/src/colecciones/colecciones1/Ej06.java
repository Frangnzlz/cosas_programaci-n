package colecciones.colecciones1;

import java.util.HashMap;
import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		HashMap<String,String> listado = new HashMap<>();
		int contadorIntentos = 0;
		
		listado.put("1", "a");
		listado.put("2", "b");
		listado.put("3", "c");
		listado.put("4", "d");
		listado.put("5", "e");
		listado.put("6", "f");
		listado.put("7", "g");
		listado.put("8", "h");
		listado.put("9", "i");
		listado.put("0", "o");
		
		do {
			
			if(comprobarEntrada(listado)) {
				break;
			}else {
				contadorIntentos++;
			}
			
			if(contadorIntentos==3){
				System.out.println("Lo siento no tiene permiso para la zona restringida");
			}
		}while(contadorIntentos <3);
		
		
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
