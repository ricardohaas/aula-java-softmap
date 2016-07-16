package edu.softmap.classeInterna;

public class Casa {
	Porta entrada;
	
	class Porta{
		String Cor;
	}
	
	void criarPorta(){
		entrada = new Porta();
	}
	
	public static void main(String[] args){
		Casa casa = new Casa();
		casa.criarPorta();
		System.out.println( casa.entrada );
	}
}
