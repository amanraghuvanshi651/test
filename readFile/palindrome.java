package readFile;

public class palindrome {
	
	public static void main(String args[]) {
		
		int n = 757;
		int r ,sum=0,temp;
		
		temp = n;
		
		while(n>0) {
			r = n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("the no is palindrome!");
		}else {
			System.out.println("the no is not palindrome!");
		}
	}

}
