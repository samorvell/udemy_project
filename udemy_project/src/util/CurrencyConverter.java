package util;

public class CurrencyConverter {
	
	
	public static double  total;
	public static final double IOF = 0.06;
	
	public static double amount(double price, double quantity) {
		return price =  (price * quantity * IOF)+(price * quantity);
	}
	
	
}