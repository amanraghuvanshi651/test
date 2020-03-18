package readFile;
import java.util.*;
import java.io.*;

public class csvfilereader {
	
	public static void main(String[] args){
		
		String fileName = "Sacramentorealestatetransactions.csv";
		File file = new File(fileName);
		try {
			Scanner scn = new Scanner(file);
			while(scn.hasNext()) {
				String data = scn.next();
				String[] values = data.split(",");
				System.out.println(values[3]);
			}
			scn.close();
		}catch(FileNotFoundException e){
			
			System.out.println("An error occured");
		}
			
	}

}
