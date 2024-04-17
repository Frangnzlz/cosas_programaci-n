package video;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

	public static void main(String[] args) {
		File folder = new File("folder");
		File file = new File("folder\\miPrimerArchivo.txt");
		
		try {
			boolean folderCreated = folder.mkdir();
			boolean fileCreated = file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Aprendiendo a manejar archivos");
			fileWriter.close();
			if(fileCreated && folderCreated) {
				System.out.println("El archivo se crea correctamente");
			} else {
				System.out.println("El archivo ya existe");
			}
		}
		catch (IOException e){
			System.out.println("Excepcion al crear el archivo " + e);
		}
	}

}
