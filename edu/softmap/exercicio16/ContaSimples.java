package edu.softmap.exercicio16;

public class ContaSimples extends Conta {
	
	public ContaSimples( String cliente, int numero, double saldoInicial){
		setCliente( cliente );
		setNumero( numero );
		setSaldo( saldoInicial );
	}

	@Override
	void deposito( double valor) {
		this.setSaldo(getSaldo() + valor);
	}

	@Override
	void saque(double valor) {
		if( temSaldo( valor )){
			System.out.println( "Debitado " + valor + " da conta "+ getNumero());
			this.setSaldo(getSaldo() - valor);
		}
		else{
			System.out.println( "Não debitado por falta de saldo");
		}
	}

	@Override
	boolean temSaldo(double valor) {
		if( getSaldo() > valor ){
			return true;
		}
		
		return false;
	}

	@Override
	void mostrarSaldo() {
		System.out.println( getSaldo() );
	}

}
