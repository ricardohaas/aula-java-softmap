package edu.softmap;

public class Primo {
	public boolean isPrimo( int number){
		for( int i = 2; i < number ; i++ ){
			if( number % i == 0 ){
				System.out.println( "É divisível por " + i + " também" );
				return false;
			}
		}
		return true;
	}
}
