/* Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 185.72
 * A distância de 85.7m corresponde a:
 * 0.18572Km
 * 1.8572Hm
 * 18.572Dam
 * 1857.2dm
 * 18572.0cm
 * 185720.0mm
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class CalculoDistâncias {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nCALCULO DE DISTANCIA");
		System.out.println("--------------------\n");
		System.out.print("Digite uma distancia em metros: ");
		float dist = teclado.nextFloat();
		System.out.printf("\nA distancia de %.2f corresponde a:\n", dist);
		System.out.printf("%f Km\n" , dist / 1000);
		System.out.printf("%f Hm\n", dist / 100);
		System.out.printf("%f Dam\n", dist / 10);
		System.out.printf("%f dm\n", dist * 10);
		System.out.printf("%f cm\n", dist * 100);
		System.out.printf("%f mm\n", dist * 1000);
	}

}
