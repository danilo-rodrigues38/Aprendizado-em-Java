// Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class AnoBissesto {

	public static void main(String[] args) {
		
		int ano;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n  Ano bissesto  ");
		System.out.println("----------------\n");
		System.out.println("Vamos descobrir se o ano e ou nao bissesto?\n");
		System.out.print("Digite o ano: ");
		ano = teclado.nextInt();
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("O ano digitado e BISSESTO!");
		} else {
			System.out.println("O ano digitado nao e BISSESTO!");
		}
		teclado.close();

	}

}
