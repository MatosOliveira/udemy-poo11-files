/**
 * 
 */
package application;

import java.io.File;
import java.util.Scanner;

/**
 * Classe para manipulacao de arquivos
 * 
 * @author Matos - 16.06.2023
 *
 */
public class FilesAndFoldersProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho principal: ");
		String pathFolders = sc.nextLine();
		
		File path = new File(pathFolders);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("\nFOLDERS:");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES: ");
		for(File file: files) {
			System.out.println(file);
		}
		
		boolean success = new File(pathFolders + "\\diversos").mkdir();
		System.out.println("\nDirectory created successfully: " + success);
		
		sc.close();

	}

}
