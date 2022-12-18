/* Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nDigite um numero: ");
		num = teclado.nextInt();
		System.out.printf("\nO antecessor de %d e %d.", num, num - 1);
		System.out.printf("\nO sucessor de %d e %d.", num, num + 1);
	}

}
