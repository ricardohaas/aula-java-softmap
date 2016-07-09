package edu.softmap.exercicio16;

public class ContaEspecial extends ContaSimples{
	private double limite = 500;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial( String cliente, int numero, double saldoInicial, double limiteInicial ){
		super(cliente, numero, saldoInicial);
		setLimite( limiteInicial );
	}
	
	@Override
	boolean temSaldo(double valor) {
		if( getSaldo() + getLimite() > valor ){
			return true;
		}
		
		return false;
	}
}
