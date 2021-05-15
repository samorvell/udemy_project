package entities;

public class Product {
		
	
	public String name;
	public double price;
	public int quantity;

	public Product(String name, double price, int quantity){ //esse construtor foi criado para forçar a incialização das variaveis com valores, para não correr risco de criar produtos sem atributos
		this.name = name; // this. refere-se ao atributo da classe, sem o this. a variavel local
		this.price = price;
		this.quantity = quantity;


	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unidades, Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}
}
