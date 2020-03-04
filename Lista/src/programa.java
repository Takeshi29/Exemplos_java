import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import entidade.empregado;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<empregado> list = new ArrayList<>();

		System.out.print("Quantos funcionários deseja cadastrar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Qual o nome do funcionário ?");
			String nome = sc.next();

			System.out.print("Qual o valor do salário?");
			Double salario = sc.nextDouble();

			list.add(new empregado(i, nome, salario));

		}

		System.out.print("");
		System.out.print("Qual funcionário deseja realizar o aumento?");

		int id = sc.nextInt();
		empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este funcionario não existe!");
		} else {
			System.out.print("Entre com o percentual de aumento: ");
			double percentual = sc.nextDouble();
			emp.AumentoSalario(percentual);
		}

		System.out.println();
		System.out.println("Lista de empregados:");
		for (empregado obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
