import java.util.*;
public class BinarySearch {

	// Function to take input from user
	private static int[] EnterArray(int a) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i = 1 ; i <=a ; i++) {
			System.out.println("Enter "+ i +" no. ");
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	// Function of Binary
	
	public static int binary_search(int[] Arr ,int h , int l ,int f ) {
		System.out.println("Its working !!");
		int mid;
		mid = h+l/2;
		if(Arr[mid] == f) {
			System.out.println("the no is at " + mid + " position...........");
		}else if(f > Arr[mid]) {
			l = mid+1;
			mid = h+l/2;
			return binary_search(Arr , h , l , f);
		}else {
			h = mid-1;
			mid = h+l/2;
			return binary_search(Arr, h, l, f);
		}
		return 0;
	}
	
	
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = new int[100];
		int n,f,low,high;
		Scanner scn = new Scanner(System.in);
		System.out.println("How many no you want to take : ");
		n = scn.nextInt();
		high = n-1;
		low = 0;
		arry = EnterArray(n);
		System.out.println("Enter the no you want to enter : ");
		f = scn.nextInt();
		System.out.println(f);
		binary_search(arry, high , low , f);
	}

}

