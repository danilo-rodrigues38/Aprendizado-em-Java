/* Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
 * - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
 * - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		
		int anoNasc, idade;
		int anoAtual = 2022;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n  Alistamento Militar  ");
		System.out.println("-----------------------\n");
		System.out.print("Digite o ano de nascimento: ");
		anoNasc = teclado.nextInt();
		idade = anoAtual - anoNasc;
		if (idade < 18) {
			System.out.printf("\nVoce tem %d anos, faltam %d anos para o alistamento.", idade, 18 - idade);
		} else if (idade == 18) {
			System.out.printf("\nVoce tem %d anos, ja pode se  alistar.", idade);
		} else {
			System.out.printf("\nVoce tem %d anos, ja se passaram %d anos do alistamento.", idade, idade - 18);
		}
		
	}

}
