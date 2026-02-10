package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Dados da " + (i+1) +"a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
				
		double alturaTotal = 0.0;
		
		for(int i = 0; i<n; i++) {
			alturaTotal += altura[i];
		}
		
		double mediaAltura = alturaTotal / n;
		System.out.printf("Altura média: %.2f%n ", mediaAltura );
		
		int menoresDe16 = 0;
		for(int i = 0; i<n; i++) {
			if(idade[i] < 16) {
				menoresDe16++;
			}
		}
		
		double porcentagem = (double) menoresDe16 / n * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcentagem);
		
		for(int i = 0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		
		sc.close();

	}

}
