package com.cursoemvideo.polimorfismo;

public class Aves extends Animais {
	private String corPena;
	// Métodos:
	@Override
	public void locomover() {
		System.out.println("Voa!!!");
	}
	@Override
	public void alimentar() {
		System.out.println("Come Frutas!!!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Sons de passaros!!!");
	}
	public void fazerNinho() {
		System.out.println("Faz ninho!!!");
	}
	// Métodos acessores Getters and Setters:
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
