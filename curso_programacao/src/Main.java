import java.util.Locale;

public class Main {

	public static void main(String[] args) {
        
	      int y = 32;
	      double x = 10.35784;
	      System.out.println(y);	     
	      Locale.setDefault(Locale.US);
		  
	      System.out.printf("%.4f%n",x);
		  
		  System.out.println("Resultado = " + x + " METROS");
		  
		  System.out.printf("Resultado = %.2f metros%n", x);
	}

}
