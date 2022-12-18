/* Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
 * 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
 * o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 * */

package com.cursoemvideo.exercicio1.GitHub;

import java.util.Scanner;

public class CobrMultaVeloc {

	public static void main(String[] args) {

		int velocidade;
		float multa;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n  CALCULO - MULTA POR EXCESSO DE VELOCIDADE  ");
		System.out.println("---------------------------------------------\n");
		System.out.println("Limite de velocidade permitido - 80Km/h");
		System.out.println("Valor da multa por km/h excedido de R$ 5,00\n");
		System.out.print("Qual a velocidade do veiculo em Km/h: ");
		velocidade = teclado.nextInt();
		if (velocidade > 80) {
			multa = (velocidade - 80) * 5;
			System.out.printf("\nVoce ultrapassou o limite de velocidade\n"
					+ "permintido e sera multado em R$ %.2f,\n"
					+ "por excesso de velocidade.", multa);
		} else {
			System.out.println("\nVoce e um bom motorista, respeita as leis de\n"
					+ "transito, faca uma boa viagem.");
		}


	}

}
