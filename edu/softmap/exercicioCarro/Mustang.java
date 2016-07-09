package edu.softmap.exercicioCarro;

import edu.softmap.painel.*;

public class Mustang implements Painel{
	private int marcha = 1;
	private int velocidade = 0;
	private boolean ligado = false;
	private String mudarDirecao;
	
	@Override
	public void ligar(){
		if( ligado ){			
			System.out.println("Carro já está ligado!");
			return;
		}
		
		this.ligado = true;
		System.out.println("Carro ligado!");
	}

	@Override
	public void desligar(){
		if( !ligado ){			
			System.out.println("Carro já está desligado!");
			return;
		}
		
		this.ligado = true;
		System.out.println("Carro desligado!");
	}

	@Override
	public void trocar(int marcha) {
		if( marcha == this.marcha ){
			System.out.println( "Já está na marcha " + marcha);
			return;
		}
		
		this.marcha = marcha;
		System.out.println( "Marcha alterada para " + this.marcha );
		
	}

	@Override
	public void mudarDirecao(String direcao) {
		this.mudarDirecao = direcao;
		System.out.println( "Nova direcao " + direcao );
	}

	@Override
	public int acelerar() {
		velocidade = velocidade + 10;
		System.out.println( "Velocidade: " + velocidade );
		return velocidade;
	}

	@Override
	public int frear() {
		velocidade = velocidade - 10;
		if( velocidade < 0 ){
			velocidade = 0;
		}
		System.out.println( "Velocidade: " + velocidade );
		return velocidade;
	}

}
