package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) throws FileNotFoundException{
		String str = "";
		try {
			File testFile = new File("Desktop/OOP_Lab/OtherProjects/src/hust/soict/hedspi/garbage/test.txt");
			Scanner input = new Scanner(testFile);
			while(input.hasNext()) {
				str += input.next();
			}
			System.out.println(str);
			input.close();
	    } catch (FileNotFoundException e) {
		System.out.println("Error! Can't open this file!!!");
		e.printStackTrace();
	    }
	}
}
