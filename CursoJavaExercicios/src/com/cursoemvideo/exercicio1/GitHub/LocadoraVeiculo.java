/* A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte
 * a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
 * Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class LocadoraVeiculo {

	public static void main(String[] args) {
		
		int km, dias;
		double vlkm;
		float vldia;
		double total;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nLOCADORA DE VEICULOS FUTULAMA");
		System.out.println("-----------------------------\n");
		System.out.print("Quantos Km percorridos: ");
		km = teclado.nextInt();
		System.out.print("Quantos dias: ");
		dias = teclado.nextInt();
		vlkm = km * 0.2;
		vldia = dias * 90;
		total = vlkm + vldia;
		System.out.printf("\nO total de Km percorrido foi de %d km, o valor por km e de R$ 0,20, o valor a ser pago e R$ %.2f.", km, vlkm);
		System.out.printf("\nO total de dias com o veiculo foi de %d dias, o valor diario e de R$ 90,00, o valor a ser pago e R$ %.2f.", dias, vldia);
		System.out.printf("\nO valor total a ser pago e de R$ %.2f.", total);
		teclado.close();
	}

}
