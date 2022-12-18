package com.curdoemvideo.aula07;

public class Aula07 {

	public static void main(String[] args) {
		
		// Este exercício exemplo é o combinado da aula 07 e da aula 08.
		Lutador lut[] = new Lutador[6];
		lut[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		lut[1] = new Lutador("Puts Scripts", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		lut[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		lut[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		lut[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		lut[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta uec01 = new Luta();
		
		uec01.marcarLuta(lut[5], lut[4]);
		uec01.lutar();
		if (uec01.isAprovada()) {
			uec01.getDesafiado().status();
			uec01.getDesafiante().status();
		}
	}
}
