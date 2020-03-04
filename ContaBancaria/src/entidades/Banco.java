package entidades;

public class Banco {

	private int number_account;
	private String name;
	private double saldo;
	
	public Banco(int number_account, String name, double dopositoinicial) {
		this.number_account = number_account;
		this.name = name;
	    Deposito(dopositoinicial);
	}
	
	public void Deposito(double valor) {
	   saldo += valor;	
	}	
	
	public void Saque(double valor) {
		   saldo -= valor;
		   saldo -= 5;
		}	
	
	public Banco(int number_account, String name) {
		this.number_account = number_account;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getNumber_account() {
		return number_account;
	}
	
	public String toString() {
		return "Nome: "+ name
		         +" Número da conta: "+ number_account 
		         +" Saldo da conta R$: "+saldo;
		
	}

}
