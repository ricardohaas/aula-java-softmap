package edu.softmap;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main( String[] Args){
		int m = getNumberFromUser();
		int n = getNumberFromUser();
		Tabuada tabuada = new Tabuada();
		tabuada.printMultiples( m, n );
		
	}
	
	public static int getNumberFromUser(){
		int numberFromUser = 0;
		while( true ){
			
			String dadoUsuario = JOptionPane.showInputDialog("Digite um número");
			
			try{
				numberFromUser = Integer.parseInt( dadoUsuario );
			}
			catch( Exception ex){
				System.out.println(ex);
			}
			
			if( numberFromUser > 0 ){
				System.out.println("Informado o número "+ numberFromUser + ".");
				break;
			}
			
			System.out.println( "Número inválido, por favor tente novamente");
		} 
		
		return numberFromUser;
	}
}
