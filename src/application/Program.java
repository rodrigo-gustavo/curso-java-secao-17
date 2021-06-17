package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
		
		//O parametro true rescreve o texto do vetor dentro do mesmo arquivo 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path1, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String x = sc.nextLine();
		
		File path4 = new File(x);
		
		System.out.println("getPath: " + path4.getPath());
		System.out.println("getParent: " + path4.getParent());
		System.out.println("getName: " + path4.getName());
		sc.close();
	}

}
