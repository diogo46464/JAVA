import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codAlcool = 0;
		int codGasolina = 0;
		int codDiesel = 0;
		
		int codFim = sc.nextInt();

		while(codFim != 4) {
			
			if(codFim == 1) {
			 codAlcool++;
			}
			else if(codFim == 2) {
				codGasolina++;
			}
			else if(codFim == 3) {
				codDiesel++;
			}
			
			 codFim = sc.nextInt();
			
		}

	    System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + codAlcool);
		System.out.println("Gasolina: " + codGasolina);
		System.out.println("Diesel: " + codDiesel);
		
		sc.close();
		
		
	}
}
