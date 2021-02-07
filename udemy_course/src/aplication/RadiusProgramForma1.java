package aplication;

import java.util.Locale;
import java.util.Scanner;

public class RadiusProgramForma1 {

	
	public static double PI= 3.14159; //Constantes sempre em letras maiusculas
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);//atualiza��o localiza��o
		Scanner sc = new Scanner(System.in);//cria��o do scanner
		
		System.out.println("Informe o raio: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", PI);
		
		
		
		sc.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}