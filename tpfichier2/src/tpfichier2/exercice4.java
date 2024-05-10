package tpfichier2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exercice4 {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\fichiers\\users.txt");
		File outputFile = new File("D:\\fichiers\\userscrypppp.txt");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        
        int c;
        int k;

        while ((c = reader.read()) != -1) {
            k=c;
            k++;
            writer.write(k);
        }
    

}}
