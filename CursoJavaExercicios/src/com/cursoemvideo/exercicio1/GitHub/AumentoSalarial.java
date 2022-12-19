// Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class AumentoSalarial {

	public static void main(String[] args) {
		
		float sal = 0;
		double nsal = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("\nCALCULO DE AUMENTO SALARIAL");
		System.out.println("---------------------------\n");
		System.out.print("Digite o salario do funcionario: R$ ");
		sal = teclado.nextFloat();
		nsal = sal + (sal * 0.15);
		System.out.printf("O novo salario do funcionario e de R$ %.2f.", nsal);
		teclado.close();

	}

}
