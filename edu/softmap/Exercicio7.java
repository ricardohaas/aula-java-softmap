package edu.softmap;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		int altura = getNumberFromUser("Digite a altura do triangulo");
		int base = getNumberFromUser("Digite a base do triangulo");
		AreaDoTrianguloRetangulo areaDoTrianguloRetangulo = new AreaDoTrianguloRetangulo(base, altura );
		System.out.println( areaDoTrianguloRetangulo );
	}
	
	public static int getNumberFromUser(String message){
		int numberFromUser = 0;
		while( true ){
			
			String dadoUsuario = JOptionPane.showInputDialog( message );
			
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
