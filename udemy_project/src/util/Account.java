package util;

public class Account {

    private static final double TAX = 5.00;

    private int numberac; //numero da conta
    private String temdepoini;
    private String titularac; //titular
    private double deposit; //deposito inicial
    private double balance; //saldo
    private double withdraw; //saque

    public  Account(){

    }

    public Account(int numberac, String titularac, double initdeposit, double balance) {
        this.numberac = numberac;
        this.titularac = titularac;
        this.deposit = initdeposit;
        this.balance = balance;
    }

    public Account(int numberac, String titularac, double balance) {
        this.numberac = numberac;
        this.titularac = titularac;
        this.balance = balance;
    }

    public Account(int numberac, String titularac, String temdepoini) {
        this.numberac = numberac;
        this.titularac = titularac;
        this.temdepoini = temdepoini;
    }

    public double getNumberac(int numberac) {
        return this.numberac = numberac;
    }

    public String getTitularac(String titularac) {
        return this.titularac = titularac;
    }

    public double getBalance(double balance) {
        return this.balance = balance;
    }

    public void setTitularac(String titularac) {
        this.titularac = titularac;
    }

    public String getTemdepoini() {
        return this.temdepoini = temdepoini;
    }

    public String toString() {
        return "Account: " + numberac
                + ", "
                + "Holder: "
                + titularac
                + ", $ "
                + String.format("%.2f", balance);
    }

}




