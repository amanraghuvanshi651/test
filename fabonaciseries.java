import java.util.Scanner;
public class fabonaciseries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,next,n;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter how digit of sreies you want to print");
		n = scn.nextInt();
		System.out.println(" " + first + " \n " + second);
		for(int i=0; i<n-2;i++)
		{
			next = first+second;
			System.out.println(" " + next);
			first = second;
			second = next;
		}
	}
}