package q20;

import q20.Carro;

public class TestaCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Honda", "Hb20", 1985, "Prata");
		Carro carro2 = new Carro("Chevrolet?","Logo",2020,"Preto");
		Carro carro3 = new Carro("Volks","Chevet",1990,"Azul");
		
		Carro [] carros = new Carro[3];
		carros [0] = carro1;
		carros [1] = carro2;
		carros [2] = carro3;
		
		for (Carro car : carros) {
			System.out.println("Marca: " + car.getMarca() + " Modelo: " + car.getModelo() + " Ano: " + car.getAno() + " Cor: " + car.getCor());
		}
		
		carros[2].setCor("Preto Metálico");

		carro1.setMarca("MarcaA");
		carro2.setMarca("MarcaB");
		carro3.setMarca("MarcaC");
		
		carro1.setModelo("Ford");
		carro2.setModelo("Tesla");
		carro3.setModelo("Ferrari");

		carro1.setCor("Branco");
		carro2.setCor("Branco");
		
		carro1.setVelocidade(45);
		carro2.setVelocidade(30);
		carro3.setVelocidade(60);
		
		for (int i = 0; i < 10; i++) {
			for(Carro car : carros)
				car.acelera();
		}

		System.out.println(carro1.getModelo() + ": " + carro1.getVelocidade());
		System.out.println(carro2.getModelo() + ": " + carro2.getVelocidade());
		System.out.println(carro3.getModelo() + ": " + carro3.getVelocidade());
		
		for (int i = 0; i < 10; i++) {
			for(Carro car : carros)
				car.freiar();
		}

		System.out.println(carro1.getModelo() + ": " + carro1.getVelocidade());
		System.out.println(carro2.getModelo() + ": " + carro2.getVelocidade());
		System.out.println(carro3.getModelo() + ": " + carro3.getVelocidade());		
		
	}

}
