
import java.util.ArrayList;
import java.util.Collections;



public class Biblioteca {
	private ArrayList<Libro> libreria;
	private int cont;
	
	
	public Biblioteca() {
		libreria = new ArrayList<>();
	}
	
	
	//Destruye todos los libros dentro de la libreria
	public void vaciar() {
		libreria.removeAll(libreria);
		cont = libreria.size();
	}
	
	
	//metodo para insertar un libro
	public void insertar(Libro libro) {
		//forma de comprobar que ese libro no este ya incluido
		if(libreria.removeIf(lib-> lib.getIsbn().equals(libro.getIsbn()))) {
			libreria.add(libro);
			System.out.println("ya existe ese libro");
		}else {
			libreria.add(libro);
			System.out.println("libro añadido");
		}
		cont = libreria.size();
	}
	
	//metodo para borrar un libro
	public void borrarLibro(String isbn) {
		
		if(libreria.removeIf(libro-> libro.getIsbn().equals(isbn))) {
			System.out.println("Libro borrado");
		}else {
			System.out.println("No se ha encontrado ese libro");
		}
		cont = libreria.size();
	}
	
	//metodo para prestar un libro
	public void prestarLibro(String isbn) {
		for(Libro libro : libreria) {
			if(libro.getIsbn().equals(isbn) ) {
				if(!libro.getPrestado()) {
					libro.setPrestado(true);
					System.out.println("Libro dado en prestamo");
				}else {
					System.out.println("Libro ya en prestamo");
				}
				break;
			}
		}
	}
	
	//metodo para devolver un libro
	public void devolverLibro(String isbn) {
		for(Libro libro : libreria) {
			if(libro.getIsbn().equals(isbn) ) {
				if(libro.getPrestado()) {
					libro.setPrestado(false);
					System.out.println("Libro devuelvo");
				}else {
					System.out.println("Libro ya en la biblioteca");
				}
				break;
			}
		}
	}
	
	//metodo para ordenar por titulo
	public void ordenarPorTitulo() {
		Collections.sort(libreria);
		
		System.out.println(libreria.toString());
		
	}
	
	
	@Override
	public String toString() {
		String texto = "";
		
		for(Libro libro : libreria) {
			texto += libro.toString() + '\n';
		}
		
		
		return texto;
	}



	
	
}
