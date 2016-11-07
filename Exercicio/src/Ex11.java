import java.io.PrintStream;

public class Ex11 {
	public static void main(String[] args) {
		String x = new String("Socorram-me, subi no ônibus em Marrocos");
		
		PrintStream saida = System.out;
		
		int l = x.length();
		
		for (int i = l-1; i > 0 ; i--) {
			saida.print(x.charAt(i));
		}
	}
}
