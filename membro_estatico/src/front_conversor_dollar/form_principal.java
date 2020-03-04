package front_conversor_dollar;

import java.util.Scanner;

import dollar_calculator.calculator;

public class form_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dollar:"+String.format("%.2f",  calculator.price_dollar));
		System.out.println("Quantos dollares deseja comprar?");
		System.out.println("Você deve pagar em reais: "+String.format("%.2f%n",calculator.CurrencyConverter(sc.nextDouble())));
		sc.close();
	}

}
