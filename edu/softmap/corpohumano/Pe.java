package edu.softmap.corpohumano;

public class Pe {
	private int tamanho;
	private String lado;

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void mexerDedao(){
		System.out.println( "Mexeu o dedao do pé " + lado );
	}
}
