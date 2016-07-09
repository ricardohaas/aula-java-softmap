package edu.softmap.xadrez;

public abstract class PecaXadrez {

	int linha;
	int coluna;
	
	public void move( int linha, int coluna ){
		if( !validaPosicoesTabuleiro( linha, coluna )){
			System.out.println( "Movimento fora da área do tabuleiro - proibido - (" + this.linha + ","+ this.coluna + ") para ("  + linha + ","+ coluna + ")" );
			return;
		}
		
		if( valida( linha,coluna )){
			System.out.println( "Movimento permitido - (" + this.linha + ","+ this.coluna + ") para ("  + linha + ","+ coluna + ")" );
			this.linha = linha;
			this.coluna = coluna;
			return;
		}
		System.out.println( "Movimento proibido - (" + this.linha + ","+ this.coluna + ") para ("  + linha + ","+ coluna + ")" );
	}
	
	public boolean validaPosicoesTabuleiro( int linha, int coluna){
		if( linha < 1 || linha > 8 || coluna < 1 || coluna > 8 ){
			return false;
		}
		return true;
	}
	public abstract boolean valida(int linha, int coluna);
	
	public String toString(){
		return "(" + this.linha + " " + this.coluna + ")";
	}
}
