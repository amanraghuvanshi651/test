package readFile;

public class awo {
	
	public static void main(String[] args) {
		
		int x = 20, y =12;
		int a = x,b = y;
		while(y!=0)
		{
			int carry =  x & y;
			
			x = x ^ y;
			
			y = carry<<1;
		}
		
		System.out.println("the ans of (" + a + " + " + b + ") is :- " + x);
	}

}
