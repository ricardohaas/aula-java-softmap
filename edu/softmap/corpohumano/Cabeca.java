package edu.softmap.corpohumano;


public class Cabeca {
	private Cerebro cerebro;
	private Tronco tronco;
	
	public Cabeca(){
		this.cerebro = new Cerebro( this );
	}
	public Cerebro getCerebro() {
		return cerebro;
	}

	public void setCerebro(Cerebro cerebro) {
		this.cerebro = cerebro;
	}

	public Tronco getTronco() {
		return tronco;
	}

	public void setTronco(Tronco tronco) {
		this.tronco = tronco;
	}

}
