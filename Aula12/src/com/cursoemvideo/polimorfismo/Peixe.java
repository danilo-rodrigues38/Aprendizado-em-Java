package com.cursoemvideo.polimorfismo;

public class Peixe extends Animais {
	private String corEscama;
	// Métodos:
	public void soltarBolha() {
		System.out.println("Soltando bolha!!!");
	}
	@Override
	public void locomover() {
		System.out.println("Nada!!!");
	}
	@Override
	public void alimentar() {
		System.out.println("Come racao!!!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Não emite Sons!!!");
	}
	// Métodos acessores Getters and Setters:
	public String getCorEscama() {
		return corEscama;
	}
	public void setcorEscma(String corEscama) {
		this.corEscama = corEscama;
	}
}
