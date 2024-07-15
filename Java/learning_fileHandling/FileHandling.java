package learning_fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File txtFile1= new File("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\filesToHandle\\file.txt");
		try {
			FileWriter writer= new FileWriter("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\filesToHandle\\file.txt");
			writer.write("This is the first file I'm handling \nI love java programming");
			writer.append("\nThis will always appear at the end since it was appended");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		if (txtFile1.exists()) {
			System.out.println(txtFile1.getName());
			System.out.println(txtFile1.getPath());
			System.out.println(txtFile1.getAbsolutePath());
			System.out.println(txtFile1.isFile());
		} else {
			System.out.println("We can't find what you've specified");
		}
		
		File txtFile2= new File("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\filesToHandle\\createdFile.txt");
		
		try {
			FileWriter writer2= new FileWriter("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\filesToHandle\\createdFile.txt");
			writer2.write("This is the first file I'm creating using Java \nAfter all, why not? Why shouldn't I? Why Shouldn't I write this useless line?");
			writer2.append("\nA file created by Omefome");
			writer2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader= new FileReader("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\filesToHandle\\createdFile.txt");
			int data=reader.read();
			while (data!=-1) {
				System.out.print((char)data);
				data =reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
