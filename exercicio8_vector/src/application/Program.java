package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int sum = 0;
		int countPares = 0;
		
		for(int i = 0; i<n; i++) {
			if(vect[i] % 2 ==0) {
				sum += vect[i];
				countPares++;
			}
		}
		
		if(countPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			double mediaPares = (double) sum / countPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
		}

		sc.close();

	}

}
