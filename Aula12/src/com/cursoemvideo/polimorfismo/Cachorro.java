package com.cursoemvideo.polimorfismo;

public class Cachorro extends Mamiferos{
	@Override
	public void locomover() {
		System.out.println("Andando!!!");
	}
	public void enterarOsso() {
		System.out.println("Enterrando osso!!!");
	}
}
