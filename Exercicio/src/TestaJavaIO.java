import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class TestaJavaIO {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("leitura.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while (linha!= null){
			bw.append(linha);
			bw.newLine();
			linha = br.readLine();
		}
		br.close();
		bw.close();
		
		//api que alto nivel
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream("saida2.txt");
		
		while(sc.hasNextLine()){
			String linha2 = sc.nextLine();
			ps.println(linha2);
		}
		
		ps.close();
		sc.close();
	}
}
