package Demo2;

import java.util.Scanner;

import Demo1.Operations;

public class Sample2 {

	public static void main(String args[])
	{
		Operations a = new Operations();
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int c= a.add(x, y);
		System.out.println(c);
		//
		//
		//
		//
		//

		System.out.println(a.add(8, 9));
		//
		//
		//
		//
		//
		System.out.println(a.add(9, 7));
		
		
	
	
	}
}
