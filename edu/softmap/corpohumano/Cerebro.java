package edu.softmap.corpohumano;

public class Cerebro {
	private Cabeca cabeca;
	
	public Cerebro(Cabeca cabeca) {
		this.cabeca = cabeca;
	}

	public void mexerDedaoPeDireito() {
		System.out.println( "Pensamento de mexer o dedao pé direito" );
		cabeca.getTronco().getPernaDireita().getPe().mexerDedao();
	}
	
	public void mexerDedaoPeEsquerdo() {
		System.out.println( "Pensamento de mexer o dedao pé esquerdo" );
		cabeca.getTronco().getPernaEsquerda().getPe().mexerDedao();
	}
	
	public void mexerDedaoMaoDireito() {
		System.out.println( "Pensamento de mexer o dedao mão direita" );
		cabeca.getTronco().getBracoDireito().getMao().mexerDedao();
	}
	
	public void mexerDedaoMaoEsquerda() {
		System.out.println( "Pensamento de mexer o dedao mão esquerda" );
		cabeca.getTronco().getBracoEsquerdo().getMao().mexerDedao();
	}

	public Cabeca getCabeca() {
		return cabeca;
	}

	public void setCabeca(Cabeca cabeca) {
		this.cabeca = cabeca;
	}

	public void sentir( ParteCorpo parteCorpo, String sensacao) {
		System.out.println( "Recebida a sensação " + sensacao + " no " + parteCorpo.getNome());
	}

}
