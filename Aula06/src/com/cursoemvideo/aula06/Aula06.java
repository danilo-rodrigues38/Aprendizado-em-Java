package com.cursoemvideo.aula06;

public class Aula06 {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.menosVolume();
		c.menosVolume();
		c.menosVolume();
		c.menosVolume();
		c.ligarMudo();
		c.desligarMudo();
		c.play();
		c.pause();
		
		c.abrirMenu();
	}

}

