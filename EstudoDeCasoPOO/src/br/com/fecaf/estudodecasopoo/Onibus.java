package br.com.fecaf.estudodecasopoo;

public class Onibus extends Veiculo{
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	
	public int getAssentos() {
		return this.assentos;
	}
	
	public void setAssentos(int a) {
		this.assentos = a;
	}
	
	public void exibirDados() {
		System.out.println("Assentos: " + this.getAssentos());
	}
	
}
