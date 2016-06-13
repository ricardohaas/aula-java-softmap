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
			
			String dadoUsuario = JOptionPane.showInputDialog("Digite um n�mero");
			
			try{
				numberFromUser = Integer.parseInt( dadoUsuario );
			}
			catch( Exception ex){
				System.out.println(ex);
			}
			
			if( numberFromUser > 0 ){
				System.out.println("Informado o n�mero "+ numberFromUser + ".");
				break;
			}
			
			System.out.println( "N�mero inv�lido, por favor tente novamente");
		} 
		
		return numberFromUser;
	}
}
