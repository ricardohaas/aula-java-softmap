package edu.softmap;

public class Lampada {
	private boolean acesa = false;

	public boolean isAcesa() {
		return acesa;
	}

	public void liga() {
		this.acesa = true;
	}
	
	public void desliga() {
		this.acesa = false;
	}
}
