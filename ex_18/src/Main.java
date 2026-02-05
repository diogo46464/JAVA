import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valorSalario;
		
		valorSalario = sc.nextDouble();
		
		double calculoSalario;
		
		
		if( valorSalario <= 2000.00) {
			calculoSalario = 0.0;
		}
		else if(valorSalario <= 3000.00) {
			
			 calculoSalario = (valorSalario - 2000.0) * 0.08;
 		}
		else if(valorSalario <= 4500.0) {
			calculoSalario = (valorSalario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			calculoSalario = (valorSalario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
		}
		
		if(calculoSalario == 0.0) {
			System.out.println("Isento");
		}
		else {
				System.out.printf(" R$ %.2f%n", calculoSalario);
		}
		
		sc.close();
	}

}
