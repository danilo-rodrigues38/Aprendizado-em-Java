package com.cursoemvideo.heranca;

public abstract class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	
	// Métodos:
	public void fazerAniversario() {
		this.idade ++;
	}
	public void dadosPessoa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Idade: " + this.idade);
	}
	// Métodos acessores Getters and Setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}