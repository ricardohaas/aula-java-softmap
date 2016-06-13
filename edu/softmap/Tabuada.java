package edu.softmap;

import javax.swing.JOptionPane;

public class Tabuada {
	/**
	 * Print numbers multiples of m and lower n
	 * @param m 
	 * @param n
	 */
	public void printMultiples( int m, int n){
		for( int i = 1; i < n; i++  ){
			if( i % m == 0 ){
				System.out.println( i+ " é um número múltiplo de " + m + " e menor que " + n);
			}
		}
	}
}
