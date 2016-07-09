package edu.softmap.xadrez;

public class Tabuleiro {
	public static void main( String[] args ){
		System.out.println("Peao");
		Peao peao = new Peao(1,2);
		peao.move(2, 2);
		peao.move(3, 2);
		peao.move(3, 2);
		peao.move(5, 2);
		
		System.out.println("Torre");
		Torre torre = new Torre(1,1);
		torre.move( 1, 8);
		torre.move( 8, 8);
		torre.move( 7, 7);
		torre.move( 9, 8);
	}
}
