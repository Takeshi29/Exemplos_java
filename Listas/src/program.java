import java.util.Scanner;
import entidade.empregado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<empregado> list = new ArrayList<>();
		
		System.out.print(" Quantos funcionários deseja cadastrar ? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			list.add(new empregado(id, nome , salario));
			
			System.out.println();
			System.out.print("Entre com o id do funcionário que terá aumento: ");
			id = sc.nextInt();
			empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("Este id não existe!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.AumentoSalario(percentage);
			}
			
			// PART 3 - LISTING EMPLOYEES:
			
			System.out.println();
			System.out.println("List of employees:");
			for (empregado obj : list) {
				System.out.println(obj);
			}
					
			sc.close();
		}
	}

}
