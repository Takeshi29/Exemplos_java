package entidade;

public class aluguel {
	
	String nome;
	String email;
	Integer n_quarto;
	
	public aluguel(String nome, String email, Integer n_quarto) {
		this.nome = nome;
		this.email = email;
		this.n_quarto = n_quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getN_quarto() {
		return n_quarto;
	}

	public void setN_quarto(Integer n_quarto) {
		this.n_quarto = n_quarto;
	}
	
}
