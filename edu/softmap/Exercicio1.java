package edu.softmap;

public class Exercicio1 {
	
	/**
	 * 
	 * @param args Recebe o parâmetro da linha de comando
	 */
	public static void main(String[] args) {
		System.out.println( "Hello Java!" );
		
		MinhaData hoje = new MinhaData();
		hoje.dia = 11;
		hoje.mes = 06;
		hoje.ano = 2016;
		
		MinhaData casamento = new MinhaData();
		casamento.dia = 8;
		casamento.mes = 5;
		casamento.ano = 1999;
		
		System.out.println( "Meu casamento foi dia " + casamento.dia );
		System.out.println( "do mês " + casamento.mes );
		System.out.println( "do ano " + casamento.ano );
		
		MinhaData nascimento = new MinhaData();
		nascimento.dia = 1;
		nascimento.mes = 6;
		nascimento.ano = 1988;
		
		System.out.println( "Me casei em " + casamento );
		System.out.println( "Nasci em " + nascimento );
		System.out.println( "Hoje é " + hoje );
	}
	
}
