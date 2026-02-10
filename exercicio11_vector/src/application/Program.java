package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serao digitados? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa:");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa:");
			genero[i] = sc.next().charAt(0);
		}
		
		
		double menorAltura = altura[0];
		
		for(int i = 1; i<n;i++) {
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		System.out.printf("Menor Altura = %.2f%n", menorAltura);
		
		double maiorAltura = altura[0];
		
		for(int i = 1; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		
		double somaAlturasMulheres = 0.0;
		int qtdMulheres = 0;
		for(int i = 0; i<n; i++) {
			
			if(genero[i] == 'F') {
				somaAlturasMulheres += altura[i];
				qtdMulheres++;
			}
			
		}
		
		double mediaAlturasMulheres = somaAlturasMulheres / qtdMulheres;
		
		System.out.printf("Media das alturas das mulheres = %.2f ", mediaAlturasMulheres);
		
		int numeroDeHomens = 0;
		for(int  i =0; i<n; i++) {
			if(genero[i] == 'M') {
				numeroDeHomens = i;
			}
		}
		System.out.println();
		System.out.println("Numero de homens = " + numeroDeHomens);
		
		sc.close();

	}

}
