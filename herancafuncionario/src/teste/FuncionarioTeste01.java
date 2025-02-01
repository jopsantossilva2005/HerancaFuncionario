package teste;

import dominio.Endereco;
import dominio.Funcionario;

public class FuncionarioTeste01 {

	public static void main(String[] args) {
		Endereco end = new Endereco("Rua caju", "30A");
		Funcionario funcionario = new Funcionario("JP", 19, end, 2500.00);
		
		funcionario.imprimir();

	}

}
