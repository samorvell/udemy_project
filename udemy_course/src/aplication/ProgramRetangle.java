package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner
		
		Retangle retangle; //b base, h altura
		retangle = new Retangle();
		
		
		System.out.println("Informe a base e a altura do retangulo : ");
		retangle.h = sc.nextDouble();
		retangle.b = sc.nextDouble();
		
		double area = retangle.area();
		double perimetro = retangle.perimetro();
		double diagonal = retangle.diagonal();
		
		System.out.println("--------------------------------------------------");
		System.out.printf("Valor da area do retangulo: %.2f%n ", area);
		System.out.println();
		System.out.printf("Valor do perimetro do retangulo: %.2f%n ", perimetro);
		System.out.println();
		System.out.printf("Valor da diagonal do retangulo: %.2f%n ", diagonal);

		
		sc.close();
	}

}
