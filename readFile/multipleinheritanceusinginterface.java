package readFile;

public class multipleinheritanceusinginterface implements i1,i2{

	@Override
	public void m1() {
		
		System.out.println("m1 is working");
		System.out.println("value of i in i1 is : " + i1.i);
		System.out.println("value of i in i2 is : " + i2.i);
		
	}
	
	public static void main(String[] args) {
		
		multipleinheritanceusinginterface obj = new multipleinheritanceusinginterface();
		
		obj.m1();
		
	}
	

}
