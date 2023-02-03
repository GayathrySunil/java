import java.io.*;
import java.lang.*;
class demo
{
	demo()
	{
		System.out.println("Empty constructor called");
	}
	demo(int a,String b)
	{
		System.out.println("Parameterised constructor called");
		System.out.println(a);
		System.out.println(b);
	}
} 
	
	class Constructor
	{
		public static void main(String args[])
		{
			demo d1=new demo();
			demo d2=new demo(32,"Gayathry Sunil");
		}
	}