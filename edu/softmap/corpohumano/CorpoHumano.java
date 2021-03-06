package edu.softmap.corpohumano;


public class CorpoHumano {
	private Cabeca cabeca;
	private Tronco tronco;
	
	public CorpoHumano(){
		this.cabeca = new Cabeca();
		this.tronco = new Tronco( this.cabeca );
		this.cabeca.setTronco( tronco );
	}

	public Cabeca getCabeca() {
		return cabeca;
	}
	public void setCabeca(Cabeca cabeca) {
		this.cabeca = cabeca;
	}
	public Tronco getTronco() {
		return tronco;
	}
	public void setTronco(Tronco tronco) {
		this.tronco = tronco;
	}
}
