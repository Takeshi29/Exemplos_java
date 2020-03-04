package entidade;

public class empregado {
	
	private int id, percentual;
	private String name;
    private Double salario;
	
	public empregado(int id, String name, Double salario){
	    this.id = id;
		this.name = name;
		this.salario = salario;
	}	
    public double AumentoSalario(double percentual){
    	return (salario + (salario * (percentual / 100)));
    }	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPercentual() {
		return percentual;
	}
	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
