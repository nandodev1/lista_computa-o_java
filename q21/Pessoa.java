package q21;

public class Pessoa {
	private int idade;
	private int dia;
	private int mes;
	private int anoNascimento;
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void cauculaIdade( int dia, int mes, int ano) {
		int tmpAno = ano - this.anoNascimento;
		if( mes < this.mes)
			tmpAno -= 1;
		else if(mes == this.mes) 
			if(dia <= this.dia)
				tmpAno -= 1;

		this.idade = tmpAno;
	}
	
	public int informaIdade() {
		return this.idade;
	}
	
	public String informaNome() {
		return this.nome;
	}
	
	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.anoNascimento = ano;
	}
	
}
