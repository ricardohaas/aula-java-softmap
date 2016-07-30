package edu.softmap.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	private Map contatos;
	
	public Agenda(){
		this.contatos = new HashMap();
	}
	public void adicionar(String nome, String telefone) {
		this.contatos.put( nome, telefone);
	}
	
	public String buscarPorNome(String nome) {
		return (String) this.contatos.get( nome );
	}

}
