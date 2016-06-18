package edu.softmap;

public class Exercicio9 {
	
	/**
	 * Recebe 5 perguntas e 5 respostas depois as imprime no console
	 */
	public static void main(String[] args) {
		String perguntasRespostas[][] = new String[5][2]; 
		
		for (int i = 0; i < perguntasRespostas.length; i++) {
			perguntasRespostas[i][0] = PainelValores.pedeString( "Digite a pergunta "+ (i+1) );			
			perguntasRespostas[i][1] = PainelValores.pedeString( "Digite a resposta "+ (i+1) );			
		}
		
		
		for (int i = 0; i < perguntasRespostas.length; i++) {
			System.out.println( "Pergunta:" + perguntasRespostas[i][0] );
			System.out.println( "Resposta:" +perguntasRespostas[i][1] );
			System.out.println();
		}
	}

}
