import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for(int i = 1; i <= N; i++) {
			
			int n = i ;
			int n2 = i * i;
			int n3 = i * i * i;
			
			System.out.println(n +" " + n2 + " " + n3);
		}
		
		sc.close();
		
	}
}
