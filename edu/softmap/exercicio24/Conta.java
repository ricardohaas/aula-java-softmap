package edu.softmap.exercicio24;

abstract class Conta {
	private String cliente;
	private int numero;
	private double saldo;
	
	abstract boolean temSaldo( double valor );
	
	void deposito( double valor) throws ValorDepositoInvalidoException {
		if( valor <= 0 ){
			throw new ValorDepositoInvalidoException( "Valor depósito inválido " + valor );
		}
		this.setSaldo( getSaldo() + valor);
	}

	void saque(double valor) throws SaldoInsuficienteException {
		if( temSaldo( valor )){
			System.out.println( "Debitado " + valor + " da conta "+ getNumero());
			this.setSaldo(getSaldo() - valor);
		}
		else{
			throw new SaldoInsuficienteException( "Saldo insuficiente para sacar " + valor );
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
