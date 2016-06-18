package edu.softmap;

//Exercicio 8
public class Media {
	public static void main(String[] args ){
		int notas[] = new int[5];
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = PainelValores.pedeInteiro( "Digite a nota " + (i+1) );
		}
		
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		
		System.out.println( "A média é " + total/notas.length);
	}
}
