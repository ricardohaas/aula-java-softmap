package edu.softmap.exercicio16;

abstract class Conta {
	private String cliente;
	private int numero;
	private double saldo;
	
	abstract boolean temSaldo( double valor );
	
	void deposito( double valor) {
		this.setSaldo(getSaldo() + valor);
	}

	void saque(double valor) {
		if( temSaldo( valor )){
			System.out.println( "Debitado " + valor + " da conta "+ getNumero());
			this.setSaldo(getSaldo() - valor);
		}
		else{
			System.out.println( "Não debitado por falta de saldo");
		}
	}
	
	void mostrarSaldo() {
		System.out.println( getSaldo() );
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String toString(){
		return "Cliente: " + getCliente() + "\r\n" + "Numero: "+ getNumero() + "\r\n" + "Saldo: " + getSaldo();
	}
}
