package entidade;

public class empregado {

	private int id;
	private String name;
	private Double salario;

	public empregado(int id, String name, Double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public void AumentoSalario(double percentual) {
		salario = (salario + (salario * (percentual / 100)));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}

}
