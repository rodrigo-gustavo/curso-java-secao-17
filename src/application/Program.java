package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\Projetos Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		String[] lines = new String[] { "Testando escrita em arquivos", "Testando sintaxe do desenvolvimento em java", "Testando se o texto digitado aqui realmente será criado em um novo arquivo"};
		
		String path1 = "c:\\Projetos Java\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path1))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
