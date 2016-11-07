import java.io.PrintStream;

public class TestaInteger {
	
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);
	    
	    PrintStream saida = System.out;
	    
	    String s1 = new String("10");
	    //String s2 = new String("2t");
	    
	    x1 = Integer.parseInt(s1);
	    //x2 = Integer.parseInt(s2);
	    
	    if (x1.equals(x2)) {
	    	saida.println("igual");
	    } else {
	    	saida.println("diferente");
	    }
	}
}
