package edu.softmap.corpohumano;

public class Mao {
	private String lado;
	
	public Mao(String lado){
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

}
