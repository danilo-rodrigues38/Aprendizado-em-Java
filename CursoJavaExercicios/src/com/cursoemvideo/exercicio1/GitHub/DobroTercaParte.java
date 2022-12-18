/* Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
 * Ex:
 * Digite um número: 3.5
 * O dobro de 3.5 é 7.0
 * A terça parte de 3.5 é 1.16666
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class DobroTercaParte {

	public static void main(String[] args) {
		
		float num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nDigite um numero: ");
		num = teclado.nextFloat();
		System.out.printf("\nO dobro de %.1f e %.1f.", num, num * 2);
		System.out.printf("\nA terca parte de %.1f e %.1f.", num, num / 3);
	}

}
