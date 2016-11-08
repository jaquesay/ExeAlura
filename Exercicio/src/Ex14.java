
public class Ex14 {
	public static void main(String[] args) {
		String x = new String("Socorram-me, subi no ônibus em Marrocos");
	
		String[] s = x.split(" ");
		StringBuffer strBuffer = new StringBuffer();
		
		for (int i = s.length - 1; i >= 0; i--) {
			strBuffer.append(s[i] + " ");
	    }
		System.out.println(strBuffer);
		
		StringBuilder invertido = new StringBuilder(x).reverse();
        System.out.println(invertido);
        
        String numero = "762";
        System.out.println("Imprimindo a string: " + numero);

        int resultado = converteParaInt(numero);
        System.out.println("Imprimindo o int: " + resultado);
    }

    private static int converteParaInt(String numero) {
        int resultado = 0;
        while (numero.length() > 0) {
            char algarismo = numero.charAt(0);
            resultado = resultado * 10 + (algarismo - '0');
            System.out.println(resultado);
            numero = numero.substring(1);
        }
        return resultado;
    }
}
