
public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 0;i<=n;i++) {
			System.out.print("\n");
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}

}
