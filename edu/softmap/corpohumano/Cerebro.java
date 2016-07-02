package edu.softmap.corpohumano;

public class Cerebro {
	private Cabeca cabeca;
	
	public void mexerDedaoPeDireito() {
		System.out.println( "Pensamento de mexer o dedao pé direito" );
		cabeca.getTronco().getPernaDireita().getPe().mexerDedao();
	}

	public Cabeca getCabeca() {
		return cabeca;
	}

	public void setCabeca(Cabeca cabeca) {
		this.cabeca = cabeca;
	}

}
