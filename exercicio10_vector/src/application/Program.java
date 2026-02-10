package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Digite o nome, primeira e segunda nota de " + (i +1) + "o aluno: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		double media = 0.0;
		String alunosAprovados = " ";
		
		for(int i =0; i<n; i++) {
			
			media = (nota1[i] + nota2[i]) / 2.0;
			
			if(media >= 6.0) {
				 alunosAprovados += name[i] + "\n";
			}
			
		}
		
		
		System.out.println("Alunos aprovados: ");
		System.out.print(alunosAprovados);
		
		sc.close();

	}

}
