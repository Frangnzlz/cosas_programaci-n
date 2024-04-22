package clases;

import java.util.ArrayList;

public class Carrito {
	ArrayList<Elemento> elementos = new ArrayList<Elemento>();
	
	public Carrito() {}

	public void agrega(Elemento elemento) {
		boolean existe = false;
		
		for(Elemento elem : elementos) {
			
			if(elem.getNombre().equals(elemento.getNombre())) {
				
				elem.setCantidad(elemento.getCantidad()+elem.getCantidad());
				existe = true;
			}
		}
		
		if(!existe) {
			elementos.add(elemento);
		}
	}
	
	public int numeroDeElementos() {
		return elementos.size();
	}
	
	public double importeTotal() {
		double importe = 0;
			
		for(Elemento elem : elementos) {
			importe += (elem.getPrecio()*elem.getCantidad());
		}
		
		return importe;
	}
	
	@Override
	public String toString() {
		String lista = "";
		
		for(Elemento elem : elementos) {
			lista += elem.toString() + '\n';
		}
		
		return lista;
		
	}
	
	
	
}
