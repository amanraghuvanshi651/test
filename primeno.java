import java.util.Scanner;
public class primeno {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n,m=0,flag=0;
		System.out.println("enter the no : ");
		n = scn.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println("not a prime no");
		}
		else {
			for(int i=2;i<m;i++)
			{
				if(n%i==0) {
					System.out.println("not a prime no");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("the n is a prime no");
		   }
	   }
	}
}
