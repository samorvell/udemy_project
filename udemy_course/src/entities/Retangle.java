package entities;

public class Retangle {

	public double b; //base
	public double h; //altura
	
	
	public double area() {
		
		double p = b * h;
		return p;
	}
	
	public double perimetro() {
		
		double p = 2 * (b + h);
		return p;
	}
	
	public double diagonal() {
		
		double p =  Math.sqrt(Math.pow(b, 2)+(Math.pow(h, 2))); 
		return p;
	}
}
