package edu.softmap.colecoes;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {
		Map ruas = new HashMap();
		ruas.put("Xv de Novembro", "89237000");
		ruas.put("Elario Gastão Baumer", "89237263");
		ruas.put("Xv de Novembro", "89237999");
		ruas.put("Xv de Novembro Final", "89237111");
		
		for( Object string: ruas.values()){
			System.out.println( string );
		}
		
		for( Object string: ruas.keySet()){
			System.out.println( string );
		}
	}

}
