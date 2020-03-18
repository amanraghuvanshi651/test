import java.util.*;
public class printTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the no : ");
		n = scn.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
