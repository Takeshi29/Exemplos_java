package Aluno;

public class dados_aluno {
	
	public String Nome;
	public Integer N1;
	public Integer N2;
	public Integer N3;
	
	public Integer SomaNotas() {  	
		return (N1+N2+N3);	
	}
	
	public String passou(){
		
		Integer soma_notas;		
		soma_notas = (N1+N2+N3);
		
		if (soma_notas >= 60) {
		return "Passou!!! :)" ;	
		}
		else
		return ("Reprovado!! :/");
	}
	
	public Integer calcula_pontos_faltantes() {
		return 60 - (N1+N2+N3);
	}
	
}
