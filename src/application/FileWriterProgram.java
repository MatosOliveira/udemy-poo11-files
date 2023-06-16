/**
 * 
 */
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Classe para criacao de arquivos
 * 
 * @author Matos - 16.06.2023
 *
 */
public class FileWriterProgram {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		String[] saudacoes = new String[] {"Oi", "Ola", "Bom dia", "Boa tarde", "Boa noite", "Tchau"};
		String path = "C:\\Temp\\saudacoes.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for(String line : saudacoes) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
