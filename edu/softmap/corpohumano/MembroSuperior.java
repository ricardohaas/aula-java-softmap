package edu.softmap.corpohumano;

public class MembroSuperior {
	private Mao mao;
	
	public MembroSuperior( String lado){
		this.mao = new Mao( lado );
	}
	
	public Mao getMao() {
		return mao;
	}

	public void setMao(Mao mao) {
		this.mao = mao;
	}
}
