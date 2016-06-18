package edu.softmap;

public class ContaBancaria {
	private Cliente cliente;
	private int numero;
	private double saldo = 0;
	private boolean especial = false;
	private final double limiteExtraSaqueContaEspecial = 1000;
	
	public ContaBancaria( String clienteNome, int numero ){
		Cliente cliente = new Cliente( clienteNome );
		this.cliente = cliente;
		this.numero = numero;
	}
	
	public ContaBancaria( String clienteNome, int numero, boolean especial ){
		Cliente cliente = new Cliente( clienteNome );
		this.cliente = cliente;
		this.numero = numero;
		this.especial = especial;
	}
	
	public ContaBancaria( Cliente cliente, int numero ){
		this.cliente = cliente;
		this.numero = numero;
	}
	
	public ContaBancaria( Cliente cliente, int numero, boolean especial ){
		this.cliente = cliente;
		this.numero = numero;
		this.especial = especial;
	}
	
	public void depositar( double valorDeposito ){
		if( valorDeposito <= 0 ){
			System.out.println( "Valor para depósito inválido(negativo): " + valorDeposito);
		}
		
		saldo += valorDeposito;
	}
	
	public double obterSaldo(){
		return this.saldo;
	}

	public void sacar( double valorSaque ) {
		double limiteSaque = saldo;
		if( especial ){
			limiteSaque = saldo + limiteExtraSaqueContaEspecial;
		}
		
		if( valorSaque > limiteSaque ){
			System.out.println( "Valor de saque maior que o permitido:" );
			System.out.println( "Limite atual: "+limiteSaque );
			System.out.println( "Valor desejado: "+ valorSaque );
		}
		
		saldo -= valorSaque;
	}
	
	public void setEspecial(boolean especial ){
		this.especial = especial;
	}
	
	public String toString(){
		String response = "Cliente: " + this.cliente + "\n";
		response += "Número: " + this.numero + "\n";
		response += "Tipo: " + ( this.especial ? "Especial" : "Normal" )  + "\n";
		response += "Saldo: " + this.saldo + "\n";
		return response;
	}
}
