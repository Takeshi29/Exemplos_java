import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número de linhas");
		int n = sc.nextInt();
		System.out.print("Entre com o número de colunas");
		int x = sc.nextInt();
		int[][] mat = new int[n][x];

		for (int i = 0; i < mat.length; i++) {
			System.out.print("");
			System.out.print("Entre com os valores para o vetor:");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		System.out.print("");
		System.out.print("Entre com os valores que deseja varrer:");
		int z = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == z) {
					System.out.print("");
					System.out.print("| Posição: " + Integer.toString(i) + "," + Integer.toString(j));
                    
					if (j < mat[i].length-1) {
					System.out.print("");                            
					System.out.print("| Direita: " + mat[i][j+1]);}
					
					if (j > 0) {
					System.out.print("");
					System.out.print("| Esquerda: " + mat[i][j-1]);}
					
					if (i > 0) {
					System.out.print("");
					System.out.print("| Acima: " + mat[i-1][j]);}
					
					if (i < mat.length-1) {
					System.out.print("");
					System.out.print("| Abaixo: " + mat[i+1][j]);}
				}
			}

		}
		sc.close();
	}

}
