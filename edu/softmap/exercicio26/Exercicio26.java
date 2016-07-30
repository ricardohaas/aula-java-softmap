package edu.softmap.exercicio26;

import java.util.Calendar;

public class Exercicio26 {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		System.out.println( cal.getTime() );
		cal.add(cal.DAY_OF_YEAR, -7 );
		System.out.println( cal.getTime() );
	}
}
