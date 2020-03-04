package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class front {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #"+n+" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			
			if (ch == 'c') {
				list.add(new Product(name, price));	
			}
			else if (ch == 'i') {
				System.out.print("customs fee:");
				Integer customsfee = sc.nextInt(); 
				list.add(new ImportedProduct(name, price,customsfee));	
			}
			else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price,date));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		 
		
		sc.close();
	}

}
