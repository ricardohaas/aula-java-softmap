package edu.softmap;

public class Primo {
	public boolean isPrimo( int number){
		for( int i = 2; i < number ; i++ ){
			if( number % i == 0 ){
				System.out.println( "� divis�vel por " + i + " tamb�m" );
				return false;
			}
		}
		return true;
	}
}
