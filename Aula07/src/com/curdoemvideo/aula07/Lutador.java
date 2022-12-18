package com.curdoemvideo.aula07;

public class Lutador {
	
	// Atributos.
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	// Método Construtor.
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		super();
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}

	// Métidos Assessores Getters and Setters.
	protected String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	protected float getAltura() {
		return altura;
	}

	private void setAltura(float altura) {
		this.altura = altura;
	}

	protected float getPeso() {
		return peso;
	}

	private void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	protected String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Medio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "invalido";
		}
	}
	
	protected int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	protected int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	protected int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}
	
	// Métodos.
	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem:  " + this.getNacionalidade());
		System.out.println("Idade:   " + this.getIdade() + " anos");
		System.out.println("Pesando: " + this.getPeso() + " Kg");
		System.out.println("Altura:  " + this.getAltura() + "m");
		System.out.println("Ganhou:  " + this.getVitorias() + " lutas");
		System.out.println("Pedeu:   " + this.getDerrotas() + " lutas");
		System.out.println("Empatou: " + this.getEmpates() + " lutas");
		System.out.println(" ");
	}

	public void status() {
		System.out.println(" ");
		System.out.println(this.getNome() + " e um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
		System.out.println("\n=====================================");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

}