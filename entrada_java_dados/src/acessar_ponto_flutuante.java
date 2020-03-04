import java.util.Locale;
import java.util.Scanner;

public class acessar_ponto_flutuante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Locale.setDefault(Locale.US);		
    Scanner sc = new Scanner(System.in);
    
    double x;
    x = sc.nextDouble();
    System.out.println("Você digitou: " + x);
    System.out.printf("Você digitou: %.2f%n", x);
    
    sc.close();
    
	}

}
