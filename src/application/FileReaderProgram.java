/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe utilizada para leitura de arquivos
 * 
 * @author Matos - 16.06.2023
 *
 */
public class FileReaderProgram {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Temp\\text.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			
		} 

	}

}
