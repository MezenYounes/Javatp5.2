package tpfichier2;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\fichiers\\in.txt");
		BufferedReader bReader = new BufferedReader(new FileReader(inputFile));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom d'utilisateur (login) : ");
		String login = scanner.nextLine();
		System.out.println("Veuillez saisir votre mot de passe : ");
		String password = scanner.nextLine();
		String line;
		while ((line = bReader.readLine()) != null) {
			String[] t = line.split(" ");
			if (t[0].equals(login)&& t[1].equals(password)) {
				System.out.println("Authentification réussi ");
				break;}
			else {
				System.out.println("PB Authentification ");}
				
				
			}

		}


	
	
	
	
	
	}
