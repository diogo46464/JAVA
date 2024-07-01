package fundamentos.operadores;

import java.util.Scanner;

public class Ex2 {
	/** 1. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		double Fahrenheit, result;
		
		
		System.out.println("Escreva a temperatura que deseja: ");
		Fahrenheit = entrada.nextDouble();

		
		result = (Fahrenheit - 32) /1.8;		
		
		System.out.println("A conversão feita é : " + result);
		
		entrada.close();
	}

}
