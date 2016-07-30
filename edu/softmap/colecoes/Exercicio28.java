package edu.softmap.colecoes;

import edu.softmap.PainelValores;

public class Exercicio28 {

	public static void main(String[] args) {
		Equipe equipe = new Equipe();
		String nomeDaEquipe = "";
		while( true ){
			nomeDaEquipe = PainelValores.pedeString("Por favor digite o nome de uma equipe ou fim para sair");
			if(nomeDaEquipe.toLowerCase().equals("fim") ){
				break;
			}
			System.out.println( nomeDaEquipe );
			equipe.adicionar(nomeDaEquipe);
		}
		
		System.out.println("Equipes cadastradas:");
		for( Object nomeEquipe : equipe.getEquipes() ){
			System.out.println( (String)nomeEquipe);
		}
	}

}
