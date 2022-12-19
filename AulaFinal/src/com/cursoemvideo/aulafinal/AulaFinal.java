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
		g[0] = new Gafanhoto("Jubileu", 22, "Masculino", "juba");
		g[1] = new Gafanhoto("Creusa", 12, "Feminino", "creuzita");
		
		g[0].dadosGafanhoto();
		g[1].dadosGafanhoto();
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);	// Jubileu assiste HTML5
		vis[0].avaliar();
		vis[0].dadosVisualizacao();
		
		vis[1] = new Visualizacao(g[0], v[1]);	// Jubileu assiste PHP
		vis[1].avaliar(87.0f);
		vis[1].dadosVisualizacao();
		
		vis[2] = new Visualizacao(g[0], v[0]);	// Jubileu assiste POO
		vis[2].avaliar(7);
		vis[2].dadosVisualizacao();
		
		
	}

}
