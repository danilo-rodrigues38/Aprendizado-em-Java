package com.cursoemvideo.aulafinal;

public class Gafanhoto extends Pessoa {
	// Atributos:
	private String login;
	private int totAssistido;
	// Método construtor:
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	// Métodos:
	public void viuMaisUm() {
		this.totAssistido ++;
	}
	// Métodos acessores Getters and Setters:
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	public void dadosGafanhoto() {
		System.out.println("\n------------------------------------");
		System.out.println("          Dados do Usuario          ");
		System.out.println("------------------------------------");
		this.dadosPessoa();
		System.out.println("Login: " + this.login);
		System.out.println("Total Assistido: " + this.totAssistido);
		System.out.println("--------- FIM DO RELATORIO ---------\n");
	}
}
