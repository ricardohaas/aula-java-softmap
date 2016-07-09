package edu.softmap.exercicioCarro;

import edu.softmap.painel.Cambio;
import edu.softmap.painel.Ignicao;
import edu.softmap.painel.Painel;

public class Motorista {
	public static void main(String[] args ){
		Motorista joao = new Motorista();
		Mustang carro = new Mustang();
		joao.trocarMarcha(carro, 1);
		joao.trocarMarcha(carro, 2);
		joao.ligar(carro );
		joao.ligar(carro );
		joao.virarVolante(carro, "direita" );
	}
	
	private void virarVolante(Painel carro, String direcao) {
		carro.mudarDirecao( direcao );
	}

	private void trocarMarcha(Painel carro, int marcha){
		carro.trocar( marcha );
	}
	
	private void ligar(Painel carro ){
		carro.ligar();
	}
}
