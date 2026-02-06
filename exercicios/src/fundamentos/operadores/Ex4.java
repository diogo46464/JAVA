package fundamentos.operadores;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
	
		Scanner entrada =  new Scanner(System.in);
		
		double valorP, result1, result2;
		
		System.out.print("Digite um valor presente :");
		valorP = entrada.nextDouble();
		
		result1 = Math.pow(valorP, 2);
		result2 = Math.pow(valorP, 3);
		

		System.out.println("O resultdado do valor ao quadrado é: " + result1 + " \n O resultdado do valor ao cubo é: " + result2);

		entrada.close();
		
	}
	
	

}
