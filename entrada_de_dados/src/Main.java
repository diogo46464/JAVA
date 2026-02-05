import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		
		char z;
	    z = sc.next().charAt(0);
		System.out.println("Você digitou: " + z);
		System.out.println();
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble()
;
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}
}
