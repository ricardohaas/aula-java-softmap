package edu.softmap.xadrez;

public abstract class PecaXadrez {

	int linha;
	int coluna;
	
	public void move( int linha, int coluna ){
		if( valida( linha,coluna )){
			System.out.println( "Movimento permitido - (" + this.linha + ","+ this.coluna + ") para ("  + linha + ","+ coluna + ")" );
			this.linha = linha;
			this.coluna = coluna;
			return;
		}
		System.out.println( "Movimento proibido - (" + this.linha + ","+ this.coluna + ") para ("  + linha + ","+ coluna + ")" );
	}

	public abstract boolean valida(int linha, int coluna);
	
	public String toString(){
		return "(" + this.linha + " " + this.coluna + ")";
	}
}
