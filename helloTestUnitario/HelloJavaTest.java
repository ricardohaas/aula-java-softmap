package helloTestUnitario;

import junit.framework.TestCase;

public class HelloJavaTest extends TestCase {

	public void testSoma(){
		int valor1 = 2;
		int valor2 = 3;
		HelloJavaSoma helloJavaSoma = new HelloJavaSoma();
		int retorno = helloJavaSoma.soma( valor1 , valor2 );
		assertEquals( 5, retorno );
	}
	
	public void testSomaNegativos(){
		int valor1 = -2;
		int valor2 = 3;
		HelloJavaSoma helloJavaSoma = new HelloJavaSoma();
		int retorno = helloJavaSoma.soma( valor1 , valor2 );
		assertEquals( 1, retorno );
	}
	
	public void testSomaZero(){
		int valor1 = 0;
		int valor2 = 0;
		HelloJavaSoma helloJavaSoma = new HelloJavaSoma();
		int retorno = helloJavaSoma.soma( valor1 , valor2 );
		assertEquals( 0, retorno );
	}
}
