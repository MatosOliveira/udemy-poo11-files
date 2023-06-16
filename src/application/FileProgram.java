/**
 * 
 */
package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe que realiza a leitura de um arquivo de texto
 * 
 * @author Matos - 16.06.2023
 *
 */
public class FileProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file = new File("C:\\Temp\\text.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
			
		} finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
