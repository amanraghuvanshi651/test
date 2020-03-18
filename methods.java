import java.util.*;
import java.lang.String;
public class methods {
	static void func1(String fname) {
		System.out.println(fname + " , hii there");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.println("enter your name : ");
			String s = scn.nextLine();
			func1(s);
	}

}
