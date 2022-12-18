package br.com.fecaf.estudodecasopoo;

public class Caminhao extends Veiculo{
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}
	
	public int getEixos() {
		return this.eixos;
	}
	
	public void setEixos(int e) {
		this.eixos = e;
	}
	
	public void exibirDados() {
		System.out.println("Eixos: " + this.getEixos());
	}	
	
}
