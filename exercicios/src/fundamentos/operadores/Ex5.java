package fundamentos.operadores;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
          
		double base, altura, area;
	
		System.out.println("Digite o valor da base do triângulo: ");
		base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		altura = entrada.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A área do triangulo é : " + area);
		
		
		
		entrada.close();
	}
	
	
}
