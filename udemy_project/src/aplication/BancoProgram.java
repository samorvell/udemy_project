package aplication;

import util.Account;
import java.util.Locale;
import java.util.Scanner;

public class BancoProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);//atualização localização
        Scanner sc = new Scanner(System.in); //criação do scanner
        Account account;

        //numero da conta
        System.out.println("Entre com os dados a seguir: ");
        System.out.print("Informe o numero da conta: ");
        int number = sc.nextInt();
        sc.nextLine();
        //nome do titular
        System.out.print("Nome: ");
        String holder = sc.nextLine();
        sc.nextLine();

        //se terar deposito inicial
        System.out.print("Deposito inicial (S/N)? ");
        char response = sc.next().charAt(0);
        //sc.nextLine();
        if (response == 's'){
            System.out.print("Inoforme o valor do deposito inicial: ");
            double initdeposit = sc.nextDouble();
            account = new Account(number, holder,initdeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println();
        //apresentar os dados da conta
        System.out.println("Dados da conta: " + account);




        //
        System.out.println("Informe o valor do deposito: ");
        double deposit = sc.nextDouble();
        sc.nextLine();
        account.deposit(deposit);

        System.out.println("Dados atualizado da conta:");
        System.out.println("Dados da conta: " + account);

        System.out.println("Informe o valor a ser sacado da conta: ");
        double saque = sc.nextDouble();
        account.withdraw(saque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println("Dados da conta atualizados: " + account);



        sc.close();

    }
}

