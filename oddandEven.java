import java.util.*;
public class oddandEven {
	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter the no of your choise : ");
		n = scn.nextInt();
		if(n%2 == 0) {
			System.out.print("\n The no is even.....");
		}else {
			System.out.println("\n The no is odd.....");
		}
	}
}
