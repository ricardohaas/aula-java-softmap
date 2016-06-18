package edu.softmap;

public class Ponto {
	int x;
	int y;
	
	public String toString(){
		return "p("+ this.x +"," +this.y + ")";
	}
	
	public Ponto( int x, int y){
		this.x = x;
		this.y = y;
	}
}
