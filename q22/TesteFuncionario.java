package q22;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario [] funcionarios = new Funcionario[4];
		
		for (int i =0 ; i< 4; i++) {
			
			System.out.println("Digite o nome do " + (i+1) + "º funcionario");
			
			Scanner input = new Scanner(System.in);
			System.out.println("Digite nome: ");
			String nome = input.next();
			System.out.println("Digite data de nascimento: ");
			String nascimento = input.next();
			System.out.println("Digite sexo: ");
			String sexo = input.next();
			System.out.println("Digite idade: ");
			int idade = Integer.parseInt(input.next());
			System.out.println("Digite cpf: ");
			String cpf = input.next();
			System.out.println("Digite cargo: ");
			String cargo = input.next();
		
			funcionarios[i] = new Funcionario(nome, nascimento, sexo, idade, cpf, cargo);
			
		
		}

		
		for (Funcionario func : funcionarios) {
			func.inprimeDados();
		}
	}
	
}
