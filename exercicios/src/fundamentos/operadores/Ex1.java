package fundamentos.operadores;

import java.util.Scanner;

public class Ex1 {
	
	/** 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double result, Celsius;
		
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		 Celsius = entrada.nextDouble();
		 
		 result = Celsius + 1.8 + 32;
		 
		 System.out.println("A o resultado da conversão de Celsius para Fahrenheit é: " +result);

		
		entrada.close();
		
	}

}
