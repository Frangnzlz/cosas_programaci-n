package clases;

public class Moneda {
	private String Valor;
	private String posicion;

	public Moneda(int num, boolean posicion) {
		if(posicion){
			this.posicion = "cara";
		}else {
			this.posicion = "cruz";
		}
		switch(num) {
			case 0:
				this.Valor = "1 céntimo";
				break;
			case 1:
				this.Valor = "2 céntimos";
				break;
			case 2:
				this.Valor = "5 céntimos";
				break;
			case 3:
				this.Valor = "10 céntimos";
				break;
			case 4:
				this.Valor = "25 céntimos";
				break;
			case 5:
				this.Valor = "50 céntimos";
				break;
			case 6:
				this.Valor = "1 euro";
				break;
			case 7:
				this.Valor = "2 euro";
				break;
				
		}
		
		

		
	}
	
	
	@Override
	public String toString() {
		return this.Valor + "--" + this.posicion;
	}
	
}
