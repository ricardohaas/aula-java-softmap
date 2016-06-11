package edu.softmap;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int numberFromUser = getNumberFromUser();
		
		System.out.println( isPrimo( numberFromUser ) ? "É primo!" : "Não é primo!" );
	}
	
	public static int getNumberFromUser(){
		int numberFromUser = 0;
		while( true ){
			
			String dadoUsuario = JOptionPane.showInputDialog("Digite um número" );
			
			try{
				numberFromUser = Integer.parseInt( dadoUsuario );
			}
			catch( Exception ex){
				System.out.println(ex );
			}
			
			if( numberFromUser > 0 ){
				System.out.println("Informado o número "+ numberFromUser + ". Número OK.");
				break;
			}
			
			System.out.println( "Número inválido, por favor tente novamente");
		} 
		
		return numberFromUser;
	}
	
	public static boolean isPrimo( int number){
		for( int i = 2; i < number ; i++ ){
			if( number % i == 0 ){
				System.out.println( "É divisível por " + i + " também" );
				return false;
			}
		}
		return true;
	}

}
