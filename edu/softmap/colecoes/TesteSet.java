package edu.softmap.colecoes;

import java.util.HashSet;

public class TesteSet {
	public static void main(String[] args){
		HashSet bairros = new HashSet();
		Bairro centro  = new Bairro();
		centro.nome = "centro";
		Bairro america  = new Bairro();
		america.nome = "america";
		bairros.add(centro);
		bairros.add(america);
		bairros.add(centro);
		bairros.add(america);
		
		for( Object object: bairros){
			System.out.println( ((Bairro)object).nome);
		}
	}
}
