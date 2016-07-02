package edu.softmap.corpohumano;

public class MembroSuperior {
	private Mao mao;
	private Tronco tronco;
	
	public MembroSuperior( Tronco tronco, String lado){
		this.setTronco(tronco);
		this.mao = new Mao( this ,lado );
	}
	
	public Mao getMao() {
		return mao;
	}

	public void setMao(Mao mao) {
		this.mao = mao;
	}

	public Tronco getTronco() {
		return tronco;
	}

	public void setTronco(Tronco tronco) {
		this.tronco = tronco;
	}
}
