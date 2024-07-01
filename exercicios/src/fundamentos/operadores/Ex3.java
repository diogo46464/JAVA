package fundamentos.operadores;

import java.util.Scanner;

public class Ex3 {

	/** 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC. */
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		double altura, peso, IMC;
		
		System.out.println("Digite o peso do produto: ");
		peso = entrada.nextDouble();
		
		
		System.out.println("Digite a altura do produto: ");
		altura = entrada.nextDouble();
		
		
		IMC = peso/Math.pow(altura, 2);
		
		System.out.printf("O IMC do produto é :%.2f" , IMC);
		
		entrada.close();
		
		
	}
	
}
