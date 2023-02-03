import java.io.*;
import java.lang.*;
class Test<T>
{
	T obj;
	Test(T obj)
	{
		this.obj=obj;
	}
		public T getObject()
			{
				return this.obj;
			}
}
class Generic
	{
		public static void main(String args[])
		{
			String s;
			int n;
			try{
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter an integer:");
			n=Integer.parseInt(din.readLine());
			Test<Integer> iObj=new Test<Integer>(n);
			System.out.println("The Integer is: "+iObj.getObject());
			System.out.println("Enter a string:");
			s=din.readLine();
			Test<String> sObj=new Test<String>(s);
			System.out.println("The String is: "sObj.getObject());
			}catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
