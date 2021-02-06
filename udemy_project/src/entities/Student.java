package entities;

public class Student {

	public double nota1;
	public double nota2;
	public double nota3;
	
	
	
	
	public double resultFinal() {
		
		return nota1 + nota2 + nota3;
		
	}
	
	public double pontosFaltantes() {
		
			if (resultFinal() < 60.00) {
				return 60.0 - resultFinal();
			}
			else {
				return 0.0;
			}
	}
	
	
	
}
