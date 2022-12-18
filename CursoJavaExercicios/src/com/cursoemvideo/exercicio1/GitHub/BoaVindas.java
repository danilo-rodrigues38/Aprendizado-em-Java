/*Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela.
 * Ex: Qual é o seu nome?
 * João da Silva
 * Olá João da Silva, é um prazer te conhecer! * 
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class BoaVindas {

	public static void main(String[] args) {
		
		// Declaração de variáveis.
		String nome;
		
		// Declarando instâncias.
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual e o seu nome? ");
		nome = teclado.nextLine();
		
		System.out.printf("Ola, %s, e um prazer te conhecer!", nome);
	}

}
