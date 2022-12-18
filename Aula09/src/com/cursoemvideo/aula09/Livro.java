package com.cursoemvideo.aula09;
public class Livro implements Publicacao {
	// Atributos.
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	// Método.
	public void detalhes() {
		System.out.println("--------------------- Detalhes do Livro ----------------------\n");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de paginas: " + this.getTotPaginas());
		System.out.println("Pagina autal: " + this.getPagAtual());
		System.out.println("O livro esta aberto: " + this.isAberto());
		System.out.println("Leitor: " + leitor.getNome());
		System.out.println("Idade: " + leitor.getIdade());
		System.out.println("Sexo: " + leitor.getSexo());
		System.out.println("\n--------------------------------------------------------------");
	}
	// Método Construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	// Métodos especiais Getters and Setters.
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	// Métodos implementados de Publicacao.
	@Override
	public void abrir() {
		if (this.isAberto() && this.getLeitor() != null) {
			System.out.println("O livro já esta aberto.");
		} else {
			this.setAberto(true);
			this.leitor.getNome();
		}
	}
	@Override
	public void fechar() {
		if (this.isAberto()) {
			this.setAberto(false);
		} else {
			System.out.println("O livro já esta fechado.");
		}
		this.setLeitor(null);
	}
	@Override
	public void folhear(int p) {
		if (this.isAberto()) {
			if (p > this.totPaginas) {
				System.out.println("\nO livro so tem " + this.totPaginas + " paginas.\n");
				this.pagAtual = 0;
			} else {
				System.out.println("Folheando o livro ate a pagina " + p);
				this.pagAtual = p;
			}
		} else {
		System.out.println("O livro esta fechado!");
		}
	}
	@Override
	public void avancarPag() {
		if (this.isAberto() && this.getLeitor() != null && this.getTitulo() != null) {
			this.pagAtual++;
		} else {
			System.out.println("O livro esta fechado.");
		}
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}