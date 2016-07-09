package edu.softmap.xadrez;

public class Peao extends PecaXadrez{
	
	public Peao(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	@Override
	public boolean valida(int linha, int coluna) {
		if( linha < 2 || linha > 8 ){
			return false;
		}

		if( linha - this.linha != 1 ){
			return false;
		}
		
		if( coluna != this.coluna  ){
			return false;
		}
		
		return true;
	}

}
