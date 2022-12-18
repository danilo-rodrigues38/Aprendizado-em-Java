package com.cursoemvideo.heranca;

public class Aluno extends Pessoa{

	// Atributos.
	private int matricula;
	private boolean curso;
	
	// Método construtor.
	public Aluno(String nome, int idade, String sexo, int matricula, boolean curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}

	// Métodos assessores Getters and Setters.
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean isCurso() {
		return curso;
	}

	public void setCurso(boolean curso) {
		this.curso = curso;
	}
	
	// Métodos.
	public void cancelarMatricula() {
		if (this.isCurso()) {
			this.setCurso(false);
			System.out.println("Cancelamento efetuado com sucesso!!!");
		} else {
			System.out.println("O Aluno não está ativo no sistema.");
		}
	}
	
	public void statusAluno() {
		System.out.println("\n             Dados do aluno");
		System.out.println("----------------------------------------\n");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Curso: " + this.isCurso());
	}

}
