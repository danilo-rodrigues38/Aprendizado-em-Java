/*Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		int n1, n2, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos somar dois numeros");
		System.out.println("------------------------\n");
		System.out.print("Digite o primeiro valor: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o segundo valor: ");
		n2 = teclado.nextInt();
		soma = n1 + n2;
		System.out.printf("A soma entre %d e %d e igual a %d.", n1, n2, soma);
	}

}
