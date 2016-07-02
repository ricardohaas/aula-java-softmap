package edu.softmap.corpohumano;

public class Tronco {
	private Cabeca cabeca;
	private MembroSuperior bracoEsquerdo;
	private MembroSuperior bracoDireito;
	private MembroInferior pernaEsquerda;
	private MembroInferior pernaDireita;
	
	public Tronco(Cabeca cabeca){
		this.setCabeca(cabeca);
		bracoDireito = new MembroSuperior(this, "Direito");
		bracoEsquerdo = new MembroSuperior(this, "Esquerdo");
		pernaDireita = new MembroInferior( this, "Direito" );
		pernaEsquerda = new MembroInferior( this, "Esquerdo" );
	}
	
	public MembroSuperior getBracoEsquerdo() {
		return bracoEsquerdo;
	}
	
	public void setBracoEsquerdo(MembroSuperior bracoEsquerdo) {
		this.bracoEsquerdo = bracoEsquerdo;
	}
	
	public MembroInferior getPernaEsquerda() {
		return pernaEsquerda;
	}
	
	public void setPernaEsquerda(MembroInferior pernaEsquerda) {
		this.pernaEsquerda = pernaEsquerda;
	}
	
	public MembroSuperior getBracoDireito() {
		return bracoDireito;
	}
	
	public void setBracoDireito(MembroSuperior bracoDireito) {
		this.bracoDireito = bracoDireito;
	}
	
	public MembroInferior getPernaDireita() {
		return pernaDireita;
	}
	
	public void setPernaDireita(MembroInferior pernaDireita) {
		this.pernaDireita = pernaDireita;
	}

	public Cabeca getCabeca() {
		return cabeca;
	}

	public void setCabeca(Cabeca cabeca) {
		this.cabeca = cabeca;
	}
}
