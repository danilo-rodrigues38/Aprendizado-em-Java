package com.cursoemvideo.polimorfismo;

public abstract class Animais {
	private float peso;
	private int idade;
	private int membros;
	// Métodos:
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	// Métodos acessores Getters and Setters:
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
}
