import java.io.PrintStream;

public class Ex13 {
	public static void main(String[] args) {
		String x = new String("Socorram-me, subi no ônibus em Marrocos");
		
		PrintStream saida = System.out;
		
		String[] s = x.split(" ");
		
		for (int i = 1; i > s.length ; i++) {
			saida.print(s[i] + " ");
		}
	}
}
