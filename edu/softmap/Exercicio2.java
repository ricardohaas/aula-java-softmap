package edu.softmap;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Ponto inicio = new Ponto(10, 10);
		Ponto fim = new Ponto(20,30);
		
		System.out.println( "Ponto inicio" );
		System.out.println( inicio );

		System.out.println( "Ponto fim" );
		System.out.println( fim );
		
		String[] dias = {"seg","ter","qua","qui","sex"};
		
		for( String diaSemana : dias ){
			System.out.println( diaSemana );
		}

	}

}
