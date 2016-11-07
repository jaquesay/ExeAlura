package Modelo;
public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("===============================");
		// aqui voc� imprime o saldo anterior
		System.out.println(c.getSaldo());
		// atualiza a conta com a taxa selic,
		c.atualiza(this.selic);
		// e depois imprime o saldo final
		System.out.println("Saldo atualizado: " + c.getSaldo());
		// lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.getSaldo();
	}

	// outros m�todos, colocar o getter para saldoTotal!
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
