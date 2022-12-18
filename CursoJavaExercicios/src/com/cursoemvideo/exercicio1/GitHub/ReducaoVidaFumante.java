/* Escreva um programa para calcular a redução do tempo de vida de um
 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
 * já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class ReducaoVidaFumante {

	public static void main(String[] args) {
		
		int qtdCigarros, qtdAnos, totCigarros, reducVida, diasPerdidos, dia, mes, ano;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nPrograma para calcular a reducao do tempo de vida de um fumante.");
		System.out.println("----------------------------------------------------------------\n");
		System.out.print("Quantos cigarros voce fuma por dia: ");
		qtdCigarros = teclado.nextInt();
		System.out.print("Ha quantos anos voce fuma: ");
		qtdAnos = teclado.nextInt();
		totCigarros = (((qtdAnos * 12) * 30) * qtdCigarros);
		// O valor 12, representa a quantidade de meses no ano.
		// o valor 30, representa a quantidade de dias no mes.
		reducVida = totCigarros * 10;
		// O valor 10, representa a perda de 10 min de vida por cigarro.
		diasPerdidos = (reducVida / 60) / 24;
		ano = diasPerdidos / 365;
		mes = (diasPerdidos % 365) / 30;
		if (mes == 0) {
			dia = diasPerdidos % 365;
		} else {
			dia = (diasPerdidos % 365) - (30 * mes);
		}
		System.out.printf("\nO total de dias perdidos em sua vida de fumante e de %d dias.", diasPerdidos);
		System.out.printf("\nQue corresponde a %d anos, %d mes e %d dias perdidos da sua vida.", ano, mes, dia);

	}

}
