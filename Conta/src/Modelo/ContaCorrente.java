package Modelo;

public class ContaCorrente extends Conta{

	public ContaCorrente(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
		// TODO Auto-generated constructor stub
	}
	
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo += this.saldo * taxa*3;
	}

	
}
