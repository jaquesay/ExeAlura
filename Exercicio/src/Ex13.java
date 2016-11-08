public class Ex13 {
	public static void main(String[] args) {
		String x = new String("Socorram-me, subi no ônibus em Marrocos");
	
		String[] s = x.split(" ");
		
		for (int i = s.length - 1; i >= 0; i--) {
	        System.out.print(s[i] + " ");
	    }
		System.out.println("");
	}
}
