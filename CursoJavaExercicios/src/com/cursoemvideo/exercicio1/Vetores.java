package com.cursoemvideo.exercicio1;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		
		int n[] = new int[6];
		n[0] = 3;
		n[1] = 8;
		n[2] = 5;
		n[3] = 1;
		n[4] = 7;
		n[5] = 4;
		
		System.out.println("\nTotal de casas do vetor N = " + n.length);
		System.out.print("Encontrei os seguintes valores no vetor: ");
		for(int c = 0; c < n.length; c++) {
			System.out.print(n[c] + " ");
		}
		
		System.out.println("\n");
		
		int vet[] = {3, 2, 8, 7, 5, 0, 4, 1, 6, 9};
		System.out.println("\nTotal de casas do vetor VET = " + vet.length);
		System.out.print("Encontrei os seguintes valores no vetor: ");
		for(int cont = 0; cont < vet.length; cont++) {
			System.out.print(vet[cont] + " ");
		}
		
		System.out.println("\n");
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int cont = 0; cont < mes.length; cont++) {
			System.out.printf("\nNo mes de %s, temos %d dias.", mes[cont], dias[cont]);
		}
		
		int num[] = {3, 5, 1, 8, 4};
		int pos = Arrays.binarySearch(num, 1); // Faz uma busca no vetor a procura de um determinado valor.
		System.out.println("\n\nEncontrei o valor 1 na posicao " + pos);
		for(int val: num) { // Estrutura de repetição - "for it" - "Para cada elemento" - expecífico para vetores.
			System.out.printf(val + " ");
		}
		
		Arrays.sort(num);     // O "sort" coloca o vetor em ordem crescente.
		int p = Arrays.binarySearch(num, 1);
		System.out.println("\n\nEncontrei o valor 1 na posicao " + p);
		for(int valor: num) { // Estrutura de repetição - "for each" - "Para cada" elemento - expecífico para vetores.
			System.out.printf(valor + " ");
		}
		
		System.out.println("\n\nPreenchimento automatico do vetor com o numero 0, pre-definido.");
		int num1[] = new int[20];
		Arrays.fill(num1, 0); // Preenche automáticamente o vetor com um valor pré-definido, neste caso o valor 0.
		for(int v:num1) {     // exemplo do "FOR EACH"
			System.out.print(v + " ");
		}
		
	}

}
