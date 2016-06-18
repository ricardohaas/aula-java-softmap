package edu.softmap;

public class AreaDoTrianguloRetangulo {
	double base;
	double altura;
	double area;
	double hipotenusa;
	
	public AreaDoTrianguloRetangulo( double base, double altura){
		this.base = base;
		this.altura = altura;
		this.calculateArea();
		this.calculateHipotenusa();
	}
	
	public void calculateArea(){
		this.area = base * altura / 2.00;
	}
	
	public void calculateHipotenusa(){
		
		this.hipotenusa = Math.sqrt( this.base * this.base + this.altura * this.altura  );
	}
	
	public String toString(){
		String response = "";
		response = "Base: " + this.base + "\n";
		response += "Altura: " + this.altura + "\n";
		response += "Area: " + this.area + "\n";
		response += "Hipotenusa: " + this.hipotenusa + "\n";
		return response;
	}
}
