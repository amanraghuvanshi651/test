package readFile;
import java.util.*;

public class myHashMapClass {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("england","london");
		map.put("fracne","paris");
		map.put("india","delhi");
		map.put("usa","wasington dc");
		map.put("Canada","ottawa");
		
		System.out.println(map);
		String capitalofUSA = map.get("usa");
		System.out.println(capitalofUSA);
	}

}
