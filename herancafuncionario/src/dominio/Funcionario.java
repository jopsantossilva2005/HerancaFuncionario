package dominio;

public class Funcionario extends Pessoa {
	private double salario;
	
	public Funcionario(String nome, int idade, Endereco endereco, double salario) {
		super(nome, idade, endereco);
		this.salario = salario;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println(this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
