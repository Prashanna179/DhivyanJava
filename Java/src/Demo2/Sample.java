package Demo2;

import Demo1.Operations;

public class Sample {

	public static void h()
	{
		Operations a = new Operations();
		System.out.println(a.add(4, 5));
	}
	public static void main(String[] args) {
		
		//Non Static Method Access
		Operations g = new Operations();
		System.out.println(g.add(3, 4));
		
		//Static Method Access
		System.out.println(Operations.sub(5, 2));
		
		Sample.h();
		
	}

}
