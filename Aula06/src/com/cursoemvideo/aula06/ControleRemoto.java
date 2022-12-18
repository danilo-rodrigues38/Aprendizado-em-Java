package com.cursoemvideo.aula06;

public class ControleRemoto implements Controlador {

	// Atributos.
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Método Construtor.
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// Métodos Especiais Getters and Setters.
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// Métodos Abstratos.
	// Sobrescrevendo Nétodos.
	@Override
	public void ligar() {
		this.setLigado(true);		
	}

	@Override
	public void deligar() {
		this.setLigado(false);		
	}

	@Override
	public void abrirMenu() {
		System.out.println("\n----- Menu -----");
		System.out.println("Está ligado: " + this.isLigado());
		System.out.println("Está tocando: " + this.isTocando());
		if (this.isLigado()) {
			System.out.print("Volume: " + this.getVolume() + " ");
			for (int i = 0; i <= 100; i += 10) {
				if (i <= this.getVolume() && i >= 10 ) {
					System.out.print("*");
				} else if (i > this.getVolume()) {
					System.out.print("-");
				}
			}	
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");		
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(getVolume() + 5);
		} else {
			System.out.println("Não é possível aumentar o volume.\nO controle está desligado.");
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(getVolume() - 5);
		} else {
			System.out.println("Não é possível baixar o volume.\nO controle está desligado.");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
	}	
}

