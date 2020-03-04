import java.util.Locale;
import java.util.Scanner;

import entidade.aluguel;

class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
   System.out.println("Entre com total de quartos");  
   int n = sc.nextInt();
   String nome;
   String email;
   Integer quarto;
   
   aluguel[] vect = new aluguel[n];
   
   for (int i=0; i<3; i++) {   
   System.out.println("");  
   System.out.println("Entre com os dados da locatario: Nome, e-mail e número do quarto:");
   System.out.println("");
   System.out.println("Nome:");
   
   nome = sc.next();
   System.out.println("");
   System.out.println("E-mail:");  
   email = sc.next();
   System.out.println("");
   System.out.println("Quarto:");

   quarto = sc.nextInt();
   
   vect[quarto] = new aluguel(nome,email,quarto);
   }
   
   System.out.println("");
   System.out.println("Quartos ocupados:");
   System.out.println("");
   for (int i=0; i<vect.length; i++) {
	   
	   if (vect[i] != null) {
		   System.out.println("");
		   System.out.println(Integer.toString(i)+" - " + vect[i].getNome()+", "+vect[i].getEmail());
		   
	   }
   }
    sc.close();		
	}

}
