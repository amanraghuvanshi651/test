
public class fabSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second = 1,next;
		System.out.println("\n" + first + "\n" + second);
		
		for(int i=0;i<=10;i++) {
			next = first+second;
			first = second;
			second = next;
			System.out.println("\n" + next);
		}
	}

}
