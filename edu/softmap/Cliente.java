package edu.softmap;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	
	public Cliente( String nome ){
		this.nome = nome;
		this.telefone = "";
		this.email = "";
	}

	public Cliente( String nome, String telefone, String email ){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String toString(){
		String response = "Nome: " + nome + "\n";
		response += "telefone: " + telefone+ "\n";
		response += "email: " + email;
		return response;
	}
}
