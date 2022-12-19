/* Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class CalculoParede {

	public static void main(String[] args) {
		
		float larg, alt, area, tinta;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nCALCULO DE AREA E TINTA PARA PAREDE");
		System.out.println("-----------------------------------\n");
		System.out.print("Qual a largura da parede: ");
		larg = teclado.nextFloat();
		System.out.print("Qual a altura da parede: ");
		alt = teclado.nextFloat();
		area = larg * alt;
		tinta = area / 2;
		System.out.printf("\nA area total da parede e de %.2f."
				+ "\nA quantidade necessaria de tinta para pintar a parede e de %.2f litros de tinta.", area, tinta);
		teclado.close();
	}

}
