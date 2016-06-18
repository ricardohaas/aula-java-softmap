package edu.softmap;

public class Exercicio10 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		System.out.println( "O estado da lâmpada é " + ( lampada.isAcesa() ? "Acesa" : "Apagada" ) );
		lampada.desliga();
		System.out.println( "O estado da lâmpada é " + ( lampada.isAcesa() ? "Acesa" : "Apagada" ) );
		lampada.liga();
		System.out.println( "O estado da lâmpada é " + ( lampada.isAcesa() ? "Acesa" : "Apagada" ) );
	}

}
