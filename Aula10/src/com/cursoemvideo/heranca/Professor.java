package com.cursoemvideo.heranca;

public class Professor extends Pessoa{

	// Atributos.
	private String especialidade;
	private double salario;
	
	// Método construtor.
	public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}

	// Métodos assessores Getters and Setters.
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Métodos.
	public void receberAumento(double salario) {
		this.setSalario(salario);		
	}
	
	public void statusProfessor() {
		System.out.println("\n           Dados do professor");
		System.out.println("----------------------------------------\n");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Setor: " + this.getEspecialidade());
		System.out.println("Trabalhando: " + this.getSalario());
	}

}
