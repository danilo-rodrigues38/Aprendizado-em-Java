/* Crie um programa que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
 * por hora trabalhada.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class CalcHorasTrabalhadas {

	public static void main(String[] args) {
		
		int dias;
		float salario;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nCALCULO DE DIAS TRABALHADOS");
		System.out.println("---------------------------\n");
		System.out.print("Quantos dias o funcionario trabalhou: ");
		dias = teclado.nextInt();
		salario = (dias * 8) * 25;
		System.out.printf("\nO valor do salario que no funcionario\nvai receber e de R$ %.2f.", salario);
		teclado.close();

	}

}
