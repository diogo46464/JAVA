import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	    	Locale.setDefault(Locale.US);
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int numeroFuncionario, horaTrabalhada;
	    	double valorPorHora;
	    	
	    	numeroFuncionario = sc.nextInt();
	    	horaTrabalhada = sc.nextInt();
	    	valorPorHora = sc.nextDouble();
	    	
	    	double salario = horaTrabalhada * valorPorHora;
	    	
	    	System.out.println("NUMBER = " + numeroFuncionario);
	    	System.out.printf("SALARY = U$ %.2f%n", salario );
	
	    	
	    	sc.close();
	}

}
