package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramCircumference {

	
	//Samuel Amaro da Silva
	//V 0.02
	//public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner
		//Calculator calc = new Calculator(); Removido após mudar para statico na classe Calculator, não preciso estanciar o objeto da calsso Calculator
		
		System.out.println("Informe a circunferencia: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); //Chamado direto o a Classe Calculator.circumference deixando necessidade de estanciar um objeto da classe
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n ", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("Valor do PI: %.2f%n ", Calculator.PI);
		
		
		sc.close();
		
		
	}
	
	
}
