package edu.softmap.xadrez;

public class Torre extends PecaXadrez{
	
	public Torre(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	@Override
	public boolean valida(int linha, int coluna) {

		if( linha == this.linha && coluna != this.coluna ){
			return true;
		}
		
		if( coluna == this.coluna && linha != this.linha ){
			return true;
		}
		
		return false;
	}

}
