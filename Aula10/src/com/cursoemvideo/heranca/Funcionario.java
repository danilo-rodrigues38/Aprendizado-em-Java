package com.cursoemvideo.heranca;

public class Funcionario extends Pessoa{
	
	// Atributos.
	private String setor;
	private boolean trabalhando;
	
	// Método construtor.
	public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	}
	
	// Métodos assessores Getters and Setters.
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public boolean isTrabalhando() {
		return trabalhando;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	// Métodos.
	public void mudarTrabalho() {
		if(this.isTrabalhando()) {
			this.setTrabalhando(false);
			System.out.println("O funcionário começou a folga.");
		} else {
			System.out.println("O funcionário começou voltou ao trabalho.");
		}
	}
	
	public void statusFuncionario() {
		System.out.println("\n          Dados do funcionário");
		System.out.println("----------------------------------------\n");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Setor: " + this.getSetor());
		System.out.println("Trabalhando: " + this.isTrabalhando());
	}

}
