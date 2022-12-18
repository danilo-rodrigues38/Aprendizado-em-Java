/* Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
 * dela e depois mostre se ela pode ou não votar.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class IdadeVotacao {

	public static void main(String[] args) {
		
		int idade, anoNasc;
		int ano = 2022;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n  CALCULO PARA IDADE DE VOTACAO  ");
		System.out.println("---------------------------------\n");
		System.out.print("Digite o seu ano de nascimento: ");
		anoNasc = teclado.nextInt();
		idade = ano - anoNasc;
		if (idade < 16) {
			System.out.printf("\nVoce tem %d anos e ainda NAO PODE VOTAR!", idade);
		} else if (idade < 18 || idade >= 70) {
			System.out.printf("\nVoce tem %d anos e para voce, o VOTO E FACULTATIVO!", idade);
		} else {
			System.out.printf("\nVoce tem %d anos e para voce, o VOTO E OBRIGATORIO!", idade);
		}
		
	}

}
