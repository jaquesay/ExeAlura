package Modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		this.saldo += this.saldo * taxa *2;
	}
	
//	public void atualiza(double taxa) {
//		// TODO Auto-generated method stub
//		this.saldo += this.saldo * taxa *2;
//	}

}
