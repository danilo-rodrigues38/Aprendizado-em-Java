package com.cursoemvideo.heranca;

public class HerancaMain {
	
	public static void main(String[] args) {
		
		Aluno al1 = new Aluno("Danilo Rodrigues de Oliveira", 49, "Masculino", 26836, true);
		al1.cancelarMatricula();
		al1.statusAluno();
		
		Professor pr1 = new Professor("Matheus Melo", 35, "Masculino", "Banco de Dados", 5000);
		pr1.receberAumento(6500.75);
		pr1.statusProfessor();
		
		Funcionario fn1 = new Funcionario("Maria Madalena", 40, "Feminino", "Administração", true);
		fn1.mudarTrabalho();
		fn1.statusFuncionario();
		
	}

}
