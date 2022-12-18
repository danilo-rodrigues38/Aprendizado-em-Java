package com.cursoemvideo.heranca;

public class Aluno extends Pessoa {
	private String curso;
	private int matricula;
	// Métodos:
	public void pagarMensalidade() {
		if (this.getSexo().equals("M") || this.getSexo().equals("Masculino")) {
			System.out.println("O aluno " + this.getNome() + ", pagou a mensalidade.");
		} else {
			System.out.println("A aluna " + this.getNome() + ", pagou a mensalidade.");
		}
	}
	public void dadosAluno() {
		System.out.println("\n");
		System.out.println("          Dados do Aluno          ");
		System.out.println("----------------------------------");
		this.dadosPessoa();
		System.out.println("Curso: " + this.getCurso());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("----------------------------------");
		System.out.println("         FIM DO RELATORIO         ");
	}
	// Métodos acessores Getters and Setters:
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
