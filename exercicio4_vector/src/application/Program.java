package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("NUMEROS PARES: ");
		for(int i= 0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		
		int maiorPosicao = 0;
		
		for(int i = 0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				maiorPosicao++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDA DE PARES: " + maiorPosicao);
	
		
		
		
		sc.close();

	}

}
