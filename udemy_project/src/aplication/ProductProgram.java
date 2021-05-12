package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner	
		
		Product product = new Product();		
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantide em estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		System.out.print("Informa a quantidade de produtos a adicionar no estoque: ");
		int quantity = sc.nextInt();
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