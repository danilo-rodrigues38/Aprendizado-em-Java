package com.cursoemvideo.polimorfismo;

public class Mamiferos extends Animais {
	private String corPelo;
	// Métodos:
	@Override
	public void locomover() {
		System.out.println("Correr!!!");
	}
	@Override
	public void alimentar() {
		System.out.println("Mama!!!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Sons de Mamiferos!!!");
	}
	// Métodos acessores Getters and Setters:
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
