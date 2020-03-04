
public class exercicio {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";		
		int age = 30;
		int code = 5290;
		char gender = 'F';		
		Double price1 = 2100.0;
		Double price2 = 650.50;
		double measure = 53.234567;
	
	System.out.printf("Products:%nComputer, which price is $ %.2f", price1);
	System.out.printf("%nOffice desk, which price is $ %.2f", price2);	
	System.out.printf("%nRecord: %d years old, code %d and fender: %s", age, code, gender);
	System.out.printf("%nMeasue with eigth decimal places: %.8f%n", measure);
	System.out.printf("Rouded (three decimal places): %.3f%n", measure);
	System.out.printf("US decimal point: %.3f%n", measure);
	}

}
