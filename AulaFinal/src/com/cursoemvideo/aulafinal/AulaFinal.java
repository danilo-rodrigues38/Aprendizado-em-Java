package com.cursoemvideo.aulafinal;

public class AulaFinal {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		v[0].dadosVideo();
		v[1].dadosVideo();
		v[2].dadosVideo();
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Danilo", 49, "Masculino", "droliver");
		g[1] = new Gafanhoto("Creusa", 22, "Feminino", "creuzita");
		
		g[0].dadosGafanhoto();
		g[1].dadosGafanhoto();
	}

}
