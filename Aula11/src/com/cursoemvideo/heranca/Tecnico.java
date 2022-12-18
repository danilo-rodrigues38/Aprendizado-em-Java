package com.cursoemvideo.heranca;

public class Tecnico extends Aluno {
	private int registroProfissional;
	// Métodos:
	public void praticar() {
		System.out.println("O aluno tecnico está praticando.");
	}
	public void dadosTecnico() {
		System.out.println("\n");
		System.out.println("          Dados do Aluno Tecnico         ");
		System.out.println("-----------------------------------------");
		this.dadosPessoa();
		System.out.println("Registro profissional n.: " + this.getRegistroProfissional());
		System.out.println("----------------------------------");
		System.out.println("         FIM DO RELATORIO         ");
	}
	// Métodos acessores Getters and Setters:
	public int getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
}
