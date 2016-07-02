package edu.softmap.corpohumano;

public class CorpoHumano {
	private Cabeca cabeca;
	private Tronco tronco;
	
	public CorpoHumano(){
		this.criarCabeca();
		this.criarTronco();
	}
	
	private void criarTronco() {
		this.tronco = new Tronco();
		this.cabeca.setTronco( tronco );
	}

	private void criarCabeca() {
		this.cabeca = new Cabeca();
		Cerebro cerebro = new Cerebro();
		cerebro.setCabeca( this.cabeca );
		this.cabeca.setCerebro( cerebro );
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
