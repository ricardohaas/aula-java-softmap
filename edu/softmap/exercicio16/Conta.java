package edu.softmap.exercicio16;

abstract class Conta {
	private String cliente;
	private int numero;
	private double saldo;
	
	abstract void deposito( double valor );
	abstract void saque( double valor );
	abstract boolean temSaldo( double valor );
	abstract void mostrarSaldo();
	
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
}
