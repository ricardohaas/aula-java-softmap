package edu.softmap;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio4 {
	static int minNumber = 1;
	static int maxNumber = 1000;
	
	public static void main(String[] args) {
		int numberFromUser = getNumberFromUser();
		boolean isEven;
		
		if( numberFromUser % 2 == 0 ){
			isEven = true;
		}
		else{
			isEven = false;
		}
		
		for( int i = minNumber; i < maxNumber; i++ ){
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
			
			String dadoUsuario = JOptionPane.showInputDialog("Digite um número entre " + minNumber + " e " + maxNumber );
			
			try{
				numberFromUser = Integer.parseInt( dadoUsuario );
			}
			catch( Exception ex){
				System.out.println(ex );
			}
			
			if( numberFromUser > minNumber && numberFromUser < maxNumber ){
				System.out.println("Informado o número "+ numberFromUser + ". Número OK.");
				break;
			}
			
			System.out.println( "Número inválido, por favor tente novamente");
		} 
		
		return numberFromUser;
	}

}
