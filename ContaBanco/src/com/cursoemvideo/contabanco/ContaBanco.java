package com.cursoemvideo.contabanco;

public class ContaBanco {

	// Declaração dos atributos.
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	// Métodos especiais:
	
	// Método construtor.
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	// Métodos - Getters and Setters.
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return this.status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// Métodos.
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo.equals("CC")) {
			this.setSaldo(50);
		} else if (tipo.equals("CP")) {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!!!");
	}
	
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta com dinheiro!");
		} else if (saldo < 0) {
			System.out.println("Conta com saldo negativo!!");
		} else {
			this.setStatus(false);
		}
		System.out.println("Conta fechada com sucesso!!!");
	}
	
	public void depositar(double valor) {
		if (this.isStatus() == true) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Deposito realizado na conta de " + this.getDono() + ".");
		} else {
			System.out.println("Impossivel depositar!!!");
		}
	}
	
	public void sacar(double valor) {
		if (this.isStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Um saque foi realizado na conta da " + this.getDono() + ".");
			} else {
				System.out.println("Saldo insuficiente!!!");
			} 
		} else {
			System.out.println("Impossivel sacar!!!");
		}
	}
	
	public void pagarMensal() {
		double v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.isStatus() == true) {
			if (this.getSaldo() > v) {
				this.setSaldo(getSaldo() - v);
			} else {
				System.out.println("Saldo Insuficiente!!!");
			}
		}else {
			System.out.println("impossivel pagar!!!");
		}
	}
	
	public void statusAtual() {
		System.out.println("\n==========================================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Ativa: " + this.isStatus());
	}

}
