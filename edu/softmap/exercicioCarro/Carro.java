package edu.softmap.exercicioCarro;

import edu.softmap.painel.Cambio;
import edu.softmap.painel.Ignicao;
import edu.softmap.painel.Pedais;
import edu.softmap.painel.Volante;

public class Carro implements Cambio,Ignicao,Pedais,Volante{
	private int marcha;
	private int velocidade = 0;
	
	@Override
	public void ligar(){
		System.out.println("Carro ligado");
	}

	@Override
	public void desligar(){
		System.out.println("Carro desligado");
	}

	@Override
	public void trocar(int marcha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarDirecao(String direcao) {
		
	}

	@Override
	public int acelerar() {
		velocidade = velocidade + 10;
		return velocidade;
	}

	@Override
	public int frear() {
		velocidade = velocidade - 10;
		if( velocidade < 0 ){
			velocidade = 0;
		}
		return velocidade;
	}

}
