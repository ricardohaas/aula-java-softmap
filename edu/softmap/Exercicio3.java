package edu.softmap;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] numeros = {2,4,6,10};
		Fatorial f = new Fatorial();
		
		for( int numero: numeros){
			System.out.println( "Fatorial de " + numero );
			System.out.println( f.getFatorial( numero ));
		}
	}
}
