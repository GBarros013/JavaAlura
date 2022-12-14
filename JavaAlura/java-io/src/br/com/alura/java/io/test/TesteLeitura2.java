package br.com.alura.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();
			
			String valorFormato = String.format("%s %d-%d %s: %08.2f", valor1, valor2, valor3, valor4, valor5);
			System.out.println(valorFormato);
			
			linhaScanner.close();
			
//				String[] valores = linha.split(",");
//				System.out.println(Arrays.toString(valores));
		}
		
		
		scanner.close();
	}

}
