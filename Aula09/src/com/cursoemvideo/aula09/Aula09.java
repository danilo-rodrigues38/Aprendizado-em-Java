package com.cursoemvideo.aula09;

public class Aula09 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Danilo Rodrigues de Oliveira", "Masculino", 49);
		p1.status();
		
		Livro l1 = new Livro("Codigo Limpo - Habilidades Praticas do Agile Software", "Robert C. Mrtin", 425, p1);
		
		l1.abrir();
		l1.folhear(500);
		l1.detalhes();
	}
}