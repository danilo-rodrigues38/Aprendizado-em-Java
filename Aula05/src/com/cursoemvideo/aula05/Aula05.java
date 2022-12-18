package com.cursoemvideo.aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco();
		
		c1.setNumConta(12345);
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		c1.depositar(300);
		c1.sacar(350);
		c1.pagarMensal();
		c1.fecharConta();
		
		c1.dadosConta();

	}

}
