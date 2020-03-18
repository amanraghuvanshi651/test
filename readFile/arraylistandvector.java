package readFile;

import java.util.ArrayList;
import java.util.Vector;

public class arraylistandvector {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		
		System.out.println(v.capacity());
		
		v.remove(2);
		System.out.println(v);
		
		for(Object i : v) {
			System.out.println(i);
		}
		
		ArrayList<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(1);
		
		System.out.println(values);
	}

}
