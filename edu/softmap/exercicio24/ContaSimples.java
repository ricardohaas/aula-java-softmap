package edu.softmap.exercicio24;

public class ContaSimples extends Conta {
	
	public ContaSimples( String cliente, int numero, double saldoInicial){
		setCliente( cliente );
		setNumero( numero );
		setSaldo( saldoInicial );
	}

	@Override
	boolean temSaldo(double valor) {
		if( getSaldo() > valor ){
			return true;
		}
		
		return false;
	}

}