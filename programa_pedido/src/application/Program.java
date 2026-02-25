package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitties.Client;
import entitties.Order;
import entitties.OrderItem;
import entitties.Product;
import entitties.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDateStr = sc.next();   // lê como String, ex: "15/03/1985"

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = null;

		try {
		    birthDate = dateFormat.parse(birthDateStr);
		} catch (ParseException e) {
		    System.out.println("Formato de data inválido! Usando data atual.");
		    birthDate = new Date();
		}
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			System.out.print("Product name:");
			String productName = sc.next();
			
			System.out.print("Product Price: ");
			double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product p = new Product(productName, price);
			OrderItem item = new OrderItem(p, quantity, price);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order.orderSummary());
		
		
		
		
		
		sc.close();

	}

}
