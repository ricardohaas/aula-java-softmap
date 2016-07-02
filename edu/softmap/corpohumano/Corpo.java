package edu.softmap.corpohumano;

public class Corpo {

	public static void main(String[] args) {
		CorpoHumano frank = new CorpoHumano();
		
		//Movimentos
		frank.getCabeca().getCerebro().mexerDedaoPeDireito();
		frank.getCabeca().getCerebro().mexerDedaoPeEsquerdo();
		frank.getCabeca().getCerebro().mexerDedaoMaoDireito();
		frank.getCabeca().getCerebro().mexerDedaoMaoEsquerda();
		
		frank.getTronco().getPernaDireita().getPe().receberSensacao( "Frio" );
	}

}
