package edu.softmap.corpohumano;

public class MembroInferior {
	private Tronco tronco;
	private Pe pe;
	private String lado;
	
	public MembroInferior( Tronco tronco, String lado){
		this.tronco = tronco;
		this.setLado(lado);
		this.pe = new Pe( this, lado, 38 );
	}
	
	public Pe getPe() {
		return pe;
	}

	public void setPe(Pe pe) {
		this.pe = pe;
	}

	public Tronco getTronco() {
		return tronco;
	}

	public void setTronco(Tronco tronco) {
		this.tronco = tronco;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}
}
