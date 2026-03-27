package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			
			String line = br.readLine();
			while(line != null) {
				
				String [] fields = line.split(",");
				if (fields.length < 3) {
				    line = br.readLine();
				    continue;
				}
				String name = fields[0];
				String email = fields[1];
				Double sal = Double.parseDouble(fields[2]);
				
				list.add(new Employee(name,email,sal));
				line = br.readLine();
		     	}
			
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + salary + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n" , sum );
			
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
