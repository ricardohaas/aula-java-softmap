package edu.caelum.capitulo10;

public class InterfaceMain {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Visitante visitante = new Visitante();
		
		//Possui o método autentica
		login( cliente );
		//Não possui o método autentica
		//login( visitante );

	}
	
	public static void login( Autenticavel a){
		
		System.out.println( "Tentando autenticar com a senha qwerty:");
		System.out.println( a.autentica("qwerty") == true ? "Sucesso" : "Falha"  );
		
		System.out.println( "Tentando autenticar com a senha 1234:                                                                                                                 ");
		System.out.println( a.autentica("1234") == true ? "Sucesso" : "Falha"  );
	}

}
