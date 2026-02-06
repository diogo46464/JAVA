package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCaclculadora {
	
	public static void main(String[] args) {
		// Ler num1
		// Ler nm2
		// + - * / %
		
		Scanner entrada = new Scanner (System.in);
		
		double x, y;
		String op;
		
		
		System.out.println("Digite o primeiro numero");
		x = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero");
		y = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		 op = entrada.next();
		 
		 
		 // Lógica
		 double resultado = "+".equals(op)? x + y :0;
		 resultado = "-".equals(op)? x - y : resultado;
		 resultado = "*".equals(op)? x * y : resultado;
		 resultado = "/".equals(op)? x / y : resultado;
		 resultado = "%".equals(op)? x % y : resultado;
		 
		 System.out.printf("%.2f %s %.2f = %.2f"
				 , x, op, y, resultado);
		


		entrada.close();
	}

}
