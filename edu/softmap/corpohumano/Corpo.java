package edu.softmap.corpohumano;

public class Corpo {

	public static void main(String[] args) {
		CorpoHumano frank = new CorpoHumano();
		
		frank.setCabeca( new Cabeca());
		Cerebro cerebro = new Cerebro();
		cerebro.setCabeca( frank.getCabeca() );
		frank.getCabeca().setCerebro( cerebro );
		
		frank.setTronco( new Tronco() );
		frank.getTronco().setBracoDireito( new MembroSuperior() );
		frank.getTronco().setBracoEsquerdo( new MembroSuperior() );
		frank.getTronco().setPernaDireita( new MembroInferior() );
		frank.getTronco().setPernaEsquerda( new MembroInferior() );
		
		frank.getCabeca().setTronco( frank.getTronco() );
		
		frank.getTronco().getPernaDireita().setPe( new Pe() );
		frank.getTronco().getPernaDireita().getPe().setTamanho( 38 );
		frank.getTronco().getPernaDireita().getPe().setLado( "Direito" );
		frank.getTronco().getPernaEsquerda().setPe( new Pe() );
		frank.getTronco().getPernaEsquerda().getPe().setTamanho( 38 );
		frank.getTronco().getPernaEsquerda().getPe().setLado( "Esquerdo" );
		
		frank.getTronco().getBracoDireito().setMao( new Mao("Direita") );
		frank.getTronco().getBracoEsquerdo().setMao( new Mao("Esquerda") );
		
		frank.getCabeca().getCerebro().mexerDedaoPeDireito();
		
		//frank.getTronco().getPernaDireita().getPe().mexerDedao();
		//frank.getTronco().getBracoDireito().getMao().mexerDedao();
	}

}
