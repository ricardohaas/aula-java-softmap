package edu.softmap.colecoes;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList bairros = new ArrayList();
		Bairro centro  = new Bairro();
		centro.nome = "centro";
		bairros.add(centro);
		bairros.add(centro);
		Bairro america  = new Bairro();
		america.nome = "america";
		bairros.add(america);
		
		for( Object object: bairros){
			System.out.println( ((Bairro)object).nome);
		}
	}
	
}
