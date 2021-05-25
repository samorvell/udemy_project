package util;

public class Account {

    private static final double TAX = 5.00;

    private int number; //numero da conta
    private String holder; //titular
    private double balance; //saldo


    public  Account(){

    }

        public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;

    }

    public Account(int number, String holder, double initdeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initdeposit);

    }

    public double getnumber(int number) {
        return this.number = number;
    }

    public String getholder(String holder) {
        return this.holder = holder;
    }

    public double getBalance(double balance) {
        return balance;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + TAX;
    }

    public String toString() {
        return "Account: " + number
                + ", "
                + "Holder: "
                + holder
                + ", Saldo $ "
                + String.format("%.2f", balance);
    }

}




