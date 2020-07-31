package q21;

import java.util.Date;

public class TestePessoa {

	public static void main(String[] args) {
		q21.Pessoa pessoa1 = new q21.Pessoa("Albert Einstein");
		pessoa1.ajustaDataDeNascimento(14, 3, 1879);
		pessoa1.cauculaIdade(20, 7, 2020);
		q21.Pessoa pessoa2 = new q21.Pessoa("Isaac Newton");
		pessoa2.ajustaDataDeNascimento(4, 1, 1643);
		pessoa2.cauculaIdade(20, 7, 2020);

		System.out.println("Idade de " + pessoa1.informaNome() + " seria " + pessoa1.informaIdade());
		System.out.println("Idade de " + pessoa2.informaNome() + " seria " + pessoa2.informaIdade());

	}

}
