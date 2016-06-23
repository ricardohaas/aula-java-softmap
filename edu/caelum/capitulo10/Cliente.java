package edu.caelum.capitulo10;

public class Cliente implements Autenticavel{

	@Override
	public boolean autentica(String senha) {
		if( senha == "1234"){
			return true;
		}
		return false;
	}

}
