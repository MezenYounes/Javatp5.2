package tpfichier2;
import java.io.*;

public class TestCopy {
public static void main(String[] args) throws IOException {
File inputFile = new File("D:\\fichiers\\in.txt");
File outputFile = new File("D:\\fichiers\\out.txt");

String line;
try (BufferedReader bReader = new BufferedReader(new FileReader(inputFile));
BufferedWriter bWriter = new BufferedWriter(new FileWriter(outputFile))) {
	while ((line = bReader.readLine()) != null) {
		bWriter.write(line);
		bWriter.newLine(); // Ajoute une nouvelle ligne après chaque ligne lue }
		System.out.println("Copie terminée avec succès.");
	}} catch (IOException e) { e.printStackTrace(); }}}

