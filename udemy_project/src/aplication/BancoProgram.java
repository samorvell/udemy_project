package aplication;

import java.util.Locale;
import java.util.Scanner;

public class BancoProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);//atualização localização
        Scanner sc = new Scanner(System.in); //criação do scanner

        System.out.println("Informe o numero da conta: ");
        double account = sc.nextDouble();
        System.out.println("Inform o nome do titular da conta: ");
        String name = sc.nextLine();
        System.out.println("Deposito inicial (S/N)? ");
        String initdeposit = sc.nextLine();

        System.out.println("Dados da conta: ");


        System.out.println("Informe o valor do deposito: ");
        double deposit = sc.nextDouble();

        System.out.println("Dados atualizado da conta:");

        System.out.println("Informe o valor a ser sacado da conta: ");
        double saque = sc.nextDouble();
        System.out.println("Dados da conta atualizados: ");




        sc.close();

    }
}

