package edu.softmap;

public class Exercicio12 {
	public static void main(String[] args){
		Cliente cliente = new Cliente( "Ricardo Haas", "47-9999-9999", "ricardohaas@msn.com" );
		
		ContaBancaria conta = new ContaBancaria( cliente, 12345, true );

		conta.depositar( 2000.0);
		conta.sacar( 1200 );
		System.out.println( conta.obterSaldo() );
		conta.setEspecial( true );
		conta.sacar( 1000 );
		System.out.println( conta.obterSaldo() );
		System.out.println( conta );
	}
}
