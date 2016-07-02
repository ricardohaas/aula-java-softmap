package edu.softmap.corpohumano;

public class MembroInferior {
	private Pe pe;
	private String lado;
	
	public MembroInferior( String lado){
		this.lado = lado;
		this.pe = new Pe( lado, 38 );
	}
	public Pe getPe() {
		return pe;
	}

	public void setPe(Pe pe) {
		this.pe = pe;
	}
}
