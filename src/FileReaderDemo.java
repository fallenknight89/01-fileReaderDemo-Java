import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File file  = new File("C:\\Users\\USER\\Desktop\\New folder\\Demo.txt");
		System.out.println("*************Contents of the File*******************");
		Scanner scan1 = new Scanner(file);
		while((scan1.hasNextLine())) {
			System.out.println(scan1.nextLine());	
		}
		System.out.println("****************File Details*****************");
		if(file.exists()) {
			System.out.println("File Name: "+ file.getName());
			System.out.println("Absolute Path: "+file.getAbsolutePath());
			System.out.println("Writeable: "+file.canWrite());
			System.out.println("File Size in bytes: "+file.length());
		}
		System.out.println("****************Writting File content in a different file*****************");
		Scanner scan = new Scanner(file);
		String fileContent = "";
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("C:\\Users\\USER\\Desktop\\New folder\\newDemo.txt");
		writer.write(fileContent);
		writer.close();
		
	}

}
