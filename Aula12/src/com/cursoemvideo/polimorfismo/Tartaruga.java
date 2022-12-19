package com.cursoemvideo.polimorfismo;

public class Tartaruga extends Repteis{
	@Override
	public void locomover() {
		System.out.println("Anda lentamente!!!");
	}
	@Override
	public void alimentar() {
		System.out.println("Come folhagens!!!");
	}
}
