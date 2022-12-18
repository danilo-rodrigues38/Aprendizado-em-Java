package com.cursoemvideo.heranca;

public class Visitante extends Pessoa {
	// Métodos:
	public void dadosVisitante() {
		System.out.println("\n");
		System.out.println("          Dados do Visitante          ");
		System.out.println("--------------------------------------");
		this.dadosPessoa();
		System.out.println("--------------------------------------");
		System.out.println("           FIM DO RELATORIO           ");
	}
}
