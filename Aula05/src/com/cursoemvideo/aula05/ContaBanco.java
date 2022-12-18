package com.cursoemvideo.aula05;

public class ContaBanco {
	
	// Atributos.
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	// Método construtor.
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	// Métodos avançados Getters and Setters.
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void dadosConta() {
		System.out.println("\n=====================================================================\n");
		System.out.println("Numero da Conta: " + this.getNumConta());
		System.out.println("Dono da Conta: " + this.getDono());
		System.out.println("Tipo da Conta: " + this.getTipo());
		System.out.println("Salco da Conta: " + this.getSaldo());
		System.out.println("A conta está ativa: " + this.status);
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (this.getTipo() == "CC") {
			this.setSaldo(50);
		} else if (this.getTipo() == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta de " + this.getDono() + ", aberta com sucesso.");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em Debito.");
		} else {
			this.setStatus(false);
			System.out.println("Conta de " + this.getDono() + ", encerrada com sucesso.");
		}
	}
	
	public void depositar(double valor) {
		if (this.isStatus() == true) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Deposito de R$ " + valor + ", realizado com sucesso.");
		} else {
			System.out.println("Impossivel depositar.");
		}
	}
	
	public void sacar(double valor) {
		if (this.isStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Saque de R$ " + valor + ", da conta de " + this.getDono() + ", efetuado com sucesso.");
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossivel sacar.");
		}
	}
	
	public void pagarMensal() {
		double valor = 0;
		if (this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
		}
		if (this.isStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Pagamento da mendalidade de R$ " + valor + ", pago com sucesso.");
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossivel pagar.");
		}
	}
	
}
