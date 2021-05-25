package util;

public class Account {

    private static final double TAX = 5.00;

    private int number; //numero da conta
    private String holder; //titular
    private double balance; //saldo


    public  Account(){

    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;

    }

    public double getnumber(int number) {
        return this.number = number;
    }

    public String getholder(String holder) {
        return this.holder = holder;
    }

    public double getBalance(double balance) {
        return this.balance = balance;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    public String toString() {
        return "Account: " + number
                + ", "
                + "Holder: "
                + holder
                + ", $ "
                + String.format("%.2f", balance);
    }

}




