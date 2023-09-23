package Demo1;

public class StringDemo {

	public static void main(String[] args) {
	
		String s = "Dhivyan";
		String s1 = "Dhivyan   ";
		
		
		
	
		
		//String is an array of characters
		
		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		System.out.println(s.compareTo(s1));
		
		s.contains("z");
		
		System.out.println(s1.trim());
			

	}

}
