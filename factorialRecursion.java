import java.util.*;
public class factorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1,n,i,F;
		Scanner scn = new Scanner(System.in);
		System.out.println("\n Enter the no : ");
		n = scn.nextInt();
		i=n;
		factNo(n,i,fact);
	}
	
	private static void factNo(int a , int i , int fact) {
			if(i >= 1) {
				fact = fact*i; 
				--i;
				factNo(a,i,fact);
			}else {
				System.out.println("the fact of "+ a + " is : " + fact);
			}
	}

}
