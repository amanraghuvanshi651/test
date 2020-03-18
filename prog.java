import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1,n;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the value : ");
		n = scn.nextInt();
		for (int i = 1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of the no. is : " +fact );
	}

}
