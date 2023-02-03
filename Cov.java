import java.io.*;
class A
{
	A disp()
		{
			System.out.println("AAA disp");
			return(this);
		}
}
	class B extends A
		{
			B disp()
			{
			System.out.println("BBB disp");
			return(this);
			}
		}
	
	class Cov
	{
		public static void main(String args[])
		{
			A a=new A();
			a=a.disp();
			B b=new B();
			b=b.disp();
		}
	}
	
	
