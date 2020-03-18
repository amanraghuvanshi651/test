import java.util.*;
public class chkInt {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no : ");
		int n = chkInt();
		System.out.println("you entered = " + n);
	}
	public static int chkInt() {
		while(true) {
			try {return scn.nextInt(); }
			catch(InputMismatchException e){
			scn.next();
			System.out.println("thats not an integer !! " + "try again : ");
			}
		}
	}

}
