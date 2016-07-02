package edu.softmap.corpohumano;

public class Pe implements ParteCorpo, Tateavel{
	private MembroInferior membroInferior;
	private int tamanho;
	private String lado;

	public Pe(MembroInferior membroInferior, String lado, int tamanho) {
		this.membroInferior = membroInferior;
		this.lado = lado;
		this.tamanho = tamanho;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void mexerDedao(){
		System.out.println( "Mexeu o dedao do pé " + lado );
	}

	public MembroInferior getMembroInferior() {
		return membroInferior;
	}

	public void setMembroInferior(MembroInferior membroInferior) {
		this.membroInferior = membroInferior;
	}
	
	@Override
	public void receberSensacao( String sensacao){
		System.out.println( "Sensacao "+ sensacao +" no pé "+ lado );
		membroInferior.getTronco().getCabeca().getCerebro().sentir( this,sensacao );
	}

	@Override
	public String getNome() {
		return "Pé " + lado;
	}

}
