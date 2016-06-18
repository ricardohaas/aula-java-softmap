package edu.softmap;

public class Arrays {

	public static void main(String[] args) {
		Ponto[] trajeto = new Ponto[100];
		trajeto[0] = new Ponto(1,2);
		System.out.println( trajeto[0]);
		
		int arrayInteirosJaInicialiado[] = {1,2,3,4,5};
		System.out.println( arrayInteirosJaInicialiado );
		
		int arrayMultidimensoesNesteCasoDuas[][] = {{1,2,3},{4,5,6},{7,8,9,10}};
	}

}
