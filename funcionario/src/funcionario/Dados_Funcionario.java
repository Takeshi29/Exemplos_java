package funcionario;

public class Dados_Funcionario {
	
	public String nome;
    public double salario_bruto;
    public double taxa;
    
    public double SalarioLiquido(){
    	return (salario_bruto - taxa);
    }

    public double AumentoSalario(double percentual) {
    	return (salario_bruto + (salario_bruto * (percentual / 100))) - taxa;
    }
}
