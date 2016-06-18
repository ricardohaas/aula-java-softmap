package edu.softmap;

public class Exercicio7 {

	public static void main(String[] args) {
		double altura = PainelValores.pedeDecimal("Digite a altura do triangulo");
		double base = PainelValores.pedeDecimal("Digite a base do triangulo");
		AreaDoTrianguloRetangulo areaDoTrianguloRetangulo = new AreaDoTrianguloRetangulo(base, altura );
		System.out.println( areaDoTrianguloRetangulo );
	}
}
