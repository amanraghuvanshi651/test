import java.util.*;
public class linearsearch {
	
	//	Taking value from user
	private static int[] arryEnter(int n ) {
		int[] arry = new int[100];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no in array : ");
		for(int i = 0 ; i < n; i++) {
			System.out.println("enter " + (i+1) + " element : ");
			arry[i] = scn.nextInt();
		}
		return arry;
	}
	
	//	Function to searching using linear search
	private static int linear_search(int[] a, int f,int n) {
		int flag = 0 ,pos;
		for(int i = 0; i <= n; i++) {
			if(a[i]==f) {
				pos = i;
				System.out.println("the no is at : " + (pos+1));
				return 1;
			}
		}
		System.out.println("Element is not in the list");
		return 0;
 	}
	
	// Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, f, ans;
		int[] arr = new int[100];
		Scanner scn = new Scanner(System.in);
		System.out.println("How many no you want to enter : ");
		n = scn.nextInt();
		arr = arryEnter(n);
		System.out.println("Enter the no you want to find : ");
		f = scn.nextInt();
		linear_search(arr ,f,n);
	}

}
