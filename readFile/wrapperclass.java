package readFile;

import java.lang.*;

public class wrapperclass {
	
	public static void main(String[] args) {
		int i = 100;
		int j = 99;
		// primitive to wrapper
		Integer a = Integer.valueOf(i);
		Integer b = j;
		
		//wrapper to primitive
		Integer k = new Integer(10);
		int l = k.intValue();
		
		System.out.println("Boxing done the value in obj a is : "+a);
		System.out.println("AutoBoxing done the value in obj b is : "+b);
		
		System.out.println("UnBoxing done the value in obj l is : "+l);
	}
	
}
