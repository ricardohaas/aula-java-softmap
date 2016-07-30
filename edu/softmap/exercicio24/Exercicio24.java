package edu.softmap.exercicio24;

public class Exercicio24 {

	public static void main(String[] args) {
		ContaEspecial contaEspecial = new ContaEspecial( "Ricardo", 1, 150, 500);
		contaEspecial.mostrarSaldo();
		try {
			contaEspecial.saque( 135.50 );
			contaEspecial.mostrarSaldo();
			
			contaEspecial.saque( 235.50 );
			System.out.println( contaEspecial );
			
			System.out.println("");
			
			Conta contaSimples = new ContaSimples( "Haas", 2, 150 );
			contaSimples.mostrarSaldo();
			//contaSimples.saque( 535.50 );
			contaSimples.mostrarSaldo();
			contaSimples.saque( 35.50 );
			contaSimples.mostrarSaldo();
			contaSimples.deposito( 100 );
			contaSimples.mostrarSaldo();
			System.out.println( contaSimples );
			contaSimples.deposito( -100 );
			System.out.println( contaSimples );
		} 
		catch(SaldoInsuficienteException | ValorDepositoInvalidoException e) {
			System.out.println( e.getMessage() );
		}
	}

}
