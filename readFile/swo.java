package readFile;

public class swo {
	
	public static void main(String[] args) {
		
		int x = 10 , y = 8;
		int a = x , b = y ;
		
		while(y != 0) {
			
			int borrow = (~x) & y;
			
			x = x ^ y;
			 
			y = borrow << 1;
		}
		
		
		System.out.println("the ans of (" + a + " - " + b + ") is :- " + x);
		
	}
	
}
