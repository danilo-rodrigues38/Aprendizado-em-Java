/* Crie um programa que leia o preço de um produto, calcule e mostre o seu
 * PREÇO PROMOCIONAL, com 5% de desconto.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class CalculoDesconto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nCALCULO DESCONTO");
		System.out.println("----------------\n");
		System.out.print("Digite o valor do produto: R$ ");
		float valor = teclado.nextFloat();
		double nvalor = valor - (valor * 0.05);
		System.out.printf("O novo valor do produto com desconto e de R$ %.2f.", nvalor);
		teclado.close();

	}

}
