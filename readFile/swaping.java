package readFile;

public class swaping {
	public static void main(String args[]) {
		
		int a,b;
		a = 10;
		b = 12;
		System.out.println( a + " " + b);
		swap(a,b);
		
	}
	
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println(x + " " + y);
	}
}
