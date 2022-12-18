package br.com.fecaf.estudodecasopoo;

public class EstudoDeCasoPOO {

	public static void main(String[] args) {
		
		Veiculo celta = new Veiculo("ABC-1D23", 2010);
		celta.exibirDados();
		System.out.println("Tenho um veiculo Celta, ano " + celta.getAno() + ", de placas " + celta.getPlaca() + ".");
		
		System.out.println("\n=========================================================================================\n");
		
		Caminhao cami = new Caminhao("EFG-4H56", 2011, 3);
		cami.exibirDados();
		System.out.println("Tenho um Caminhao Cami, ano " + cami.getAno() + ", de placas " + cami.getPlaca() + ", com " + cami.getEixos() + " eixos.");
		
		System.out.println("\n=========================================================================================\n");
		
		Onibus bus = new Onibus("IJK-7L89", 2012, 42);
		bus.exibirDados();
		System.out.println("Tenho um onibus Bus, ano " + bus.getAno() + ", de placas " + bus.getPlaca() + ", com " + bus.getAssentos() + " assentos.");

	}

}
