package Abstraction;

public class Base implements InterfaceDemo{

	
	public void add() {
		
		System.out.println("add");
	}


	public void sub() {
		System.out.println("sub");
		
	}

	public static void main(String args[])
	{
		Base b = new Base();
		b.add();
		b.sub();
	}
	
}
