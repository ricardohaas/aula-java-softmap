package edu.softmap.corpohumano;

public class Tronco {
	private MembroSuperior bracoEsquerdo;
	private MembroSuperior bracoDireito;
	private MembroInferior pernaEsquerda;
	private MembroInferior pernaDireita;
	
	public Tronco(){
		bracoDireito = new MembroSuperior("Direito");
		bracoEsquerdo = new MembroSuperior("Esquerdo");
		pernaDireita = new MembroInferior( "Direito" );
		pernaEsquerda = new MembroInferior( "Esquerdo" );
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
}
