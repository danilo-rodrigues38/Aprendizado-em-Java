package com.cursoemvideo.projetolivro2;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa[3];
		Livro [] l = new Livro[3];
				
		p[0] = new Pessoa("Danilo Oliveira", 49, "Masculino");
		p[1] = new Pessoa("Vinicius Oliveira", 24, "Masculino");
		p[2] = new Pessoa("Jessica Oliveira", 20, "Feminino");
		
		l[0] = new Livro("Aprendendo C#", "Jose da Silva", 300, p[1]);
		l[1] = new Livro("Aprendendo Arquitetura", "Maria Gomes", 500, p[2]);
		l[2] = new Livro("Codigo Limpo - Habilidades Praticas do Agile Software", "Robert C. Mrtin", 425, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(50);
		l[0].detalhes();
		
		l[1].abrir();
		l[1].folhear(100);
		l[1].detalhes();
		
		l[2].abrir();
		l[2].folhear(150);
		l[2].detalhes();
	}
}
