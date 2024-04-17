package FicheroImagenes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarBytes {

	public static void main(String[] args) {
		int contador = 0;
		int datosEntrada[] = new int [22203];
			
		try {
			FileInputStream archivoLectura = new FileInputStream("Imagenes\\hola.png");
			
			while(true) {
				int byteEntrada = archivoLectura.read();
				
				if(byteEntrada != -1) 
					datosEntrada[contador] = byteEntrada;
				else 
					break;
				
				System.out.println(datosEntrada[contador]);
				contador++;
			}			
			archivoLectura.close();
			
			crearFichero(datosEntrada);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void crearFichero(int datorNuevoFichero[]) throws IOException{
		
		FileOutputStream archivoEscritura = new FileOutputStream("Imagenes\\holaCopia3.png");
		
		for (int i = 0; i < datorNuevoFichero.length; i++) {
			archivoEscritura.write(datorNuevoFichero[i]);
		}
		archivoEscritura.close();

	}
}
