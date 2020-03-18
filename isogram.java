import java.util.Scanner;
import java.lang.String;
import java.util.*;
public class isogram {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1;
		int len,flag = 0;
		System.out.println("enter the firdt string  : ");
		str1 = scn.nextLine();
		len = str1.length();
		char arry[] = str1.toCharArray();
		Arrays.sort(arry);
		for(int i=0; i <= len; i++) {   
			if(i == len-1) {
				break;
			} else if(arry[i]==arry[i+1]) {
				System.out.println(" \nthe word is not an isogram");
				flag = 1;
				break;
			}
		}
		System.out.println("\nthe flag = " + flag);
		if(flag == 0)
		{
			System.out.println("\nthe word is an isogram");
		}
	}
}
