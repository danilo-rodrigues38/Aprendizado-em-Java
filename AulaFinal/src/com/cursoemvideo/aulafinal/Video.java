package com.cursoemvideo.aulafinal;

public class Video implements AcoesVideo{
	// Atributos:
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	// Método construtor:
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	// Métodos sobrepostos:
	@Override
	public void play() {
		if (!this.reproduzindo) {
			this.setReproduzindo(true);
			System.out.println("Iniciada a reprodução do vídeo.");
		} else {
			System.out.println("Iniciada a reprodução do vídeo");
			this.views ++;
		}
	}
	@Override
	public void pause() {
		if (this.reproduzindo) {
			System.out.println("Pausando o video!");
		} else {
			System.out.println("Retomada a reprodução!");
		}
	}
	@Override
	public void like() {
		this.curtidas ++;
	}
	
	// Métodos acessores Getters and Setters:
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliação() {
		return avaliacao;
	}
	public void setAvaliação(int avaliação) {
		this.avaliacao = avaliação;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	public void dadosVideo() {
		System.out.println("\n------------------------------------");
		System.out.println("           Dados do Filme           ");
		System.out.println("------------------------------------");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Avaliacao: " + this.avaliacao);
		System.out.println("Views: " + this.views);
		System.out.println("Curtidas: " + this.curtidas);
		System.out.println("Reproduzindo: " + this.reproduzindo);
		System.out.println("--------- FIM DO RELATORIO ---------\n");
	}
}
