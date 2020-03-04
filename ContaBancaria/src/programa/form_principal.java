package programa;
import java.util.Scanner;
import java.util.Locale;
import entidades.Banco;

public class form_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do titular da conta:");
		String name = sc.nextLine();
		
		System.out.print("Entre com o número da nova conta:");
		int number_account = sc.nextInt();
		
		System.out.print("Deseja fazer um depósito inicial");
		char resposta = sc.next().charAt(0);
		
		entidades.Banco Banco;
		if (resposta == 'S') {
		System.out.print("Qual o valor do depósito:");
		double valor = sc.nextDouble();	
		 Banco = new Banco(number_account, name, valor);		
		}
		else  Banco = new Banco(number_account, name);	
		
		System.out.println("Conta criada com sucesso!");
		System.out.println();
		System.out.print(Banco);
		System.out.println();
		System.out.println("Entre com o valor do depósito: ");
		double deposito = sc.nextDouble();		
		Banco.Deposito(deposito);
		System.out.println();
		System.out.println("Depósito realizado com sucesso!");
		System.out.print(Banco);
		System.out.println();
		System.out.println("Entre com o valor do saque: ");
		double saque = sc.nextDouble();		
		Banco.Saque(saque);
		
		System.out.println();
		System.out.println("Saque realizado com sucesso!");
		System.out.print(Banco);
		
		sc.close();
	}

}
