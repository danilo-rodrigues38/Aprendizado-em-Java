package com.cursoemvideo.polimorfismo;

public class Canguru extends Mamiferos{
	@Override
	public void locomover() {
		System.out.println("Saltar!!!");
	}
	public void usarBolsa() {
		System.out.println("Usando a bolsa!!!");
	}
}
