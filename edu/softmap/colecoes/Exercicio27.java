package edu.softmap.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Exercicio27 {
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		agenda.adicionar( "Carlos","3434-1000");
		agenda.adicionar( "Pedro","3435-2000");
		agenda.adicionar( "Marcos","3436-3000");
		agenda.adicionar( "Jonas","3437-4000");
		agenda.adicionar( "João","3438-5000");
		System.out.println( agenda.buscarPorNome("João"));
	}
}
