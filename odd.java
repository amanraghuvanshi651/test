import java.util.Scanner;
public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no : ");
		n = scn.nextInt();
		if(n%2==0)
		{
			System.out.println("the no is even");
		}
		else {
			System.out.println("the no is odd");
		}
	}

}
