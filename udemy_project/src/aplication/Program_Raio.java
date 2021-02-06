package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program_Raio {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner	
		
		Calculator calc = new Calculator();
		System.out.println("Informe o diamentro: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
	
	

}
