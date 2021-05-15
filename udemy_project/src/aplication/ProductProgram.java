package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner	
		
		//Product product = new Product(); essa estancia saí daqui, para ser criado após a informação das variaveis

		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantide em estoque: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		System.out.print("Informa a quantidade de produtos a adicionar no estoque: ");
		quantity = sc.nextInt(); //retirado o tipo da variavel, pois já foi informada anteriomente.
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados do produto atualizados: " + product);
		
		System.out.println();
		System.out.print("Informa a quantidade de produtos a subtrair no estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados do produto atualizados: " + product);
		
	
		sc.close();

	}

}