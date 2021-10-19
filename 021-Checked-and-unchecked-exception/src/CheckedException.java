//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;


public class CheckedException {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("/assets/file.txt"); 
		FileReader fr = new FileReader(file);
		
		System.out.println("Success");

	}

}
