import java.util.*;
public class smallandbig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the first no : ");
		a = scn.nextInt();
		System.out.println("\n Enter the second no : ");
		b = scn.nextInt();
		if(a > b) {
			System.out.println(a + " is greater ");
		}else {
			System.out.println(b + " is greater");
		}
	}

}
