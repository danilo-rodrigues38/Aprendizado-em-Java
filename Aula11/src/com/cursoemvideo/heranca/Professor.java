package com.cursoemvideo.heranca;

public class Professor extends Pessoa {
	private String especialidade;
	private double salario;
	// Métodos:
	public void receberAumento(float aumento) {
		this.setSalario(this.getSalario() * (aumento / 100));
	}
	public void dadosProfessor() {
		System.out.println("\n");
		System.out.println("          Dados do Professor          ");
		System.out.println("--------------------------------------");
		this.dadosPessoa();
		System.out.println("Especialidade: " + this.getEspecialidade());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("--------------------------------------");
		System.out.println("           FIM DO RELATORIO           ");
	}
	// Métodos acessores Getters and Setters:
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
}
