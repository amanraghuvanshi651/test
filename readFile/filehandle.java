package readFile;

import java.io.*;
import java.util.*;

public class filehandle {
	
	public static void main(String[] args) {
		
		try {
			
			File file = new File("data.txt");
			FileWriter write = new FileWriter("data.txt");
			
			// creating a file 
			if(file.createNewFile()) {
				System.out.println("File created : " + file.getName());
			}else {
				System.out.println("File already exist");
			}
			// writing in the file
			write.write("it is fun to play with files in java");
			write.close();System.out.println("Sucessfully written in the file");
			
			//reading from the file
			Scanner scn = new Scanner(file);
			while(scn.hasNextLine()) {
				String d = scn.nextLine();
				System.out.println(d);
			}
			scn.close();
			
			//deleting a file
			if (file.delete()){
				System.out.println("file deleted succesfully : "+file.getName());
			}else {
				System.out.println("Cant Delete the file !!!!!");
			}
			
			boolean flag = file.exists();
			
			if(flag == true) {
				System.out.println(file.getName() + " no longer exists");
			}else {
				System.out.println(file.getName() + " exists");
			}
		}catch(Exception e) {
			
				System.out.println("An error occured");
			
		}
			
		
	}
		

}
