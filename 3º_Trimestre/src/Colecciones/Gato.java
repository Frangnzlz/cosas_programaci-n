package Colecciones;

public class Gato implements Comparable<Gato>{
	private String nombre;
	private String color;
	private String raza;
	
	
	
	
	public Gato() {
		super();
	}




	public Gato(String nombre, String color, String raza) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getRaza() {
		return raza;
	}




	public void setRaza(String raza) {
		this.raza = raza;
	}




	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
	}
	
	



	@Override
	public int compareTo(Gato g) {
		
		return (this.nombre).compareTo(g.getNombre());
	}
	
}
