package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Nose {
	
	public static void main(String [] args) {
	
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("textos\\datos.txt"));
			String line;
			while((line = bufferedReader.readLine() )!= null) {
				System.out.println(line);
			}
			bufferedReader.close();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

		
	}
}
