package q22;

public class Funcionario {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private int idade;
	private String cpf;
	private String cargo;
	private float salario;
	
	public Funcionario(String nome,
		String dataNascimento,
		String sexo,
		int idade,
		String cpf,
		String cargo) {
		
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setCargo(cargo);

		switch (cargo) {
		case "diretor":
			this.salario = 10500;
			break;
			
		case "gerente":
			this.salario = 6200;
			break;
		case "supervisor":
			this.salario = 3500;			
			break;

		default:
			break;
		}
	}

	public void inprimeDados() {
		System.out.println(
				this.getNome() +" " +
				this.getDataNascimento() +" " +
				this.getSexo() +" "+
				this.getIdade() +" "+
				this.getCpf() +" "+
				this.getCargo() +" "+
				this.getSalario()
				);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
