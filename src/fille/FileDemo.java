package fille;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// using File class we can create file / folder
		// delete fiel / folder
		// rename file / folder
		// list out files of folder
		// check attributes of file / folder -> read only , hidden
		// size
		// we need to always import class from io package when we deal with file

		File f = new File("d:\\temp\\yashvi.txt");// path of file / directory
		// above line will not create file it just refer that path
		try {
			if (f.exists() == true) {
				System.out.println("Alread Present ");
			} else {
				System.out.println("New File Created");
				f.createNewFile(); // File -> path not exists -> security -> memory
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(f.length()); // returns num of bytes

		System.out.println(f.isFile());// true if f is pointing to file
		System.out.println(f.isDirectory());// true if f is pointing to directory
		
		File d = new File("d:\\temp\\yashvi");
		d.mkdir(); // create folder / directory 
		File tmp = new File("d://temp");
		System.out.println(tmp.isDirectory());
		String allData[] = tmp.list(); 
		for(String s:allData) {
			System.out.println(s);
		}
		
		
	}
}
