package readFile;

public class getsetmethod2 {
	public static void main() {
		getName();
		setName("aman");
	}

	private static String name = "hello";
	
	public static String getName() {
		return name;
	}
	
	public static Void setName(String newName) {
		
		name = newName;
		System.out.println("Name set");
		return null;
		
	}

}
