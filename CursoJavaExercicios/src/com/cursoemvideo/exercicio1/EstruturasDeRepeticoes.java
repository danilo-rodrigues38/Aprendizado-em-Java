package com.cursoemvideo.exercicio1;

public class EstruturasDeRepeticoes {

	public static void main(String[] args) {
		int cont = 1;
		
		// Estrutura de repetição com teste lógico no início
		while (true) {
			System.out.printf("%d x 5 = %d\n", cont, cont * 5);
			cont++;
			if (cont == 11) {
				break;
			}
		}
		
		System.out.println("");
		// Estrutura de repetição com teste lógico no final
		int contador = 1;
		do {
			System.out.println("Cambalhota " + contador);
			contador++;
		} while (contador <= 4);
		
		System.out.println("");
		// Estrutura de controle com variável de controle
		int c;
		for (c = 1; c <= 4; c++) {
			System.out.println("Cambalhota " + c);
		}
		
		System.out.println("");
		// Estruturas de repetição aninhadas
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.printf("%d e %d\n", i, j);
			}
		}

	}

}
