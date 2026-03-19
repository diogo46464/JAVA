package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Alunos> set = new HashSet<>();
		
		System.out.print("How many students for course A ?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int codigo = sc.nextInt();
			Alunos alunos = new Alunos(codigo);
			set.add(alunos);	
		}
		
		System.out.print("How many students for course B ?");
		int m = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			int codigo = sc.nextInt();
			Alunos alunos = new Alunos(codigo);
			set.add(alunos);	
		}
		System.out.print("How many students for course C ?");
		int o = sc.nextInt();
		
		for(int i = 0; i < o; i++) {
			int codigo = sc.nextInt();
			Alunos alunos = new Alunos(codigo);
			set.add(alunos);	
		}
		
		System.out.println("Total students: " + set.size());
		
		
		sc.close();

	}

}
