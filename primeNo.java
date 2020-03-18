import java.util.*;
public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,flag = 0,m=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no : ");
		n = scn.nextInt();
		m = n/2;
		for(int i=2; i<=100 ; i++) {
			System.out.println("for loop is working");
			if(n%i==0) {
				System.out.println(n + " is not a prime no !");
				flag = 1;
				break;
			}else {
				continue;
			}
		}
		if(flag == 0) {
			System.out.println(n + " is a prime no .....");
		}
	}

}
