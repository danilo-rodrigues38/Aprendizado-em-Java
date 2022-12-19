/* Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
 * Ex:
 * Nota 1: 4.5
 * Nota 2: 8.5
 * A média entre 4.5 e 8.5 é igual a 6.5.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		
		float n1, n2, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculo da media escolar");
		System.out.println("------------------------\n");
		System.out.print("Digite a primeira nota: ");
		n1 = teclado.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2 = teclado.nextFloat();
		media = (n1 + n2) / 2;
		System.out.printf("\nA media entre %.1f e %.1f e igual a %.1f.", n1, n2, media);
		teclado.close();
	}

}
