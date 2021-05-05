package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDolar {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner
		
		System.out.println("Qual a cotação do dollar hoje?" );		
		double price = sc.nextDouble();
		System.out.println("Quantos dolares a ser comprado?");
		double quantity = sc.nextDouble();
		double total = CurrencyConverter.amount(quantity, price); 
		System.out.printf("Total as ser pago em reais = R$%.2f%n", total);
		
		
		
		sc.close();
		

	}

	
	
}
