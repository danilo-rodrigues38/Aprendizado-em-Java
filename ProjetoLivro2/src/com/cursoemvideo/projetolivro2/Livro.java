package com.cursoemvideo.projetolivro2;
public class Livro implements Publicacao {
	// Atributos.
	private String titulo;
	private String autor;
	private int totpaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	// Métodos.
	public void detalhes() {
		System.out.println("\n-------------------- Detalhes do Livro --------------------\n");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de paginas: " + this.getTotpaginas());
		System.out.println("Pagina atual: " + this.getPagAtual());
		System.out.println("Esta aberto: " + this.isAberto());
		System.out.println("Leitor: " + this.leitor.getNome());
		System.out.println("Sexo leitor: " + this.leitor.getSexo());
		System.out.println("Idade leitor: " + this.leitor.getIdade());
		//System.out.println("\n-----------------------------------------------------------\n");
	}
	// Método contrutor.
	public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totpaginas = totpaginas;
		this.pagAtual = 0;
		this.aberto = false;
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
	public int getTotpaginas() {
		return totpaginas;
	}
	public void setTotpaginas(int totpaginas) {
		this.totpaginas = totpaginas;
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
	// Métodos abstratos implementados.
	@Override
	public void abrir() {
		this.setAberto(true);
	}
	@Override
	public void fechar() {
		this.setAberto(false);
	}
	@Override
	public void folhear(int p) {
		if (p > this.totpaginas) {
			this.setPagAtual(0);
		} else {
			this.setPagAtual(p);
		}
	}
	@Override
	public void avancarpag() {
		this.setPagAtual(getPagAtual() + 1);
	}
	@Override
	public void voltarpag() {
		this.setPagAtual(getPagAtual() - 1);
	}
	
}
