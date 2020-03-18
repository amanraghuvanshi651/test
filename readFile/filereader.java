package readFile;
import java.util.*;
import java.io.*;


public class filereader {
	
	public static void main(String[] args ){
		try {
		File file = new File("data.txt");
		Scanner scn = new Scanner(file);
		while(scn.hasNextLine()) {
			String str = scn.nextLine();
			System.out.println(str);
		}
		scn.close();
		}catch(FileNotFoundException e) {
			System.out.println("an error occourd");
		}
		
		
	}

}
