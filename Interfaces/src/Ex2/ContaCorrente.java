package Ex2;

public class ContaCorrente extends conta implements Tributavel {
	public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
