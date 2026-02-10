package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] idade = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextDouble();
		}
		
		double idadeMaisVelha = idade[0];
		String pessoaMaisVelha = name[0];
		
		
		for(int i = 1; i<n; i++) {
			if(idade[i] > idadeMaisVelha) {
				idadeMaisVelha = idade[i];
				pessoaMaisVelha = name[i];
				
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);
		
		sc.close();
	}

}
