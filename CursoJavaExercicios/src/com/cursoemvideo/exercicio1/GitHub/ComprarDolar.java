/* Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 * e mostre quantos dólares ela pode comprar.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class ComprarDolar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nCOMPRAR DOLARES");
		System.out.println("---------------\n");
		System.out.print("Qual a cotacao do dolar hoje: ");
		float dollar = teclado.nextFloat();
		System.out.print("Quantos REAIS voce tem para comprar dolares: ");
		float real = teclado.nextFloat();
		float dollars = real / dollar;
		System.out.printf("\nCom R$ %.2f, voce pode comprar US$ %.2f.", real, dollars);

	}

}
