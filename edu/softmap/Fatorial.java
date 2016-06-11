package edu.softmap;

public class Fatorial {
	public int getFatorial( int i ){
		if( i == 1 ){
			return 1;
		}
		return i * getFatorial( i -1 );
	}
}
