package edu.softmap.colecoes;

import java.util.ArrayList;

public class Equipe {
	ArrayList equipes = new ArrayList();

	public void adicionar(String nomeDaEquipe) {
		equipes.add( nomeDaEquipe );
	}
	
	public ArrayList getEquipes(){
		return this.equipes;
	}

}
