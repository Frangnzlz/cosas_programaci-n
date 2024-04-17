package FicheroImagenes;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaEscritura {

	public static void main(String[] args) {
		
		try {
			FileInputStream archivoLectura = new FileInputStream("Imagenes\\hola.png");
			boolean finalAr=false;
			int cont = 0;
			while(!finalAr) {
				int byteEntrada = archivoLectura.read();
				
				if(byteEntrada==-1) {
					finalAr=true;
					cont--;
				}
				System.out.println(byteEntrada);
				cont++;
			}
			System.out.println(cont);
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
