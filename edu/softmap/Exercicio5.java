package edu.softmap;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int numberFromUser = getNumberFromUser();
		Primo primo = new Primo();
		System.out.println( primo.isPrimo( numberFromUser ) ? "É primo!" : "Não é primo!" );
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
	
	

}
