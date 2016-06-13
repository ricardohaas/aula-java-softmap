package edu.softmap;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio4 {
	static final int MIN_NUMBER = 1;
	static final int MAX_NUMBER = 1000;
	
	public static void main(String[] args) {
		int numberFromUser = getNumberFromUser();
		boolean isEven;
		
		if( numberFromUser % 2 == 0 ){
			isEven = true;
		}
		else{
			isEven = false;
		}
		
		for( int i = MIN_NUMBER; i < MAX_NUMBER; i++ ){
			if( isEven &&  i < numberFromUser && ( i %2 == 0 )  ){
				System.out.println( i );
			}
			
			if( !isEven && i > numberFromUser && ( i %2 != 0 )){
				System.out.println( i );
			}
		}
	}
	
	public static int getNumberFromUser(){
		int numberFromUser = 0;
		while( true ){
			
			String dadoUsuario = JOptionPane.showInputDialog("Digite um número entre " + MIN_NUMBER + " e " + MAX_NUMBER );
			
			try{
				numberFromUser = Integer.parseInt( dadoUsuario );
			}
			catch( Exception ex){
				System.out.println(ex );
			}
			
			if( numberFromUser > MIN_NUMBER && numberFromUser < MAX_NUMBER ){
				System.out.println("Informado o número "+ numberFromUser + ". Número OK.");
				break;
			}
			
			System.out.println( "Número inválido, por favor tente novamente");
		} 
		
		return numberFromUser;
	}

}
