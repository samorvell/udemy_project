package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//atualização localização
		Scanner sc = new Scanner(System.in);//criação do scanner
		
		Student stu = new Student();
		
		System.out.println("Informe as tres notas do trimestre: ");
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		
		System.out.printf("Nota final: %.2f%n", stu.resultFinal());
		
		if  (stu.resultFinal() < 60.0) {
				System.out.println("Reprovado");
				System.out.printf("Pontos restante para atingir a meta: %.2f%n", stu.pontosFaltantes());
			
		}else
		{System.out.println("APROVADO!");
			
		}		
		sc.close();

	}

}
