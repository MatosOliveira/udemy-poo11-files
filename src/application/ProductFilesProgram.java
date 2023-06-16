/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/**
 * Programa que le o caminho de um arquivo .csv contendo os dados de itens vendidos. 
 * 
 * Cada item possui um nome, preço unitário e quantidade, separados por vírgula. 
 * 
 * Um novo arquivo chamado "summary.csv" deve ser gerado, localizado em uma subpasta chamada "out" 
 * a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para 
 * aquele item (preço unitário multiplicado pela quantidade).
 * 
 * @author Matos - 16.06.2023
 *
 */
public class ProductFilesProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> listaProdutos = new ArrayList<>();
		
		System.out.println("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		//Arquivo de leitura
		String file = "\\Lista Produtos.csv";
		
		//Cria subpasta
		boolean success = new File(path + "\\out").mkdir();
		
		//Cria o novo arquivo
		String newFile = path + "\\out\\summary.csv";
		
		//Leitura do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path + file))){
			String line = br.readLine();
			
			while(line != null) {
				String[] produtos = line.split(";");
				
				String nome = produtos[0];
				double price = Double.parseDouble(produtos[1]);
				int qtde = Integer.parseInt(produtos[2]);
				
				listaProdutos.add(new Product(nome, price, qtde));
				
				line = br.readLine();
			}
			
			//Cria o novo arquivo
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
				
				for(Product p: listaProdutos) {
					bw.write(p.getName() + ";" + String.format("%.2f", p.total()));
					bw.newLine();
				}
				
				System.out.println(success == true ? "\nDiretorio criado com sucesso." : "Erro ao criar o diretorio.");
				
			} catch (IOException e) {
				System.out.println("Erro na escrita do arquivo: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
