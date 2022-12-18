package br.com.fecaf.estudodecasopoo;

public class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String p) {
		this.placa = p;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	public void exibirDados() {
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Ano: " + this.getAno());
	}
		
}
