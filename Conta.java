package metodos;

import java.text.*;

public class Conta {
	
	private double saldo;
	private String tipo;
	
	public Conta(double valorInicial) {
		this.saldo = valorInicial;
		this.tipo = "Corrente";
		System.out.println("Conta Corrente");
	}
	
	public Conta(double valorInicial, String tipo) {
		this.saldo = valorInicial;
		this.tipo = tipo;
		System.out.println("Conta " + tipo);
		
	}
	
	public boolean depositar(double valor) {
		if (this.tipo.equalsIgnoreCase("Corrente") && valor > 1000) {
			System.out.println("Valor proíbido para contas do tipo: " + this.tipo);
			return false;
		} else if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return true;
			
		
		
	}
	
	public boolean sacar(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Faltou dinheiro");
			return false;
		}
	}
	
	public boolean trasferir(double valor, Conta contaDestino) {
		
		if (this.tipo.equalsIgnoreCase("Poupanca") 
				&& contaDestino.tipo.equalsIgnoreCase("Corrente")){
			System.out.println("Não é permitido transferir de contas do tipo " + this.tipo + 
					" Para contas do tipo " + contaDestino.tipo);
			return false;
		} else if (this.saldo > valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("Valor transferido: " + valor);
			return true;
			
		} else {
			System.out.println("Valor insuficiente para transferencia.");
			return false;
		}
			
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTipoConta(){
		return this.tipo;
	}
	
	

}

class testaConta {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(4000); //corrente
		Conta c2 = new Conta(3000, "Poupanca");
		Conta c3 = new Conta(100); //corrente
		
		
		c1.sacar(1000);
		c2.sacar(1000);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		System.out.println(c3.getSaldo());
		
			
		
		
	}
}
