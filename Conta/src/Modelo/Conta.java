package Modelo;
import Exceptions.ValorInvalidoException;

public abstract class Conta {
	protected double saldo;
	private String nome;
	private int agencia;

	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	/**
	 * realiza um saque 
	 * @param valor a ser sacdo
	 * @return Exception case seja insuficiente
	 */
	public boolean saca(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saque invalido");
			return false;
        }
        else {
            this.saldo = this.saldo - valor;
            System.out.println("Saldo: "+ this.saldo);
			return true;
        }
		
    }
	
	public void deposita(double valor) {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor;        
        }        
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void imprime() {
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);
	}

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "Uma conta com valor: " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
        if (this.saldo == outraConta.saldo && this.nome == outraConta.nome) {
            return true;
        }
        return false;
	}
}
