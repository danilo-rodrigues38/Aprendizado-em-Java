package com.cursoemvideo.poo;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Caga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("\nERRO!!!");
			System.out.println("Nao posso rabiscar, a caneta esta tampada.\n");
		} else {
			System.out.println("\nRabiscando!!!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}
