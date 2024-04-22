package clases;



public class Carta implements Comparable<Carta>{
	private Integer numero;
	private String palo;
	private int valorPalo;
	
	public Carta(int num, String palo, int valorPalo) {
		numero=num;
		this.palo = palo;
		this.valorPalo = valorPalo;
	}
	public int getNumero() {
		return numero;
	}
	public String getPalo() {
		return palo;
	}
	public int getValorPalo() {
		return valorPalo;
	}
	
	@Override
	public String toString() {
		return "[" + String.format("%02d", numero) + " - " + palo + "]"; 
	}
	
	@Override
	public int compareTo(Carta g) {
		
		if(this.palo.equals(g.getPalo())){
			return (this.numero).compareTo(g.getNumero());

		}else {
			return (this.palo).compareTo(g.getPalo());

		}
		
	}
}
