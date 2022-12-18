// Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nDigite um valor: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			System.out.println("\nO numero e PAR!");
		} else {
			System.out.println("\nO numero e IMPAR!");
		}
		
	}

}
