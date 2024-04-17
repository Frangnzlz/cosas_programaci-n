package video;

import java.io.File;

public class Archivos3 {
	
	public static void main(String[] args) {
		File file = new File("folder\\miPrimerArchivo.txt");
		
		if(file.delete()) {
			System.out.println("borrado");
		}else {
			System.out.println("no");
		}
	}
}
