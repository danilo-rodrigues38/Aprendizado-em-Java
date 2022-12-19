package com.cursoemvideo.polimorfismo;

public class Repteis extends Animais {
	private String corEscama;
	// Métodos:
	@Override
	public void locomover() {
		System.out.println("Rasteja!!!");
	}
	@Override
	public void alimentar() {
		System.out.println("Come folhas!!!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Sons de Repteis!!!");
	}
	// Métodos acessores Getters and Setters:
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscma(String corEscama) {
		this.corEscama = corEscama;
	}
}
