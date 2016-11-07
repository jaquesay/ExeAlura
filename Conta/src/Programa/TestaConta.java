package Programa;
import Exceptions.ValorInvalidoException;
import Modelo.Conta;
import Modelo.ContaCorrente;
import Modelo.GuardadorDeObjetos;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("Mauricio", 123, 350.50);
		conta.imprime();

		ContaCorrente contaCorrente = new ContaCorrente("Ana", 124, 300.50);
		contaCorrente.atualiza(0.1);

		try {
			conta.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
        	System.out.println("teste");
        }

		conta.saca(200);
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
	    guardador.adicionaObjeto(conta);

	    // ...

	    // pega a conta referenciado como objeto
	    Conta contaResgatada = (Conta) guardador.pegaObjeto(0);

	    // será que posso invocar getSaldo em Object? : 
	    contaResgatada.getSaldo();
	    
	    System.out.println(conta); //imprime: Uma conta com valor: 100.
	    
	    Conta c1 = new ContaCorrente("Mauricio", 123, 350.50);
	    Conta c2 = new ContaCorrente("Mauricio", 123, 350.50);
	    if (c1.equals(c2)) {
	        System.out.println("objetos referenciados são iguais!");
	    }
	    
	}
}
