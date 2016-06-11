package edu.softmap;

import junit.framework.TestCase;

public class Exercicio5Test extends TestCase {

	public void testIsPrimoTrue47() {
		int numero = 47;
		Primo primo = new Primo();
		boolean retorno = primo.isPrimo( numero );
		assertEquals( true, retorno );
	}
	
	public void testIsPrimoFalse21() {
		int numero = 21;
		Primo primo = new Primo();
		boolean retorno = primo.isPrimo( numero );
		assertEquals( false, retorno );
	}
	
	public void testIsPrimoFalse2207() {
		int numero = 2207;
		Primo primo = new Primo();
		boolean retorno = primo.isPrimo( numero );
		assertEquals( true, retorno );
	}
	
	public void testIsPrimoFalse2209() {
		int numero = 2209;
		Primo primo = new Primo();
		boolean retorno = primo.isPrimo( numero );
		assertEquals( false, retorno );
	}

}
