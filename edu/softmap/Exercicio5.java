package edu.softmap;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int numberFromUser = getNumberFromUser();
		
		System.out.println( isPrimo( numberFromUser ) ? "� primo!" : "N�o � primo!" );
	}
	
	public static int getNumberFromUser(){
		int numberFromUser = 0;
		while( true ){
			
			String dadoUsuario = JOptionPane.showInputDialog("Digite um n�mero" );
			
			try{
				numberFromUser = Integer.parseInt( dadoUsuario );
			}
			catch( Exception ex){
				System.out.println(ex );
			}
			
			if( numberFromUser > 0 ){
				System.out.println("Informado o n�mero "+ numberFromUser + ". N�mero OK.");
				break;
			}
			
			System.out.println( "N�mero inv�lido, por favor tente novamente");
		} 
		
		return numberFromUser;
	}
	
	public static boolean isPrimo( int number){
		for( int i = 2; i < number ; i++ ){
			if( number % i == 0 ){
				System.out.println( "� divis�vel por " + i + " tamb�m" );
				return false;
			}
		}
		return true;
	}

}
