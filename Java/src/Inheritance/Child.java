package Inheritance;

public class Child extends Father {
	
	int b = 10;
	
	String ss  ="Dhivyan";
	
	public void morning()
	{
		System.out.println("morning");
	}
	
	public void night()
	{
		System.out.println("night");
	}
	
	//Method OverRiding or Dynamic Binding
	@Override
	public void hello()
	{
		System.out.println("Hello world");
	}
	
	
	public static void main(String args[])
	{
		Child c = new Child();
		c.morning();
		c.night();
		System.out.println(c.b);
		System.out.println(c.ss);
		
		//No need to create object for the parent class
		/*Father f = new Father();
		f.hello();
		f.welcome();
		System.out.println(f.age);
		System.out.println(f.s);*/
		
// We can access the parent class methods and variables by using child class object 
		
		c.hello();
		c.welcome();
		System.out.println(c.age);
		System.out.println(c.s);	
	}
	
}
