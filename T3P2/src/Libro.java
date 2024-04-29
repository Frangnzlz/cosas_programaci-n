
//interfaz implementada para poder comparar por titulo
public class Libro implements Comparable<Libro>{
	private String isbn;
	private String titulo;
	private boolean prestado;
	
	
	public Libro(String isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
		prestado = false;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public boolean getPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		
		return this.isbn + " -- " + this.titulo + '\n'+
				
				(this.prestado ? "Está prestado" : "No está prestado");
		
	}
	
	
	//metodo compareTo herededado de comparable para poder ordenar por titulo
	@Override
	public int compareTo(Libro g) {
		
		return (this.titulo).compareTo(g.getTitulo());
	}
	
}
