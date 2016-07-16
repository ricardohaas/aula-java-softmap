package edu.softmap.exercicio23;

import java.util.ArrayList;

import edu.softmap.exercicio23.SistemaSolar.Planeta;

public class SistemaSolar {
	ArrayList<Planeta> planetas = new ArrayList<Planeta>();
	
	class Planeta{
		String nome;
		long distanciaSolKm;
		
		public Planeta(String nome, long distanciaSolKm ){
			this.nome = nome;
			this.distanciaSolKm = distanciaSolKm;
		}
		
		public String toString(){
			return "Planeta: "+ nome + ", distância em km: "+ distanciaSolKm;	
		}
		
		public boolean equals( Planeta p){
			if( !(p instanceof Planeta)){				
				return false;	
			}
			
			if( nome.equals( p.nome ) && distanciaSolKm == p.distanciaSolKm){
				return true;
			}
			
			return false;
		}
	}
	
	public SistemaSolar(){
		planetas.add( criarPlaneta( "Mercúrio", 1000 ));
		planetas.add( criarPlaneta( "Vênus", 2000 ));
		planetas.add( criarPlaneta( "Terra", 3000 ));
		planetas.add( criarPlaneta( "Marte", 4000 ));
		planetas.add( criarPlaneta( "Jupiter", 5000 ));
		planetas.add( criarPlaneta( "Saturno", 6000 ));
		planetas.add( criarPlaneta( "Urano", 7000 ));
		planetas.add( criarPlaneta( "Netuno", 8000 ));
	}
	
	public Planeta criarPlaneta( String nome, long distanciaSolKm){
		Planeta p = new Planeta( nome, distanciaSolKm );
		return p;
	}
	
	public static void main(String[] args) {
		SistemaSolar sistema = new SistemaSolar();
		
		Planeta meuPlaneta = sistema.criarPlaneta("Terra",3000);
		
		for( int i = 0; i < sistema.planetas.size() ; i++ ){
			Planeta planeta = sistema.planetas.get( i );
			System.out.println( planeta );
			if( meuPlaneta.equals( planeta) ){
				System.out.println("Encontrei meu planeta" + planeta );
			}
		}
	}
	
	

}
