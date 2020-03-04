import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;
import entities.client;

public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.nextLine());

		client client = new client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + n + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productname = sc.nextLine();
			
			System.out.print("Product price: ");			
			Double productPrice = sc.nextDouble();

			Product product = new Product(productname, productPrice);

			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);

		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
