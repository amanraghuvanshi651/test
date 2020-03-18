import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rev=0,d,temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the no : ");
		n = scn.nextInt();
		
		temp=n;
		while(n>0) {
			d = n%10;
			rev = (rev*10) + d;
			n = n/10;
		}
		System.out.println("\n the reverse of the no is : " + rev);
		if(temp==rev)
		{
			System.out.println("\n the no is palindrome");
		}
		else {
			System.out.println("\n the no is not a palindrome");
		}
	}
}
