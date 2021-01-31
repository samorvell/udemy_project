package aplication;

import java.util.Locale;
import java.util.Scanner;


import entities.Triangle;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualiza��o localiza��o
		Scanner sc = new Scanner(System.in);//cria��o do scanner	
		
		Triangle x, y;
		
		//double xA, xB, xC, yA, yB, yC; //declara��o das variaveis
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Inform as medidas do triangulu X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		//xA = sc.nextDouble(); //atribuindo os valores digitado no teclado as variaveis
		//xB = sc.nextDouble();
		//xC = sc.nextDouble();
		
		System.out.println("Informe as medidas do triangul Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		//yA = sc.nextDouble();
		//yB = sc.nextDouble();
		//yC = sc.nextDouble();
		
		
		//logica da cria��o do triangulo e saber qual � o maior deles
		//double p= (xA + xB + xC) / 2.0; 
		//double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		double areaX = x.area();
		
		//p = (yA + yB + yC) / 2.0;
		//double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Triangulo X tem a maior area");
		}
		else {
			System.out.println("Triangulo Y tem a maior area");
		}
		
		sc.close();
		
		
		
		

	}

}
