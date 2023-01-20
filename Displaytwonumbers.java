import java.io.*;
class Displaytwonumbers
{
	public static void main(String args[])
	{
		int i=0,count=0,prod=1,x;
		String ele;
 
		count=args.length;
 
		while(i<count)
		{
			ele=args[i];
 
			x=Integer.parseInt(ele);
			prod=prod*x;
			i++;
		}
 
		System.out.println("The product is " +prod);
	}
}