package dollar_calculator;

public class calculator {

	public static final double price_dollar = 3.10;
	public static final double iof = 0.06;
	
	public static double CurrencyConverter(double valor) {
		
		return valor * price_dollar * (1.0 + iof) ;
	}
	

	}

