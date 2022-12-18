/* Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
 * dela e depois mostre se ela pode ou não votar.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class MediaEscolar2 {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nCALCULO MEDIA ESCOLAR");
		System.out.println("---------------------\n");
		System.out.print("Digite a 1. nota: ");
		nota1 = teclado.nextFloat();
		System.out.print("Digite a 2. nota: ");
		nota2 = teclado.nextFloat();
		media = (nota1 + nota2) / 2;
		System.out.printf("\nVoce teve a media %.2f.\n", media);
		if (media >= 7) {
			System.out.println("\nParabens, voce teve um otimo aproveitamento, APROVADO!");
		} else if (media <= 4) {
			System.out.println("\nVoce nao teve bom aproveitamento, REPROVADO!");
		} else {
			System.out.println("\nVoce teve um aproveitamento regular, RECUPERACAO!");
		}

	}

}
