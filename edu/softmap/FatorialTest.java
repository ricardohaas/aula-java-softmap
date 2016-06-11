package edu.softmap;

import junit.framework.TestCase;

public class FatorialTest extends TestCase {

	public void testGetFatorial2() {
		int number = 2;
		Fatorial fatorial = new Fatorial();
		int retorno = fatorial.getFatorial( number );
		assertEquals( 2, retorno );
	}
	
	public void testGetFatorial3() {
		int number = 3;
		Fatorial fatorial = new Fatorial();
		int retorno = fatorial.getFatorial( number );
		assertEquals( 6, retorno );
	}
	
	public void testGetFatorial5() {
		int number = 5;
		Fatorial fatorial = new Fatorial();
		int retorno = fatorial.getFatorial( number );
		assertEquals( 120, retorno );
	}
	
	public void testGetFatorial6() {
		int number = 6;
		Fatorial fatorial = new Fatorial();
		int retorno = fatorial.getFatorial( number );
		assertEquals( 720, retorno );
	}

}
