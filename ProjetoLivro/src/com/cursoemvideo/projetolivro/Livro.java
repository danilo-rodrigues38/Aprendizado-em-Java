package com.cursoemvideo.projetolivro;
public class Livro implements Publicacao {
	// Atributos.
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	// Métodos.
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
	// Método construtor.
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
	@Override
	public void abrir() {
		this.aberto = true;
	}
	@Override
	public void fechar() {
		this.aberto = false;
	}
	@Override
	public void folhear(int p) {
		if (p > this.totPaginas) {
			System.out.println("\nO livro so tem " + this.totPaginas + " paginas.\n");
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
	}
	@Override
	public void avancarPag() {
		this.pagAtual++;
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
}
