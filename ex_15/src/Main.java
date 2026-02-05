import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int codItem, qtdItem;
		
		codItem = sc.nextInt();
		qtdItem = sc.nextInt();
		
		double totalAPagar = 0;
		
		if(codItem == 1) {
			
			totalAPagar = qtdItem * 4.0;
		}
		else if(codItem == 2) {
			totalAPagar = qtdItem * 4.50;
		}
		else if(codItem == 3) {
			totalAPagar = qtdItem * 5.00;
		}
		else if(codItem == 4) {
			totalAPagar = qtdItem * 2.00;
		}
		else if(codItem == 5) {
			totalAPagar = qtdItem * 1.50;
		}
		else {
			System.out.println("Código inválido!");
		}
		
		System.out.printf("Total: R$ %.2f%n", totalAPagar);
		
		
		
		sc.close();
	}
}
