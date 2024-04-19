package colecciones.colecciones1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i <10;i++) {
			System.out.print("Introduce un numero por teclado:");
			num.add(sc.nextInt());
		}
		System.out.println(num);
		
		Collections.sort(num);
		
		System.out.println(num);
	}

}
