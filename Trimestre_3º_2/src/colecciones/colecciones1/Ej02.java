package colecciones.colecciones1;

import java.util.Random;
import java.util.ArrayList;

public class Ej02 {

	public static void main(String[] args) {
		Random rn = new Random();
		ArrayList<Integer> numero = new ArrayList<>();
		int media = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for(int i = rn.nextInt(10,21); i>0;i--){
			numero.add(rn.nextInt(100));
		}
		
		for (int i = 0; i < numero.size(); i++) {
			if(numero.get(i)<min) {
				min = numero.get(i);
			}
			if(numero.get(i)>max) {
				max = numero.get(i);
			}
			media += numero.get(i);
		}
		
		media/=numero.size();
		System.out.println("Media:" + media + "\nmax: "  + max + "\nmin: " + min);
	
	}

}
