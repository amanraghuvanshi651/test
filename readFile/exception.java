package readFile;

public class exception {
	
	public static void main(String[] args) {
		
		try {
		int[] Numbers = {1,2,3,4,5,6};
		System.out.println(Numbers[10]);
		}catch(Exception e){
			System.out.println("Sonething went wrong !!!");
		}
	}

}
