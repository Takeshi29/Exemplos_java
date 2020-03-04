package programa;

import Aluno.dados_aluno;
import java.util.Scanner;

public class front_aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		dados_aluno A1;
		
		A1 = new dados_aluno();				
		
		System.out.print("Entre com o nome do Aluno:");
		A1.Nome = sc.nextLine();
		System.out.print("Entre com a nota 1,2 e 3 :");
		A1.N1 = sc.nextInt();
		A1.N2 = sc.nextInt();
		A1.N3 = sc.nextInt();
		
		if (A1.passou() == "Passou!!! :)") {
		System.out.println("Nota final "+A1.SomaNotas());
		System.out.println("Aprovado");
		}
		else {
			System.out.println("Nota final "+A1.SomaNotas());
			System.out.println("Reprovado");	
			System.out.println("Falta "+  A1.calcula_pontos_faltantes());	
		}
		sc.close();
	}

}
