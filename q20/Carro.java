package q20;

public class Carro {
	private String marca;
	private String Modelo;
	private int ano;
	private String cor;
	private int velocidade;
	
	public Carro(String marca, String Modelo, int ano, String cor) {
		this.velocidade = 0;
		this.setMarca(marca);
		this.setAno(ano);
		this.setModelo(Modelo);
		this.setCor(cor);
		
	}
	
	public void acelera() {
		this.velocidade += 1;
	}
	
	public void freiar() {
		this.velocidade = 0;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
