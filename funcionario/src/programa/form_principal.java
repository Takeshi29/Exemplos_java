package programa;
import java.util.Scanner;

import funcionario.Dados_Funcionario;

public class form_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	Dados_Funcionario func1;
	func1      = new Dados_Funcionario();
	
	System.out.print("Entre com o nome do funcion�rio:");
	func1.nome = sc.nextLine();
	
	System.out.print("Entre com o sal�rio bruto:");
	func1.salario_bruto = sc.nextDouble();
	
	System.out.print("Entre com a taxa:");
	func1.taxa = sc.nextDouble();
	
	System.out.println("Empregado "+func1.nome+" , R$ "+ String.format("%.2f",func1.SalarioLiquido()));
	
	System.out.print("Entre com o percentual de aumento:");	 
	
	System.out.print("Sal�rio atualizado: "+func1.nome+" , R$ "+String.format("%.2f",func1.AumentoSalario(sc.nextDouble())));
		
	sc.close();
	}

}
