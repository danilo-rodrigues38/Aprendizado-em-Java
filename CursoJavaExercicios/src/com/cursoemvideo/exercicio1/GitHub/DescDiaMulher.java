/* Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres.
 * Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
 * - Homens ganham 5% de desconto
 * - Mulheres ganham 13% de desconto
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class DescDiaMulher {

	public static void main(String[] args) {
		
		String nome, sexo;
		float valor, novoValor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n-------------------------------");
		System.out.println("-  PROMOCAO DIA DAS MULHERES  -");
		System.out.println("-------------------------------\n");
		System.out.println("Mulheres ganham 13% de desconto!");
		System.out.println("Homens ganham 5% de desconto!\n");
		System.out.print("Digite o nome do cliente: ");
		nome = teclado.nextLine();
		System.out.print("Digite o sexo do cliente: [M/F] ");
		sexo = teclado.next().toUpperCase();
		System.out.print("Qual o valor da compra: R$ ");
		valor = teclado.nextFloat();
		if (sexo.equals("F")) {
			novoValor = (float) (valor * 0.87);
			System.out.printf("\nA Sra %s vai pagar o valor de R$ %.2f ja incluso o desconto.", nome, novoValor);
		} else {
			novoValor = (float) (valor * 0.95);
			System.out.printf("\nO Sr %s vai pagar o valor de R$ %.2f ja incluso o desconto.", nome, novoValor);
		}
		teclado.close();
	}

}
