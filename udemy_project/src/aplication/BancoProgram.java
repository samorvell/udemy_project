package aplication;

import util.Account;
import java.util.Locale;
import java.util.Scanner;

public class BancoProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);//atualização localização
        Scanner sc = new Scanner(System.in); //criação do scanner

        //numero da conta
        System.out.println("Entre com os dados a seguir: ");
        System.out.print("Informe o numero da conta: ");
        int numberac = sc.nextInt();

        //nome do titular
        System.out.print("Inform o nome do titular da conta: ");

        String titularac = sc.nextLine();

        //se terar deposito inicial
        System.out.print("Deposito inicial (S/N)? ");
        String temdepoini = sc.nextLine();

        Account account = new Account(numberac, temdepoini, titularac);

        System.out.print("teste " + account.getTemdepoini());

        //apresentar os dados da conta
        System.out.print("Dados da conta: " + account);


        //
        System.out.println("Informe o valor do deposito: ");
        double deposit = sc.nextDouble();

        System.out.println("Dados atualizado da conta:");

        System.out.println("Informe o valor a ser sacado da conta: ");
        double saque = sc.nextDouble();
        System.out.println("Dados da conta atualizados: ");




        sc.close();

    }
}

