package com.cursoemvideo.aulafinal;

public class Pessoa {
	// Atributos:
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	// Método construtor:
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	// Métodos:
	protected void ganharExperiencia() {
		this.experiencia ++;
	}
	public void dadosPessoa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Experiencia: " + this.experiencia);
	}
	// Métodos acessores Getters and Setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	
}
