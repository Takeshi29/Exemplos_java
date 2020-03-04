import java.util.Scanner;

public class ler_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    Scanner sc = new Scanner(System.in);
    
    char x;
    x = sc.next().charAt(0);
    System.out.println("Você digitou: " + x);
      
    sc.close();
    
	}

}
