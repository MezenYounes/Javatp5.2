package tpfichier2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class exercice3 {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\fichiers\\in.txt");
		BufferedReader bReader = new BufferedReader(new FileReader(inputFile));
		int l=0;
		int w=0;
		int c=0;
		String line;
		while ((line = bReader.readLine()) != null) {
			l=l+1;
			StringTokenizer s=new StringTokenizer(line);
			w+=s.countTokens();
			c+=line.length();
			
			
			
		}
		System.out.println("nombre ligne "+l);
		System.out.println("nombre mot "+w);
		System.out.println("nombre caractere "+c);

}}
