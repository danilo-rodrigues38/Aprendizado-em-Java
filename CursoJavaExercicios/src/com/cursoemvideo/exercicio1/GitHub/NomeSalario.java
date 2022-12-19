package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class NomeSalario {

	public static void main(String[] args) {
		
		// Variáveis
		String nome;
		float salario;
		
		// Instâncias
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual o nome do Funcionario: ");
		nome = teclado.nextLine();
		System.out.print("Qual o salario: ");
		salario = teclado.nextFloat();
		
		System.out.printf("\nO funcionario, %s, tem um salario de R$ %.2f neste mes.", nome, salario);
		teclado.close();
	}

}
