package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name,anualIncome,healthExpenditures));
			}
			
			if(ch == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				
				list.add(new Company(name,anualIncome,numberOfEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;

		for (TaxPayer taxPayer : list) {
		    double tax = taxPayer.tax();
		    System.out.println(taxPayer.getName() + ": $ " 
		            + String.format("%.2f", tax));
		    sum += tax;
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f%n", sum);
		
		sc.close();
	}

}
