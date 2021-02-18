package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner
		
		Funcionario fun = new Funcionario(); 
		
		System.out.println("Informe os dados: ");
		System.out.println("Informe o nome do funcionario: ");
		fun.Name = sc.next();
		System.out.println("Informe o salario bruto: ");		
		fun.Salario = sc.nextDouble();
		System.out.println("Informe o valor da taxa: ");
		fun.Taxa = sc.nextDouble();
		fun.NetSalary();
		
		System.out.printf("Funcionario: " + fun);
		System.out.println();
		System.out.println("Infome a porcentagem para aumentar no salario: ");
		double tax = sc.nextDouble();
		fun.IncreaseSalary(tax);
		System.out.println("Salario atualizado: " + fun);
		
		
		
		
		
		
		sc.close();
	}

}
