package com.cursoemvideo.heranca;

public class HerancaMain {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Danilo");
		v1.setSexo("Masculino");
		v1.setIdade(49);
		v1.dadosVisitante();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Aluno a1 = new Aluno();
		a1.setNome("Vinicius");
		a1.setSexo("M");
		a1.setIdade(24);
		a1.setCurso("Sistemas da Informacao");
		a1.setMatricula(240498);
		a1.dadosAluno();
		a1.pagarMensalidade();
		
		Aluno a2 = new Aluno();
		a2.setNome("Jessica");
		a2.setSexo("F");
		a2.setIdade(20);
		a2.setCurso("Arquitetura");
		a2.setMatricula(020602);
		a2.dadosAluno();
		a2.pagarMensalidade();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Jubileu");
		b1.setSexo("M");
		b1.setIdade(22);
		b1.setCurso("Direito");
		b1.setMatricula(220573);
		b1.setBolsa(225.25f);
		b1.dadosBolsista();
		b1.pagarMensalidade();
	}
}
