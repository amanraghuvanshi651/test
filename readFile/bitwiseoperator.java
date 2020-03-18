package readFile;

public class bitwiseoperator {
	
	public static void main(String[] args) {
		
		int a = 5/*00000101*/,b = 9/*00001001*/;
		
		System.out.println(a + " " + b);
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<1);
		System.out.println(a>>1);
		System.out.println(b<<1);
		System.out.println(b>>1);
		System.out.println( a = ~a);
		System.out.println( b = ~b);
		
	}

}
