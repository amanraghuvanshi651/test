package readFile;

public class factroil {
		
	public static void main(String args[]) {
		
		int a = 5;
		factorial(a);
		
	}
	
	public static void factorial(int a) {
		int fact = 1;
		for(int i=1; i<=a;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
}
