package com.cursoemvideo.exercicio1;

public class Metodos {
	
	public static void soma(int a, int b) {
		int s = a + b;
		System.out.printf("A soma de %d + %d e igual a %d.", a, b, s);
	}
	
	public static int somar(int a, int b) {
		int s = a + b;
		return s;
	}

	public static void main(String[] args) {
		
		System.out.println("\nComecou o programa");
		soma(5, 2); // Método ou Função que não retorna valor.
		
		int x = 3, y = 6;
		int sm = somar(x, y); // Método ou Função que retorna um valor.
		System.out.printf("\nA soma entre %d e %d e igual a %d.", x, y, sm);
	}

}
