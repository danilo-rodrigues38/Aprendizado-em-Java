package com.cursoemvideo.exercicio1;

public class Operacoes {
	
	public static String contador(int i, int f) {
		String s = "";
		for(int cont = i; cont <= f; cont++) {
			s += cont + " ";
		}
		return s; 
	}
	
}
