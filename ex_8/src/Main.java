import java.util.Locale;
import java.util.Scanner;

public class Main {
		
			public static void main(String[] args) {
				
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				int qtdPeca1, qtdPeca2, cod1, cod2;
				double valorUnitario1, valorUnitario2, valorAPagar;
				
				cod1 = sc.nextInt();
				qtdPeca1 = sc.nextInt();
				valorUnitario1 = sc.nextDouble();
				
				cod2 = sc.nextInt();
				qtdPeca2 = sc.nextInt();
				valorUnitario2 = sc.nextDouble();
				
			   valorAPagar =  valorUnitario1 * qtdPeca1 + valorUnitario2 *  qtdPeca2 ;
				
				System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
	
				
				sc.close();
				
			}
	
}
