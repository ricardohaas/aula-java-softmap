package edu.softmap.exercicio16;

public class Exercicio16 {

	public static void main(String[] args) {
		ContaEspecial contaEspecial = new ContaEspecial( "Ricardo", 1, 150, 500);
		contaEspecial.mostrarSaldo();
		contaEspecial.saque( 135.50 );
		contaEspecial.mostrarSaldo();
		contaEspecial.saque( 235.50 );
		System.out.println( contaEspecial );
		
		System.out.println("");
		
		Conta contaSimples = new ContaSimples( "Haas", 2, 150 );
		contaSimples.mostrarSaldo();
		contaSimples.saque( 535.50 );
		contaSimples.mostrarSaldo();
		contaSimples.saque( 35.50 );
		contaSimples.mostrarSaldo();
		System.out.println( contaSimples );
	}

}
