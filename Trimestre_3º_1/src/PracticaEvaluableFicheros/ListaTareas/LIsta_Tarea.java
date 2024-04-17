package PracticaEvaluableFicheros.ListaTareas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class LIsta_Tarea {

	public static void main(String[] args) {

		File file = new File("textosPractica\\lista_de_tareas.txt");
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		try {
			do {
				System.out.println("Que quieres hacer");
				System.out.println("1. añadir tarea");
				System.out.println("2. borrar tarea");
				System.out.println("3. ver tareas");
				System.out.println("4. salir del programa");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					añadirTarea(file);
					break;
				case 2:
					borrarTarea(file);
					break;
				case 3:
					verTarea(file);
					break;
				case 4:
					System.out.println("Gracias por usar nuestro programa");
					break;
				default:
					System.out.println("No ha elegido ninguna opcion");
					sc.close();
					break;
				}
			} while (opcion != 4);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("No existe esa tarea");
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("No ha introducido un numero");
		}
		
	}
	
	public static void añadirTarea(File file) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		int contador = 1;
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		while(reader.readLine() != null ) {
			contador++;
		}
		reader.close();
		
		System.out.println("Que tarea quieres añadir?");
		
		writer.write(contador +". " + new Scanner(System.in).nextLine());
		writer.newLine();
		
		writer.close();
		
	}
	public static void borrarTarea(File file) throws IOException, IndexOutOfBoundsException, InputMismatchException{
		int index;
		ArrayList<String> lista = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String linea;
		while((linea = reader.readLine()) != null) {
			lista.add(linea);
			System.out.println(linea);
		}
		reader.close();
		System.out.println("Que numero de tarea quieres eliminar");
		index = new Scanner(System.in).nextInt();
		lista.remove(index-1);
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		for (String string : lista) {

			writer.write(string);
			writer.newLine();
		}
		writer.close();
	}
	public static void verTarea(File file) throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String linea;
		while((linea = reader.readLine()) != null) {
			System.out.println(linea);
		}
		reader.close();
	}
}
