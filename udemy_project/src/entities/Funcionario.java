package entities;

public class Funcionario {

	public String Name;
	public double Salario;
	public double Salqd;
	public double Taxa;
	
	
	public double NetSalary() {
		return Salqd = Salario - Taxa;
	}
	
	public double IncreaseSalary(double percentage) {
		
		return Salqd += (Salario * percentage) / 100;
	}
	
	public String toString() {
		return Name
				+ ", $ "
				+ String.format("%.2f", Salqd);
		
	}
	
	
}
