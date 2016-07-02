package edu.softmap.corpohumano;

public class Mao {
	private MembroSuperior membroSuperior;
	private String lado;
	
	public Mao(MembroSuperior membroSuperior, String lado){
		this.membroSuperior = membroSuperior;
		this.lado = lado;
	}
	
	public void mexerDedao() {
		System.out.println("Mexeu dedao da mao " + lado);
	}
	
	public String getLado() {
		return lado;
	}
	public void setLado(String lado) {
		this.lado = lado;
	}

	public MembroSuperior getMembroSuperior() {
		return membroSuperior;
	}

	public void setMembroSuperior(MembroSuperior membroSuperior) {
		this.membroSuperior = membroSuperior;
	}

}
