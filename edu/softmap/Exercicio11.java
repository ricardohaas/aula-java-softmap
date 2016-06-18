package edu.softmap;

public class Exercicio11 {
	public static void main(String[] args){
		
		Cliente cliente = new Cliente( "Ricardo Haas", "47-9999-9999", "ricardohaas@msn.com" );
		
		ContaBancaria conta = new ContaBancaria( cliente, 12345, true );

		conta.depositar( 100.0);
		
		conta.depositar( 150.0);
		
		System.out.println( conta.obterSaldo() );		
		
		conta.sacar( 50 );
		
		System.out.println( conta.obterSaldo() );
		
		conta.sacar( 20.99 );
		
		System.out.println( conta.obterSaldo() );
		
		System.out.println( conta );
		
		
		
		ContaBancaria conta2 = new ContaBancaria( "Joao", 12345, true );

		conta2.depositar( 100.0);
		
		System.out.println( conta2.obterSaldo() );		
		
		conta2.sacar( 150 );
		
		System.out.println( conta2.obterSaldo() );
		
		System.out.println( conta2 );
	}
	
}
