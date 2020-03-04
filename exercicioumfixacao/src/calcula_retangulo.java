import entidades.rectangulo;
import java.util.Scanner;

public class calcula_retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
	    rectangulo x; 
				
		x  = new rectangulo();
		x.width  = sc.nextDouble();
		x.heigth = sc.nextDouble();
		
		System.out.println("Area      = " + x.area());
		System.out.println("Perimeter = " + x.perimetro());
		System.out.println("Diagonal  = " + x.diagonal());
		
		
		sc.close();
	}

}
