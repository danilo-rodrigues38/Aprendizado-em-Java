package com.cursoemvideo.heranca;

public class Bolsista extends Aluno {
	private float bolsa;
	// Métodos:
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa de " + this.getNome());
	}
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
	}
	public void dadosBolsista() {
		System.out.println("\n");
		System.out.println("          Dados do Bolsista          ");
		System.out.println("-------------------------------------");
		this.dadosPessoa();
		System.out.println("Bolsa: " + this.getBolsa());
		System.out.println("-------------------------------------");
		System.out.println("          FIM DO RELATORIO           ");
	}
	// Métodos acessores Getters and Setters:
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
