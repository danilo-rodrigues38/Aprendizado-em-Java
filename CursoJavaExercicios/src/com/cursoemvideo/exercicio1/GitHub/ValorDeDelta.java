/* Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
 * segundo grau e mostre o valor de Delta.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class ValorDeDelta {

	public static void main(String[] args) {
		
		int a, b, c, delta;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nCALCULO DE DELTA DA EQUACAO DO 2. GRAU");
		System.out.println("--------------------------------------\n");
		System.out.print("Digite o valor de A: ");
		a = teclado.nextInt();
		System.out.print("Digite o valor de B: ");
		b = teclado.nextInt();
		System.out.print("Digite o valor de c: ");
		c = teclado.nextInt();
		delta = (b * b) - (4 * a * c);
		System.out.printf("O valor de DELTA e %d.", delta);

	}

}
